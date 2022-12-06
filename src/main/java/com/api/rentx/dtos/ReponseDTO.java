package com.api.rentx.dtos;

import javax.validation.constraints.NotBlank;

import com.api.rentx.models.UserModel;

public class ReponseDTO {
  @NotBlank
  private String token;
  @NotBlank
  private UserModel user;

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public UserModel getUser() {
    return user;
  }

  public void setUser(UserModel user) {
    this.user = user;
  }

}
