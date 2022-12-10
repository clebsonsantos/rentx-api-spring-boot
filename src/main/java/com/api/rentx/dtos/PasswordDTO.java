package com.api.rentx.dtos;

public class PasswordDTO {
  private String password;
  private String old_password;

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getOld_password() {
    return old_password;
  }

  public void setOld_password(String old_password) {
    this.old_password = old_password;
  }

}