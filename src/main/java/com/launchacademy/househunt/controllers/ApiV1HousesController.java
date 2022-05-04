package com.launchacademy.househunt.controllers;

import com.launchacademy.househunt.services.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ApiV1HousesController {
  private HouseService houseService;

  @Autowired
  @Qualifier("HouseDatabaseBasedService")
  public void setHouseService(HouseService houseService) {
    this.houseService = houseService;
  }
}
