package com.api.rentx.controllers;

import java.util.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.rentx.dtos.RentalResponseDTo;
import com.api.rentx.dtos.RentalsDTO;
import com.api.rentx.models.RentalsModel;
import com.api.rentx.services.rentals.CreateRentalService;
import com.api.rentx.services.rentals.ListAllRentals;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/rentals")
public class RentalsController {
  final CreateRentalService createRentalService;
  final ListAllRentals listRentalService;

  public RentalsController(CreateRentalService createRentalService, ListAllRentals listRentalService) {
    this.createRentalService = createRentalService;
    this.listRentalService = listRentalService;
  }

  @PostMapping
  public ResponseEntity<Object> saveNewRental(@RequestBody RentalsDTO rentals) {
    var rentalModel = new RentalsModel();
    BeanUtils.copyProperties(rentals, rentalModel);

    rentalModel.setStart_date(this.convertDateTime(rentals.getStart_date()));
    rentalModel.setEnd_date(this.convertDateTime(rentals.getEnd_date()));
    rentalModel.setCreated_at(LocalDateTime.now(ZoneId.of("UTC")));
    rentalModel.setUpdated_at(LocalDateTime.now(ZoneId.of("UTC")));
    return ResponseEntity.status(HttpStatus.CREATED).body(createRentalService.execute(rentalModel));
  }

  @GetMapping
  public ResponseEntity<List<RentalResponseDTo>> listRentals() {
    return ResponseEntity.status(HttpStatus.OK).body(listRentalService.execute());
  }

  private LocalDateTime convertDateTime(Date date) {
    return LocalDateTime.ofInstant(date.toInstant(), ZoneId.of("UTC"));
  }
}
