package io.dsub.sweatboys.opendiscogs.api.artist.service;

import static org.springframework.data.domain.ExampleMatcher.matchingAll;

import io.dsub.sweatboys.opendiscogs.api.artist.domain.Artist;
import io.dsub.sweatboys.opendiscogs.api.artist.domain.ArtistRepository;
import io.dsub.sweatboys.opendiscogs.api.artist.dto.ArtistDetailDTO;
import io.dsub.sweatboys.opendiscogs.api.artist.query.ArtistQuery;
import io.dsub.sweatboys.opendiscogs.api.core.exception.ItemNotFoundException;
import io.dsub.sweatboys.opendiscogs.api.core.response.PagedResponseDTO;
import io.dsub.sweatboys.opendiscogs.api.core.service.PagingService;
import java.util.function.Function;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ArtistService implements PagingService {

  private final ArtistRepository artistRepository;

  public Mono<PagedResponseDTO<Artist>> findArtists(ArtistQuery query, Pageable pageable) {
    return artistRepository.findAllBy(Example.of(query.toArtist(),
        matchingAll()
            .withStringMatcher(StringMatcher.CONTAINING)
            .withIgnoreCase()
            .withIgnoreNullValues()), pageable)
        .flatMap(fromPageToResponseDTO());
  }

  private Function<Page<Artist>, Mono<PagedResponseDTO<Artist>>> fromPageToResponseDTO() {
    return PagedResponseDTO::fromPage;
  }

  public Mono<ResponseEntity<ArtistDetailDTO>> getArtist(long id) {
    return artistRepository.findById(id)
        .map(ResponseEntity::ok)
        .switchIfEmpty(getError(id));
  }

  private static Mono<ResponseEntity<ArtistDetailDTO>> getError(long id) {
    return Mono.error(new ItemNotFoundException("artist", id));
  }
}
