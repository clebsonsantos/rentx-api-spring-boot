package com.api.rentx.controllers;

import java.util.Optional;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.rentx.models.CarModel;
import com.api.rentx.services.cars.ListCarByIdService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/cars")
public class CarController {
  final ListCarByIdService listCarService;

  public CarController(ListCarByIdService listCarService) {
    this.listCarService = listCarService;
  }

  @GetMapping("/{id}")
  public ResponseEntity<Object> getOneParkingSpot(@PathVariable(value = "id") UUID id) {
    Optional<CarModel> carOptional = listCarService.execute(id);
    if (!carOptional.isPresent()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Car not found.");
    }
    return ResponseEntity.status(HttpStatus.OK).body(carOptional.get());
  }
}
