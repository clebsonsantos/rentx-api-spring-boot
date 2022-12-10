package com.api.rentx.services.rentals;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.api.rentx.dtos.CarDTO;
import com.api.rentx.dtos.RentalResponseDTo;
import com.api.rentx.repositories.CarRepository;
import com.api.rentx.repositories.RentalRepository;

@Service
public class ListAllRentals {
  final RentalRepository rentalRepository;
  final CarRepository carRepository;

  public ListAllRentals(RentalRepository rentalRepository, CarRepository carRepository) {
    this.rentalRepository = rentalRepository;
    this.carRepository = carRepository;
  }

  public List<RentalResponseDTo> execute() {
    var rentals = rentalRepository.findAll();
    var list = new ArrayList<RentalResponseDTo>();
    for (var rental : rentals) {
      var rentalCars = new RentalResponseDTo();
      BeanUtils.copyProperties(rental, rentalCars);
      var car = carRepository.findById(rental.getCar_id()).get();
      var carDTO = new CarDTO();
      BeanUtils.copyProperties(car, carDTO);
      rentalCars.setCar(carDTO);
      list.add(rentalCars);
    }
    return list;
  }
}
