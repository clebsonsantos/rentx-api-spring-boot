package com.api.rentx.dtos;

import java.util.Date;
import java.util.UUID;

import javax.validation.constraints.NotBlank;

public class RentalsDTO {

  @NotBlank
  private UUID user_id;

  @NotBlank
  private UUID car_id;

  @NotBlank
  private Long total;

  @NotBlank
  private Date start_date;

  @NotBlank
  private Date end_date;

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

  public Date getStart_date() {
    return start_date;
  }

  public void setStart_date(Date start_date) {
    this.start_date = start_date;
  }

  public Date getEnd_date() {
    return end_date;
  }

  public void setEnd_date(Date end_date) {
    this.end_date = end_date;
  }

}
