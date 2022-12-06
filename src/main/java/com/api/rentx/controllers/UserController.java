package com.api.rentx.controllers;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.rentx.dtos.UserDTO;
import com.api.rentx.models.UserModel;
import com.api.rentx.services.users.CreateUserService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/users")
public class UserController {
  final CreateUserService createUserService;

  public UserController(CreateUserService createUserService) {
    this.createUserService = createUserService;
  }

  @PostMapping
  public ResponseEntity<Object> saveUser(@RequestBody @Valid UserDTO userDTO) {
    if (createUserService.existsByEmail(userDTO.getEmail())) {
      return ResponseEntity.status(HttpStatus.CONFLICT).body("Email already exists");
    }
    var userModel = new UserModel();
    userDTO.setPassword(new BCryptPasswordEncoder().encode(userDTO.getPassword()));
    userDTO
        .setAvatar("https://ui-avatars.com/api/?name=" + userDTO.getName() + "&length=1&bold=true&background=ffffff");
    BeanUtils.copyProperties(userDTO, userModel);
    return ResponseEntity.status(HttpStatus.CREATED).body(createUserService.save(userModel));
  }
}
