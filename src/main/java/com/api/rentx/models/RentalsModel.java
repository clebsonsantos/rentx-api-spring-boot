package com.api.rentx.models;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RENTALS")
public class RentalsModel {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @Column(nullable = false)
  private UUID user_id;

  @Column(nullable = false)
  private UUID car_id;

  @Column(nullable = false)
  private Long total;

  @Column(nullable = false)
  private LocalDateTime start_date;

  @Column(nullable = false)
  private LocalDateTime end_date;

  @Column(nullable = false)
  private LocalDateTime created_at;

  @Column(nullable = false)
  private LocalDateTime updated_at;

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public UUID getUser_id() {
    return user_id;
  }

  public void setUser_id(UUID user_id) {
    this.user_id = user_id;
  }

  public UUID getCar_id() {
    return car_id;
  }

  public void setCar_id(UUID car_id) {
    this.car_id = car_id;
  }

  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public LocalDateTime getStart_date() {
    return start_date;
  }

  public void setStart_date(LocalDateTime start_date) {
    this.start_date = start_date;
  }

  public LocalDateTime getEnd_date() {
    return end_date;
  }

  public void setEnd_date(LocalDateTime end_date) {
    this.end_date = end_date;
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

}
