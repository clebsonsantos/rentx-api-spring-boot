package com.api.rentx.dtos;

import java.util.UUID;

import javax.validation.constraints.NotBlank;

public class CarDTO {
  @NotBlank
  private UUID id;
  @NotBlank
  private String name;
  @NotBlank
  private String brand;
  @NotBlank
  private String about;
  @NotBlank
  private String period;
  @NotBlank
  private String fuel_type;
  @NotBlank
  private String thumbnail;
  @NotBlank
  private Number price;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getAbout() {
    return about;
  }

  public void setAbout(String about) {
    this.about = about;
  }

  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public String getFuel_type() {
    return fuel_type;
  }

  public void setFuel_type(String fuel_type) {
    this.fuel_type = fuel_type;
  }

  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  public Number getPrice() {
    return price;
  }

  public void setPrice(Number price) {
    this.price = price;
  }

}
