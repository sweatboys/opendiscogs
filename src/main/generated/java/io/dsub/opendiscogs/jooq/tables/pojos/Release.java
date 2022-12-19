/*
 * This file is generated by jOOQ.
 */
package io.dsub.opendiscogs.jooq.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Release implements Serializable {

  private static final long serialVersionUID = 1L;

  private final Integer id;
  private final String title;
  private final String country;
  private final String dataQuality;
  private final Short releasedYear;
  private final Short releasedMonth;
  private final Short releasedDay;
  private final String listedReleaseDate;
  private final Boolean isMaster;
  private final String notes;
  private final String status;
  private final Integer masterId;

  public Release(Release value) {
    this.id = value.id;
    this.title = value.title;
    this.country = value.country;
    this.dataQuality = value.dataQuality;
    this.releasedYear = value.releasedYear;
    this.releasedMonth = value.releasedMonth;
    this.releasedDay = value.releasedDay;
    this.listedReleaseDate = value.listedReleaseDate;
    this.isMaster = value.isMaster;
    this.notes = value.notes;
    this.status = value.status;
    this.masterId = value.masterId;
  }

  public Release(
      Integer id,
      String title,
      String country,
      String dataQuality,
      Short releasedYear,
      Short releasedMonth,
      Short releasedDay,
      String listedReleaseDate,
      Boolean isMaster,
      String notes,
      String status,
      Integer masterId
  ) {
    this.id = id;
    this.title = title;
    this.country = country;
    this.dataQuality = dataQuality;
    this.releasedYear = releasedYear;
    this.releasedMonth = releasedMonth;
    this.releasedDay = releasedDay;
    this.listedReleaseDate = listedReleaseDate;
    this.isMaster = isMaster;
    this.notes = notes;
    this.status = status;
    this.masterId = masterId;
  }

  /**
   * Getter for <code>public.release.id</code>.
   */
  public Integer getId() {
    return this.id;
  }

  /**
   * Getter for <code>public.release.title</code>.
   */
  public String getTitle() {
    return this.title;
  }

  /**
   * Getter for <code>public.release.country</code>.
   */
  public String getCountry() {
    return this.country;
  }

  /**
   * Getter for <code>public.release.data_quality</code>.
   */
  public String getDataQuality() {
    return this.dataQuality;
  }

  /**
   * Getter for <code>public.release.released_year</code>.
   */
  public Short getReleasedYear() {
    return this.releasedYear;
  }

  /**
   * Getter for <code>public.release.released_month</code>.
   */
  public Short getReleasedMonth() {
    return this.releasedMonth;
  }

  /**
   * Getter for <code>public.release.released_day</code>.
   */
  public Short getReleasedDay() {
    return this.releasedDay;
  }

  /**
   * Getter for <code>public.release.listed_release_date</code>.
   */
  public String getListedReleaseDate() {
    return this.listedReleaseDate;
  }

  /**
   * Getter for <code>public.release.is_master</code>.
   */
  public Boolean getIsMaster() {
    return this.isMaster;
  }

  /**
   * Getter for <code>public.release.notes</code>.
   */
  public String getNotes() {
    return this.notes;
  }

  /**
   * Getter for <code>public.release.status</code>.
   */
  public String getStatus() {
    return this.status;
  }

  /**
   * Getter for <code>public.release.master_id</code>.
   */
  public Integer getMasterId() {
    return this.masterId;
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
    final Release other = (Release) obj;
    if (this.id == null) {
        if (other.id != null) {
            return false;
        }
    } else if (!this.id.equals(other.id)) {
        return false;
    }
    if (this.title == null) {
        if (other.title != null) {
            return false;
        }
    } else if (!this.title.equals(other.title)) {
        return false;
    }
    if (this.country == null) {
        if (other.country != null) {
            return false;
        }
    } else if (!this.country.equals(other.country)) {
        return false;
    }
    if (this.dataQuality == null) {
        if (other.dataQuality != null) {
            return false;
        }
    } else if (!this.dataQuality.equals(other.dataQuality)) {
        return false;
    }
    if (this.releasedYear == null) {
        if (other.releasedYear != null) {
            return false;
        }
    } else if (!this.releasedYear.equals(other.releasedYear)) {
        return false;
    }
    if (this.releasedMonth == null) {
        if (other.releasedMonth != null) {
            return false;
        }
    } else if (!this.releasedMonth.equals(other.releasedMonth)) {
        return false;
    }
    if (this.releasedDay == null) {
        if (other.releasedDay != null) {
            return false;
        }
    } else if (!this.releasedDay.equals(other.releasedDay)) {
        return false;
    }
    if (this.listedReleaseDate == null) {
        if (other.listedReleaseDate != null) {
            return false;
        }
    } else if (!this.listedReleaseDate.equals(other.listedReleaseDate)) {
        return false;
    }
    if (this.isMaster == null) {
        if (other.isMaster != null) {
            return false;
        }
    } else if (!this.isMaster.equals(other.isMaster)) {
        return false;
    }
    if (this.notes == null) {
        if (other.notes != null) {
            return false;
        }
    } else if (!this.notes.equals(other.notes)) {
        return false;
    }
    if (this.status == null) {
        if (other.status != null) {
            return false;
        }
    } else if (!this.status.equals(other.status)) {
        return false;
    }
    if (this.masterId == null) {
        if (other.masterId != null) {
            return false;
        }
    } else if (!this.masterId.equals(other.masterId)) {
        return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
    result = prime * result + ((this.title == null) ? 0 : this.title.hashCode());
    result = prime * result + ((this.country == null) ? 0 : this.country.hashCode());
    result = prime * result + ((this.dataQuality == null) ? 0 : this.dataQuality.hashCode());
    result = prime * result + ((this.releasedYear == null) ? 0 : this.releasedYear.hashCode());
    result = prime * result + ((this.releasedMonth == null) ? 0 : this.releasedMonth.hashCode());
    result = prime * result + ((this.releasedDay == null) ? 0 : this.releasedDay.hashCode());
    result =
        prime * result + ((this.listedReleaseDate == null) ? 0 : this.listedReleaseDate.hashCode());
    result = prime * result + ((this.isMaster == null) ? 0 : this.isMaster.hashCode());
    result = prime * result + ((this.notes == null) ? 0 : this.notes.hashCode());
    result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
    result = prime * result + ((this.masterId == null) ? 0 : this.masterId.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Release (");

    sb.append(id);
    sb.append(", ").append(title);
    sb.append(", ").append(country);
    sb.append(", ").append(dataQuality);
    sb.append(", ").append(releasedYear);
    sb.append(", ").append(releasedMonth);
    sb.append(", ").append(releasedDay);
    sb.append(", ").append(listedReleaseDate);
    sb.append(", ").append(isMaster);
    sb.append(", ").append(notes);
    sb.append(", ").append(status);
    sb.append(", ").append(masterId);

    sb.append(")");
    return sb.toString();
  }
}
