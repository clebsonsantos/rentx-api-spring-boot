package com.api.rentx.services.cars;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.api.rentx.models.CarModel;
import com.api.rentx.repositories.CarRepository;

@Service
public class ListCarByIdService {
  final CarRepository carRepository;

  public ListCarByIdService(CarRepository carRepository) {
    this.carRepository = carRepository;
  }

  public Optional<CarModel> execute(UUID carId) {
    return carRepository.findById(carId);
  }
}
