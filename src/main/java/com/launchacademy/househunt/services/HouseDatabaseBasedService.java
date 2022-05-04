package com.launchacademy.househunt.services;

import com.launchacademy.househunt.models.House;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

public class HouseDatabaseBasedService implements HouseService {
  private List<House> housesList;

  public HouseDatabaseBasedService() {
    housesList = new ArrayList<House>();
  }

  public List<House> getHousesList() {
    // use an EntityManager
    // query the database
    // return the list
    return housesList;
  }

  public void addToHousesList(House house) {
    // persist to the database
    housesList.add(house);
  }
}
