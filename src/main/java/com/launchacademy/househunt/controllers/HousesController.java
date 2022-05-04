package com.launchacademy.househunt.controllers;

import com.launchacademy.househunt.models.House;
import com.launchacademy.househunt.services.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/houses")
public class HousesController {
  private HouseService houseService;

  @Autowired
  public HousesController(HouseService houseService) {
    this.houseService = houseService;
  }

//  @GetMapping("/new")
//  public String getForm(Model model) {
//    House house = new House();
//    house.setAddress("77 Summer St");
//    model.addAttribute("house", house);
//    return "houses/new";
//  }

  @GetMapping("/new")
  public String getForm(@ModelAttribute House house) {
    return "houses/new";
  }

  @PostMapping()
  public String postHouse(@ModelAttribute House house) {
    houseService.addToHousesList(house);
    System.out.println(houseService.getHousesList());
//    System.out.println(house.getPrice());
//    System.out.println(house.getNumberOfBaths());
    return "houses/show";
  }
}
