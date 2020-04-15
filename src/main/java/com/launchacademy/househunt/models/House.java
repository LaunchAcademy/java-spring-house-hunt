package com.launchacademy.househunt.models;

import org.springframework.stereotype.Component;

@Component
public class House {
  private Long price;

  private String address;
  private String city;
  private String state;
  private String postalCode;

  private int numberOfBedrooms;
  private int numberOfBathrooms;

  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public int getNumberOfBedrooms() {
    return numberOfBedrooms;
  }

  public void setNumberOfBedrooms(int numberOfBedrooms) {
    this.numberOfBedrooms = numberOfBedrooms;
  }

  public int getNumberOfBathrooms() {
    return numberOfBathrooms;
  }

  public void setNumberOfBathrooms(int numberOfBathrooms) {
    this.numberOfBathrooms = numberOfBathrooms;
  }
}
