package com.api.rentx.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.rentx.models.*;

@Repository
public interface UserRepository extends JpaRepository<UserModel, UUID> {
  boolean existsByEmail(String email);

  UserModel findById(String userId);
}
