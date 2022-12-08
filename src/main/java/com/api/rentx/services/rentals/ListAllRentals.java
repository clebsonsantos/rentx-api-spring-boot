package com.api.rentx.services.rentals;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.rentx.models.RentalsModel;
import com.api.rentx.repositories.RentalRepository;

@Service
public class ListAllRentals {
  final RentalRepository rentalRepository;

  public ListAllRentals(RentalRepository rentalRepository) {
    this.rentalRepository = rentalRepository;
  }

  public List<RentalsModel> execute() {
    return rentalRepository.findAll();
  }
}
