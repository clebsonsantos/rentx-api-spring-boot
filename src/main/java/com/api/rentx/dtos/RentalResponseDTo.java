package com.api.rentx.dtos;

import com.api.rentx.models.RentalsModel;

public class RentalResponseDTo extends RentalsModel {
  private CarDTO car;

  public CarDTO getCar() {
    return car;
  }

  public void setCar(CarDTO car) {
    this.car = car;
  }
}
