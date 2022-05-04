package com.launchacademy.househunt.services;

import com.launchacademy.househunt.models.House;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
@Primary
public class HouseSessionBasedService implements HouseService {
  private List<House> housesList;

  public HouseSessionBasedService() {
    housesList = new ArrayList<House>();
  }

  public List<House> getHousesList() {
    return housesList;
  }

  public void addToHousesList(House house) {
    housesList.add(house);
  }
}
