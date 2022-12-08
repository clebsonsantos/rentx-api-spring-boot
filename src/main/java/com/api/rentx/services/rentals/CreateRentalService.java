package com.api.rentx.services.rentals;

import javax.transaction.Transactional;

import com.api.rentx.models.RentalsModel;
import com.api.rentx.repositories.RentalRepository;

public class CreateRentalService {
  final RentalRepository rentalsRepository;

  public CreateRentalService(RentalRepository rentalsRepository) {
    this.rentalsRepository = rentalsRepository;
  }

  @Transactional
  public RentalsModel save(RentalsModel rental) {
    return rentalsRepository.save(rental);
  }
}
