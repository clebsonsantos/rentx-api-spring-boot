package com.api.rentx.controllers;

import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.rentx.dtos.RentalsDTO;
import com.api.rentx.models.RentalsModel;
import com.api.rentx.services.rentals.CreateRentalService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/rentals")
public class RentalsController {
  final CreateRentalService createRentalService;

  public RentalsController(CreateRentalService createRentalService) {
    this.createRentalService = createRentalService;
  }

  @PostMapping
  public ResponseEntity<Object> saveNewRental(@RequestBody RentalsDTO rentals) {
    var rentalModel = new RentalsModel();
    BeanUtils.copyProperties(rentals, rentalModel);
    rentalModel.setCreated_at(LocalDateTime.now(ZoneId.of("UTC")));
    rentalModel.setUpdated_at(LocalDateTime.now(ZoneId.of("UTC")));
    return ResponseEntity.status(HttpStatus.CREATED).body(createRentalService.execute(rentalModel));
  }
}
