package com.api.rentx.services.users;

import java.util.Objects;
import org.springframework.stereotype.Service;

import com.api.rentx.models.UserModel;
import com.api.rentx.repositories.UserRepository;

@Service
public class AuthenticationSession {
  final UserRepository userRepository;

  public AuthenticationSession(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public UserModel verifyUser(String email) throws Exception {
    var users = userRepository.findAll();
    var userModel = users.stream().filter(user -> Objects.equals(user.getEmail(), email)).findFirst().get();
    if (userModel != null) {
      return userModel;
    }
    throw new Exception("User not exists");
  }
}
