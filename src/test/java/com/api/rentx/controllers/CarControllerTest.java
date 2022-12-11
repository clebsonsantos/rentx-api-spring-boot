package com.api.rentx.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CarControllerTest {

  @Autowired
  MockMvc mockMvc;

  @Test
  public void getCarByIDSuccess() throws Exception {
    mockMvc.perform(get("/cars/49983f6c-a46a-4dfd-a86e-425b8c72e086"))
        .andExpect(status().isOk());

  }

  @Test
  public void carNotFoundBadRequest() throws Exception {
    mockMvc.perform(get("/cars/invalid-id-invalid-id"))
        .andExpect(status().isBadRequest());

  }

  @Test
  public void getAllCarsWithPulledVersion() throws Exception {
    mockMvc.perform(get("/cars/sync/pull?lastPulledVersion=1"))
        .andExpect(status().isOk());

  }

}
