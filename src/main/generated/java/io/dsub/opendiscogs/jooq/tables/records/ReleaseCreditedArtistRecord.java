/*
 * This file is generated by jOOQ.
 */
package io.dsub.opendiscogs.jooq.tables.records;


import io.dsub.opendiscogs.jooq.tables.ReleaseCreditedArtist;
import java.time.LocalDateTime;
import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ReleaseCreditedArtistRecord extends
    UpdatableRecordImpl<ReleaseCreditedArtistRecord> implements
    Record5<Integer, Integer, Long, String, LocalDateTime> {

  private static final long serialVersionUID = 1L;

  /**
   * Create a detached ReleaseCreditedArtistRecord
   */
  public ReleaseCreditedArtistRecord() {
    super(ReleaseCreditedArtist.RELEASE_CREDITED_ARTIST);
  }

  /**
   * Create a detached, initialised ReleaseCreditedArtistRecord
   */
  public ReleaseCreditedArtistRecord(Integer releaseId, Integer artistId, Long roleHash,
      String role, LocalDateTime updatedAt) {
    super(ReleaseCreditedArtist.RELEASE_CREDITED_ARTIST);

    setReleaseId(releaseId);
    setArtistId(artistId);
    setRoleHash(roleHash);
    setRole(role);
    setUpdatedAt(updatedAt);
  }

  /**
   * Create a detached, initialised ReleaseCreditedArtistRecord
   */
  public ReleaseCreditedArtistRecord(
      io.dsub.opendiscogs.jooq.tables.pojos.ReleaseCreditedArtist value) {
    super(ReleaseCreditedArtist.RELEASE_CREDITED_ARTIST);

    if (value != null) {
      setReleaseId(value.getReleaseId());
      setArtistId(value.getArtistId());
      setRoleHash(value.getRoleHash());
      setRole(value.getRole());
      setUpdatedAt(value.getUpdatedAt());
    }
  }

  /**
   * Getter for <code>public.release_credited_artist.release_id</code>.
   */
  public Integer getReleaseId() {
    return (Integer) get(0);
  }

  /**
   * Setter for <code>public.release_credited_artist.release_id</code>.
   */
  public ReleaseCreditedArtistRecord setReleaseId(Integer value) {
    set(0, value);
    return this;
  }

  /**
   * Getter for <code>public.release_credited_artist.artist_id</code>.
   */
  public Integer getArtistId() {
    return (Integer) get(1);
  }

  /**
   * Setter for <code>public.release_credited_artist.artist_id</code>.
   */
  public ReleaseCreditedArtistRecord setArtistId(Integer value) {
    set(1, value);
    return this;
  }

  /**
   * Getter for <code>public.release_credited_artist.role_hash</code>. fnv32 encoded hash from role
   */
  public Long getRoleHash() {
    return (Long) get(2);
  }

  /**
   * Setter for <code>public.release_credited_artist.role_hash</code>. fnv32 encoded hash from role
   */
  public ReleaseCreditedArtistRecord setRoleHash(Long value) {
    set(2, value);
    return this;
  }

  /**
   * Getter for <code>public.release_credited_artist.role</code>. role of an artist for a release
   */
  public String getRole() {
    return (String) get(3);
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  /**
   * Setter for <code>public.release_credited_artist.role</code>. role of an artist for a release
   */
  public ReleaseCreditedArtistRecord setRole(String value) {
    set(3, value);
    return this;
  }

  // -------------------------------------------------------------------------
  // Record5 type implementation
  // -------------------------------------------------------------------------

  /**
   * Getter for <code>public.release_credited_artist.updated_at</code>. created time
   */
  public LocalDateTime getUpdatedAt() {
    return (LocalDateTime) get(4);
  }

  /**
   * Setter for <code>public.release_credited_artist.updated_at</code>. created time
   */
  public ReleaseCreditedArtistRecord setUpdatedAt(LocalDateTime value) {
    set(4, value);
    return this;
  }

  @Override
  public Record3<Integer, Integer, Long> key() {
    return (Record3) super.key();
  }

  @Override
  public Row5<Integer, Integer, Long, String, LocalDateTime> fieldsRow() {
    return (Row5) super.fieldsRow();
  }

  @Override
  public Row5<Integer, Integer, Long, String, LocalDateTime> valuesRow() {
    return (Row5) super.valuesRow();
  }

  @Override
  public Field<Integer> field1() {
    return ReleaseCreditedArtist.RELEASE_CREDITED_ARTIST.RELEASE_ID;
  }

  @Override
  public Field<Integer> field2() {
    return ReleaseCreditedArtist.RELEASE_CREDITED_ARTIST.ARTIST_ID;
  }

  @Override
  public Field<Long> field3() {
    return ReleaseCreditedArtist.RELEASE_CREDITED_ARTIST.ROLE_HASH;
  }

  @Override
  public Field<String> field4() {
    return ReleaseCreditedArtist.RELEASE_CREDITED_ARTIST.ROLE;
  }

  @Override
  public Field<LocalDateTime> field5() {
    return ReleaseCreditedArtist.RELEASE_CREDITED_ARTIST.UPDATED_AT;
  }

  @Override
  public Integer component1() {
    return getReleaseId();
  }

  @Override
  public Integer component2() {
    return getArtistId();
  }

  @Override
  public Long component3() {
    return getRoleHash();
  }

  @Override
  public String component4() {
    return getRole();
  }

  @Override
  public LocalDateTime component5() {
    return getUpdatedAt();
  }

  @Override
  public Integer value1() {
    return getReleaseId();
  }

  @Override
  public Integer value2() {
    return getArtistId();
  }

  @Override
  public Long value3() {
    return getRoleHash();
  }

  @Override
  public String value4() {
    return getRole();
  }

  @Override
  public LocalDateTime value5() {
    return getUpdatedAt();
  }

  @Override
  public ReleaseCreditedArtistRecord value1(Integer value) {
    setReleaseId(value);
    return this;
  }

  @Override
  public ReleaseCreditedArtistRecord value2(Integer value) {
    setArtistId(value);
    return this;
  }

  @Override
  public ReleaseCreditedArtistRecord value3(Long value) {
    setRoleHash(value);
    return this;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  @Override
  public ReleaseCreditedArtistRecord value4(String value) {
    setRole(value);
    return this;
  }

  @Override
  public ReleaseCreditedArtistRecord value5(LocalDateTime value) {
    setUpdatedAt(value);
    return this;
  }

  @Override
  public ReleaseCreditedArtistRecord values(Integer value1, Integer value2, Long value3,
      String value4, LocalDateTime value5) {
    value1(value1);
    value2(value2);
    value3(value3);
    value4(value4);
    value5(value5);
    return this;
  }
}
