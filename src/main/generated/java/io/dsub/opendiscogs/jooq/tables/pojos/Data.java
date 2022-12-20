/*
 * This file is generated by jOOQ.
 */
package io.dsub.opendiscogs.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * Cached resource for keep tracking data dump updates (either being monthly or random occasions)
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Data implements Serializable {

  private static final long serialVersionUID = 1L;

  private final String etag;
  private final LocalDateTime generatedAt;
  private final String checksum;
  private final String targetType;
  private final String uri;

  public Data(Data value) {
    this.etag = value.etag;
    this.generatedAt = value.generatedAt;
    this.checksum = value.checksum;
    this.targetType = value.targetType;
    this.uri = value.uri;
  }

  public Data(
      String etag,
      LocalDateTime generatedAt,
      String checksum,
      String targetType,
      String uri
  ) {
    this.etag = etag;
    this.generatedAt = generatedAt;
    this.checksum = checksum;
    this.targetType = targetType;
    this.uri = uri;
  }

  /**
   * Getter for <code>public.data.etag</code>. ETag representing this data being unique. Used for
   * updating cache.
   */
  public String getEtag() {
    return this.etag;
  }

  /**
   * Getter for <code>public.data.generated_at</code>. Date this data is generated at.
   */
  public LocalDateTime getGeneratedAt() {
    return this.generatedAt;
  }

  /**
   * Getter for <code>public.data.checksum</code>. Checksum to validate when fetching dump source.
   */
  public String getChecksum() {
    return this.checksum;
  }

  /**
   * Getter for <code>public.data.target_type</code>. Type of data. Referred as artists, labels,
   * masters, release. Always uppercase.
   */
  public String getTargetType() {
    return this.targetType;
  }

  /**
   * Getter for <code>public.data.uri</code>. URI to download dump data file.
   */
  public String getUri() {
    return this.uri;
  }

  @Override
  public boolean equals(Object obj) {
      if (this == obj) {
          return true;
      }
      if (obj == null) {
          return false;
      }
      if (getClass() != obj.getClass()) {
          return false;
      }
    final Data other = (Data) obj;
    if (this.etag == null) {
        if (other.etag != null) {
            return false;
        }
    } else if (!this.etag.equals(other.etag)) {
        return false;
    }
    if (this.generatedAt == null) {
        if (other.generatedAt != null) {
            return false;
        }
    } else if (!this.generatedAt.equals(other.generatedAt)) {
        return false;
    }
    if (this.checksum == null) {
        if (other.checksum != null) {
            return false;
        }
    } else if (!this.checksum.equals(other.checksum)) {
        return false;
    }
    if (this.targetType == null) {
        if (other.targetType != null) {
            return false;
        }
    } else if (!this.targetType.equals(other.targetType)) {
        return false;
    }
    if (this.uri == null) {
        if (other.uri != null) {
            return false;
        }
    } else if (!this.uri.equals(other.uri)) {
        return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.etag == null) ? 0 : this.etag.hashCode());
    result = prime * result + ((this.generatedAt == null) ? 0 : this.generatedAt.hashCode());
    result = prime * result + ((this.checksum == null) ? 0 : this.checksum.hashCode());
    result = prime * result + ((this.targetType == null) ? 0 : this.targetType.hashCode());
    result = prime * result + ((this.uri == null) ? 0 : this.uri.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Data (");

    sb.append(etag);
    sb.append(", ").append(generatedAt);
    sb.append(", ").append(checksum);
    sb.append(", ").append(targetType);
    sb.append(", ").append(uri);

    sb.append(")");
    return sb.toString();
  }
}