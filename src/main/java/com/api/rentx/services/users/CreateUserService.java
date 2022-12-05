package com.api.rentx.services.users;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.api.rentx.models.UserModel;
import com.api.rentx.repositories.UserRepository;

@Service
public class CreateUserService {
  final UserRepository userRepository;

  public CreateUserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Transactional
  public UserModel save(UserModel userModel) {
    return userRepository.save(userModel);
  }

  public boolean existsByEmail(String email) {
    return userRepository.existsByEmail(email);
  }
}
