package com.api.rentx.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.rentx.models.RentalsModel;

@Repository
public interface RentalRepository extends JpaRepository<RentalsModel, UUID> {

}
