package com.api.rentx.controllers;

import javax.validation.Valid;

import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties.Jwt;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.rsocket.RSocketSecurity.JwtSpec;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer.JwtConfigurer;
import org.springframework.security.config.web.servlet.oauth2.resourceserver.JwtDsl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.rentx.dtos.ReponseDTO;
import com.api.rentx.dtos.SessionDTO;
import com.api.rentx.services.users.AuthenticationSession;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/sessions")
public class AuthenticationController {
  final AuthenticationSession auth;
  static final String SIGNINGKEY = "SecretKey";

  public AuthenticationController(AuthenticationSession auth) {
    this.auth = auth;
  }

  @PostMapping
  public ResponseEntity<Object> session(@RequestBody @Valid SessionDTO sessionDTO) {
    try {
      var user = auth.verifyUser(sessionDTO.getEmail());
      boolean isPasswordMatch = new BCryptPasswordEncoder().matches(sessionDTO.getPassword(), user.getPassword());
      if (!isPasswordMatch) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Email or password incorret!");
      }
      var account = new ReponseDTO();
      String jwtToken = Jwts.builder().setSubject(user.getId().toString())
          .signWith(SignatureAlgorithm.HS512, SIGNINGKEY)
          .compact();
      account.setToken(jwtToken);
      account.setUser(user);
      return ResponseEntity.status(HttpStatus.OK).body(account);
    } catch (Exception error) {
      System.out.println(error.toString());
      return ResponseEntity.status(HttpStatus.CONFLICT).body(error.getMessage());
    }
  }
}
