package com.api.rentx.dtos;

import javax.validation.constraints.NotBlank;

public class UserDTO {
  @NotBlank
  private String name;
  @NotBlank
  private String email;
  @NotBlank
  private String driver_license;

  private String avatar;

  @NotBlank
  private String password;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDriver_license() {
    return driver_license;
  }

  public void setDriver_license(String driver_license) {
    this.driver_license = driver_license;
  }

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
