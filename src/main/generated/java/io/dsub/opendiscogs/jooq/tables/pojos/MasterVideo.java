/*
 * This file is generated by jOOQ.
 */
package io.dsub.opendiscogs.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class MasterVideo implements Serializable {

  private static final long serialVersionUID = 1L;

  private final Integer masterId;
  private final Long urlHash;
  private final String url;
  private final String description;
  private final String title;
  private final LocalDateTime updatedAt;

  public MasterVideo(MasterVideo value) {
    this.masterId = value.masterId;
    this.urlHash = value.urlHash;
    this.url = value.url;
    this.description = value.description;
    this.title = value.title;
    this.updatedAt = value.updatedAt;
  }

  public MasterVideo(
      Integer masterId,
      Long urlHash,
      String url,
      String description,
      String title,
      LocalDateTime updatedAt
  ) {
    this.masterId = masterId;
    this.urlHash = urlHash;
    this.url = url;
    this.description = description;
    this.title = title;
    this.updatedAt = updatedAt;
  }

  /**
   * Getter for <code>public.master_video.master_id</code>.
   */
  public Integer getMasterId() {
    return this.masterId;
  }

  /**
   * Getter for <code>public.master_video.url_hash</code>. fnv32 encoded hash from url
   */
  public Long getUrlHash() {
    return this.urlHash;
  }

  /**
   * Getter for <code>public.master_video.url</code>.
   */
  public String getUrl() {
    return this.url;
  }

  /**
   * Getter for <code>public.master_video.description</code>.
   */
  public String getDescription() {
    return this.description;
  }

  /**
   * Getter for <code>public.master_video.title</code>.
   */
  public String getTitle() {
    return this.title;
  }

  /**
   * Getter for <code>public.master_video.updated_at</code>. created time
   */
  public LocalDateTime getUpdatedAt() {
    return this.updatedAt;
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
    final MasterVideo other = (MasterVideo) obj;
    if (this.masterId == null) {
        if (other.masterId != null) {
            return false;
        }
    } else if (!this.masterId.equals(other.masterId)) {
        return false;
    }
    if (this.urlHash == null) {
        if (other.urlHash != null) {
            return false;
        }
    } else if (!this.urlHash.equals(other.urlHash)) {
        return false;
    }
    if (this.url == null) {
        if (other.url != null) {
            return false;
        }
    } else if (!this.url.equals(other.url)) {
        return false;
    }
    if (this.description == null) {
        if (other.description != null) {
            return false;
        }
    } else if (!this.description.equals(other.description)) {
        return false;
    }
    if (this.title == null) {
        if (other.title != null) {
            return false;
        }
    } else if (!this.title.equals(other.title)) {
        return false;
    }
    if (this.updatedAt == null) {
        if (other.updatedAt != null) {
            return false;
        }
    } else if (!this.updatedAt.equals(other.updatedAt)) {
        return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.masterId == null) ? 0 : this.masterId.hashCode());
    result = prime * result + ((this.urlHash == null) ? 0 : this.urlHash.hashCode());
    result = prime * result + ((this.url == null) ? 0 : this.url.hashCode());
    result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
    result = prime * result + ((this.title == null) ? 0 : this.title.hashCode());
    result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MasterVideo (");

    sb.append(masterId);
    sb.append(", ").append(urlHash);
    sb.append(", ").append(url);
    sb.append(", ").append(description);
    sb.append(", ").append(title);
    sb.append(", ").append(updatedAt);

    sb.append(")");
    return sb.toString();
  }
}
