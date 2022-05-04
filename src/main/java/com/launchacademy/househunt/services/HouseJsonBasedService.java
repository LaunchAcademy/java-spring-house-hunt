package com.launchacademy.househunt.services;

import com.launchacademy.househunt.models.House;
import java.util.ArrayList;
import java.util.List;

public class HouseJsonBasedService implements HouseService {
  private List<House> housesList;

  public HouseJsonBasedService() {
    housesList = new ArrayList<House>();
  }

  public List<House> getHousesList() {
    // read a JSON file, use ObjectMapper, map them to an ArrayList
    return housesList;
  }

  public void addToHousesList(House house) {
    housesList.add(house);
    // take that instance variable
    // use ObjectWriter to store it in our JSON
  }
}
