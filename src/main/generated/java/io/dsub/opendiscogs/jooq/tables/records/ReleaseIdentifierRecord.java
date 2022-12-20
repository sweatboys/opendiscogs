/*
 * This file is generated by jOOQ.
 */
package io.dsub.opendiscogs.jooq.tables.records;


import io.dsub.opendiscogs.jooq.tables.ReleaseIdentifier;
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
public class ReleaseIdentifierRecord extends UpdatableRecordImpl<ReleaseIdentifierRecord> implements
    Record6<Integer, String, String, String, Long, LocalDateTime> {

  private static final long serialVersionUID = 1L;

  /**
   * Create a detached ReleaseIdentifierRecord
   */
  public ReleaseIdentifierRecord() {
    super(ReleaseIdentifier.RELEASE_IDENTIFIER);
  }

  /**
   * Create a detached, initialised ReleaseIdentifierRecord
   */
  public ReleaseIdentifierRecord(Integer releaseId, String description, String type, String value,
      Long identifierHash, LocalDateTime updatedAt) {
    super(ReleaseIdentifier.RELEASE_IDENTIFIER);

    setReleaseId(releaseId);
    setDescription(description);
    setType(type);
    setValue(value);
    setIdentifierHash(identifierHash);
    setUpdatedAt(updatedAt);
  }

  /**
   * Create a detached, initialised ReleaseIdentifierRecord
   */
  public ReleaseIdentifierRecord(io.dsub.opendiscogs.jooq.tables.pojos.ReleaseIdentifier value) {
    super(ReleaseIdentifier.RELEASE_IDENTIFIER);

    if (value != null) {
      setReleaseId(value.getReleaseId());
      setDescription(value.getDescription());
      setType(value.getType());
      setValue(value.getValue());
      setIdentifierHash(value.getIdentifierHash());
      setUpdatedAt(value.getUpdatedAt());
    }
  }

  /**
   * Getter for <code>public.release_identifier.release_id</code>.
   */
  public Integer getReleaseId() {
    return (Integer) get(0);
  }

  /**
   * Setter for <code>public.release_identifier.release_id</code>.
   */
  public ReleaseIdentifierRecord setReleaseId(Integer value) {
    set(0, value);
    return this;
  }

  /**
   * Getter for <code>public.release_identifier.description</code>.
   */
  public String getDescription() {
    return (String) get(1);
  }

  /**
   * Setter for <code>public.release_identifier.description</code>.
   */
  public ReleaseIdentifierRecord setDescription(String value) {
    set(1, value);
    return this;
  }

  /**
   * Getter for <code>public.release_identifier.type</code>.
   */
  public String getType() {
    return (String) get(2);
  }

  /**
   * Setter for <code>public.release_identifier.type</code>.
   */
  public ReleaseIdentifierRecord setType(String value) {
    set(2, value);
    return this;
  }

  /**
   * Getter for <code>public.release_identifier.value</code>.
   */
  public String getValue() {
    return (String) get(3);
  }

  /**
   * Setter for <code>public.release_identifier.value</code>.
   */
  public ReleaseIdentifierRecord setValue(String value) {
    set(3, value);
    return this;
  }

  /**
   * Getter for <code>public.release_identifier.identifier_hash</code>. fnv32 encoded hash from
   * string which is description, type, value appended in order
   */
  public Long getIdentifierHash() {
    return (Long) get(4);
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  /**
   * Setter for <code>public.release_identifier.identifier_hash</code>. fnv32 encoded hash from
   * string which is description, type, value appended in order
   */
  public ReleaseIdentifierRecord setIdentifierHash(Long value) {
    set(4, value);
    return this;
  }

  // -------------------------------------------------------------------------
  // Record6 type implementation
  // -------------------------------------------------------------------------

  /**
   * Getter for <code>public.release_identifier.updated_at</code>. created time
   */
  public LocalDateTime getUpdatedAt() {
    return (LocalDateTime) get(5);
  }

  /**
   * Setter for <code>public.release_identifier.updated_at</code>. created time
   */
  public ReleaseIdentifierRecord setUpdatedAt(LocalDateTime value) {
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
    return ReleaseIdentifier.RELEASE_IDENTIFIER.RELEASE_ID;
  }

  @Override
  public Field<String> field2() {
    return ReleaseIdentifier.RELEASE_IDENTIFIER.DESCRIPTION;
  }

  @Override
  public Field<String> field3() {
    return ReleaseIdentifier.RELEASE_IDENTIFIER.TYPE;
  }

  @Override
  public Field<String> field4() {
    return ReleaseIdentifier.RELEASE_IDENTIFIER.VALUE;
  }

  @Override
  public Field<Long> field5() {
    return ReleaseIdentifier.RELEASE_IDENTIFIER.IDENTIFIER_HASH;
  }

  @Override
  public Field<LocalDateTime> field6() {
    return ReleaseIdentifier.RELEASE_IDENTIFIER.UPDATED_AT;
  }

  @Override
  public Integer component1() {
    return getReleaseId();
  }

  @Override
  public String component2() {
    return getDescription();
  }

  @Override
  public String component3() {
    return getType();
  }

  @Override
  public String component4() {
    return getValue();
  }

  @Override
  public Long component5() {
    return getIdentifierHash();
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
    return getDescription();
  }

  @Override
  public String value3() {
    return getType();
  }

  @Override
  public String value4() {
    return getValue();
  }

  @Override
  public Long value5() {
    return getIdentifierHash();
  }

  @Override
  public LocalDateTime value6() {
    return getUpdatedAt();
  }

  @Override
  public ReleaseIdentifierRecord value1(Integer value) {
    setReleaseId(value);
    return this;
  }

  @Override
  public ReleaseIdentifierRecord value2(String value) {
    setDescription(value);
    return this;
  }

  @Override
  public ReleaseIdentifierRecord value3(String value) {
    setType(value);
    return this;
  }

  @Override
  public ReleaseIdentifierRecord value4(String value) {
    setValue(value);
    return this;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  @Override
  public ReleaseIdentifierRecord value5(Long value) {
    setIdentifierHash(value);
    return this;
  }

  @Override
  public ReleaseIdentifierRecord value6(LocalDateTime value) {
    setUpdatedAt(value);
    return this;
  }

  @Override
  public ReleaseIdentifierRecord values(Integer value1, String value2, String value3, String value4,
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