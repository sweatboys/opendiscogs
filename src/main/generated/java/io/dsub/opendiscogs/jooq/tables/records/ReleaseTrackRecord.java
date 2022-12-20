/*
 * This file is generated by jOOQ.
 */
package io.dsub.opendiscogs.jooq.tables.records;


import io.dsub.opendiscogs.jooq.tables.ReleaseTrack;
import java.time.LocalDateTime;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ReleaseTrackRecord extends UpdatableRecordImpl<ReleaseTrackRecord> implements
    Record6<Integer, String, String, String, Long, LocalDateTime> {

  private static final long serialVersionUID = 1L;

  /**
   * Create a detached ReleaseTrackRecord
   */
  public ReleaseTrackRecord() {
    super(ReleaseTrack.RELEASE_TRACK);
  }

  /**
   * Create a detached, initialised ReleaseTrackRecord
   */
  public ReleaseTrackRecord(Integer releaseId, String duration, String position, String title,
      Long titleHash, LocalDateTime updatedAt) {
    super(ReleaseTrack.RELEASE_TRACK);

    setReleaseId(releaseId);
    setDuration(duration);
    setPosition(position);
    setTitle(title);
    setTitleHash(titleHash);
    setUpdatedAt(updatedAt);
  }

  /**
   * Create a detached, initialised ReleaseTrackRecord
   */
  public ReleaseTrackRecord(io.dsub.opendiscogs.jooq.tables.pojos.ReleaseTrack value) {
    super(ReleaseTrack.RELEASE_TRACK);

    if (value != null) {
      setReleaseId(value.getReleaseId());
      setDuration(value.getDuration());
      setPosition(value.getPosition());
      setTitle(value.getTitle());
      setTitleHash(value.getTitleHash());
      setUpdatedAt(value.getUpdatedAt());
    }
  }

  /**
   * Getter for <code>public.release_track.release_id</code>.
   */
  public Integer getReleaseId() {
    return (Integer) get(0);
  }

  /**
   * Setter for <code>public.release_track.release_id</code>.
   */
  public ReleaseTrackRecord setReleaseId(Integer value) {
    set(0, value);
    return this;
  }

  /**
   * Getter for <code>public.release_track.duration</code>.
   */
  public String getDuration() {
    return (String) get(1);
  }

  /**
   * Setter for <code>public.release_track.duration</code>.
   */
  public ReleaseTrackRecord setDuration(String value) {
    set(1, value);
    return this;
  }

  /**
   * Getter for <code>public.release_track.position</code>.
   */
  public String getPosition() {
    return (String) get(2);
  }

  /**
   * Setter for <code>public.release_track.position</code>.
   */
  public ReleaseTrackRecord setPosition(String value) {
    set(2, value);
    return this;
  }

  /**
   * Getter for <code>public.release_track.title</code>.
   */
  public String getTitle() {
    return (String) get(3);
  }

  /**
   * Setter for <code>public.release_track.title</code>.
   */
  public ReleaseTrackRecord setTitle(String value) {
    set(3, value);
    return this;
  }

  /**
   * Getter for <code>public.release_track.title_hash</code>. fnv32 encoded hash from title
   */
  public Long getTitleHash() {
    return (Long) get(4);
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  /**
   * Setter for <code>public.release_track.title_hash</code>. fnv32 encoded hash from title
   */
  public ReleaseTrackRecord setTitleHash(Long value) {
    set(4, value);
    return this;
  }

  // -------------------------------------------------------------------------
  // Record6 type implementation
  // -------------------------------------------------------------------------

  /**
   * Getter for <code>public.release_track.updated_at</code>. created time
   */
  public LocalDateTime getUpdatedAt() {
    return (LocalDateTime) get(5);
  }

  /**
   * Setter for <code>public.release_track.updated_at</code>. created time
   */
  public ReleaseTrackRecord setUpdatedAt(LocalDateTime value) {
    set(5, value);
    return this;
  }

  @Override
  public Record2<Integer, Long> key() {
    return (Record2) super.key();
  }

  @Override
  public Row6<Integer, String, String, String, Long, LocalDateTime> fieldsRow() {
    return (Row6) super.fieldsRow();
  }

  @Override
  public Row6<Integer, String, String, String, Long, LocalDateTime> valuesRow() {
    return (Row6) super.valuesRow();
  }

  @Override
  public Field<Integer> field1() {
    return ReleaseTrack.RELEASE_TRACK.RELEASE_ID;
  }

  @Override
  public Field<String> field2() {
    return ReleaseTrack.RELEASE_TRACK.DURATION;
  }

  @Override
  public Field<String> field3() {
    return ReleaseTrack.RELEASE_TRACK.POSITION;
  }

  @Override
  public Field<String> field4() {
    return ReleaseTrack.RELEASE_TRACK.TITLE;
  }

  @Override
  public Field<Long> field5() {
    return ReleaseTrack.RELEASE_TRACK.TITLE_HASH;
  }

  @Override
  public Field<LocalDateTime> field6() {
    return ReleaseTrack.RELEASE_TRACK.UPDATED_AT;
  }

  @Override
  public Integer component1() {
    return getReleaseId();
  }

  @Override
  public String component2() {
    return getDuration();
  }

  @Override
  public String component3() {
    return getPosition();
  }

  @Override
  public String component4() {
    return getTitle();
  }

  @Override
  public Long component5() {
    return getTitleHash();
  }

  @Override
  public LocalDateTime component6() {
    return getUpdatedAt();
  }

  @Override
  public Integer value1() {
    return getReleaseId();
  }

  @Override
  public String value2() {
    return getDuration();
  }

  @Override
  public String value3() {
    return getPosition();
  }

  @Override
  public String value4() {
    return getTitle();
  }

  @Override
  public Long value5() {
    return getTitleHash();
  }

  @Override
  public LocalDateTime value6() {
    return getUpdatedAt();
  }

  @Override
  public ReleaseTrackRecord value1(Integer value) {
    setReleaseId(value);
    return this;
  }

  @Override
  public ReleaseTrackRecord value2(String value) {
    setDuration(value);
    return this;
  }

  @Override
  public ReleaseTrackRecord value3(String value) {
    setPosition(value);
    return this;
  }

  @Override
  public ReleaseTrackRecord value4(String value) {
    setTitle(value);
    return this;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  @Override
  public ReleaseTrackRecord value5(Long value) {
    setTitleHash(value);
    return this;
  }

  @Override
  public ReleaseTrackRecord value6(LocalDateTime value) {
    setUpdatedAt(value);
    return this;
  }

  @Override
  public ReleaseTrackRecord values(Integer value1, String value2, String value3, String value4,
      Long value5, LocalDateTime value6) {
    value1(value1);
    value2(value2);
    value3(value3);
    value4(value4);
    value5(value5);
    value6(value6);
    return this;
  }
}