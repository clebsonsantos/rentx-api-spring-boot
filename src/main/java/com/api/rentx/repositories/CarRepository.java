package com.api.rentx.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.rentx.models.CarModel;

@Repository
public interface CarRepository extends JpaRepository<CarModel, UUID> {
}
