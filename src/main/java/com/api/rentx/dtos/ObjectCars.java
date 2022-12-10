package com.api.rentx.dtos;

import java.util.List;

import com.api.rentx.models.CarModel;

public class ObjectCars {
  public List<CarModel> cars;

  public ObjectCars(List<CarModel> cars) {
    this.cars = cars;
  }

  public List<CarModel> getCars() {
    return cars;
  }

  public void setCars(List<CarModel> cars) {
    this.cars = cars;
  }
}