package com.api.rentx.services.rentals;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.api.rentx.models.RentalsModel;
import com.api.rentx.repositories.RentalRepository;

@Service
public class CreateRentalService {
  final RentalRepository rentalsRepository;

  public CreateRentalService(RentalRepository rentalsRepository) {
    this.rentalsRepository = rentalsRepository;
  }

  @Transactional
  public RentalsModel execute(RentalsModel rental) {
    return rentalsRepository.save(rental);
  }
}
