package io.dsub.sweatboys.opendiscogs.api.release.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dsub.sweatboys.opendiscogs.api.core.entity.BaseEntity;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.With;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@With
@Getter
@Builder
@Table(name = "release")
@AllArgsConstructor
public class Release extends BaseEntity<Long> {
  @Id
  @Min(1)
  @Column("id")
  @JsonProperty("id")
  private final Long id;

  @Column("title")
  @JsonProperty("title")
  private final String title;

  @Column("country")
  @JsonProperty("country")
  private final String country;

  @Column("data_quality")
  @JsonProperty("data_quality")
  private final String dataQuality;

  @Column("released_year")
  @JsonProperty("released_year")
  private final Integer releasedYear;

  @Column("released_month")
  @JsonProperty("released_month")
  private final Integer releasedMonth;

  @Column("released_day")
  @JsonProperty("released_day")
  private final Integer releasedDay;

  @Column("listed_release_date")
  @JsonProperty("listed_release_date")
  private final String listedReleaseDate;

  @Column("is_master")
  @JsonProperty("is_master")
  private final Boolean isMaster;

  @Column("notes")
  @JsonProperty("notes")
  private final String notes;

  @Column("status")
  @JsonProperty("status")
  private final Boolean status;
}