package com.launchacademy.househunt.controllers;

import com.launchacademy.househunt.models.House;
import lombok.Builder.Default;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/houses")
public class HousesController {
  @Autowired
  private House house;

  @GetMapping("/new")
  public String getNew(Model model) {
    House house = new House();
    house.setAddress("1601 Pennsylvania Avenue");
    house.setCity("Washington");
    house.setState("DC");
    model.addAttribute("house", house);
    return "houses/new";
  }

  @PostMapping("")
  public String doPost(@ModelAttribute House house, Model model) {
//    return "redirect:/houses/new";
    model.addAttribute("house", house);
    return "houses/show";
  }


}
