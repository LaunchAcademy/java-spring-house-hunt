package com.launchacademy.househunt.services;

import com.launchacademy.househunt.models.House;
import java.util.List;

public interface HouseService {
  public List<House> getHousesList();
  public void addToHousesList(House house);
}
