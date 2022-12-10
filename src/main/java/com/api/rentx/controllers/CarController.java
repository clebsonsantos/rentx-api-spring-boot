package com.api.rentx.controllers;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.rentx.dtos.ChangesCar;
import com.api.rentx.dtos.ObjectCars;
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
  public ResponseEntity<Object> listCarById(@PathVariable(value = "id") UUID id) {
    Optional<CarModel> carOptional = listCarService.execute(id);
    if (!carOptional.isPresent()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Car not found.");
    }
    return ResponseEntity.status(HttpStatus.OK).body(carOptional.get());
  }

  @GetMapping("/sync/pull")
  public ResponseEntity<Object> syncCars(@RequestParam(value = "lastPulledVersion") Long lastPulledVersion) {
    var cars = listCarService.findAll();
    return ResponseEntity.status(HttpStatus.OK).body(new ChangesCar(new Date().getTime(), new ObjectCars(cars)));
  }
}
