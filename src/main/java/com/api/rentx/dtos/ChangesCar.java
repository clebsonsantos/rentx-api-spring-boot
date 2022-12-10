package com.api.rentx.dtos;

public class ChangesCar {
  private Long latestVersion;
  private ObjectCars changes;

  public ChangesCar(Long latestVersion, ObjectCars changes) {
    this.latestVersion = latestVersion;
    this.changes = changes;
  }

  public Long getLatestVersion() {
    return latestVersion;
  }

  public void setLatestVersion(Long latestVersion) {
    this.latestVersion = latestVersion;
  }

  public ObjectCars getChanges() {
    return changes;
  }

  public void setChanges(ObjectCars changes) {
    this.changes = changes;
  }

}
