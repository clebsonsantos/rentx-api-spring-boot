package com.api.rentx.models;

import java.util.UUID;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserModelTest {
  UserModel sut;

  @BeforeEach
  public void setup() {
    this.sut = new UserModel();

    this.sut.setId(new UUID(0, 0));
    this.sut.setName("Any name");
    this.sut.setAvatar("http://any-url-image.com");
    this.sut.setEmail("email@email.com");
    this.sut.setDriver_license("2334");
    this.sut.setPassword("password");
  }

  @Test
  public void shouldBeReturnValidId() {
    Assertions.assertEquals(new UUID(0, 0), this.sut.getId());
  }

  @Test
  public void shouldBeValidateEntity() {
    Assertions.assertTrue(sut.getEmail() == "email@email.com");
  }

  @Test
  public void shouldBeReturnedInvalidEntity() {
    this.sut.setName(null);
    Assertions.assertEquals(null, this.sut.getName());
  }
}
