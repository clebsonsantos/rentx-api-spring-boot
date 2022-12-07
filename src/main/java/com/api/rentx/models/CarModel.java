package com.api.rentx.models;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CARS")
public class CarModel {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String brand;

  @Column(nullable = false)
  private String about;

  @Column(nullable = false)
  private String period;

  @Column(nullable = false)
  private String fuel_type;

  @Column(nullable = false)
  private String thumbnail;

  @Column(nullable = false)
  private Long price;

  @Column(nullable = false)
  private LocalDateTime created_at;

  @Column(nullable = false)
  private LocalDateTime updated_at;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "CARS_ACCESSORIES", joinColumns = @JoinColumn(name = "car_id"), inverseJoinColumns = @JoinColumn(name = "accessorie_id"))
  private Collection<AccessoriesModel> accessories;

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

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

  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public LocalDateTime getCreated_at() {
    return created_at;
  }

  public void setCreated_at(LocalDateTime created_at) {
    this.created_at = created_at;
  }

  public LocalDateTime getUpdated_at() {
    return updated_at;
  }

  public void setUpdated_at(LocalDateTime updated_at) {
    this.updated_at = updated_at;
  }

  public Collection<AccessoriesModel> getAccessories() {
    return accessories;
  }

  public void setAccessories(Collection<AccessoriesModel> accessories) {
    this.accessories = accessories;
  }

}
