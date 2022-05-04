package com.launchacademy.househunt.models;

import org.springframework.stereotype.Component;

@Component
public class House {
  private String address;
  private String city;
  private String state;
  private String zipCode;
  private int price;
  private int numberOfBeds;
  private int numberOfBaths;
  private int squareFootage;

//  public House() {
//  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getNumberOfBeds() {
    return numberOfBeds;
  }

  public void setNumberOfBeds(int numberOfBeds) {
    this.numberOfBeds = numberOfBeds;
  }

  public int getNumberOfBaths() {
    return numberOfBaths;
  }

  public void setNumberOfBaths(int numberOfBaths) {
    this.numberOfBaths = numberOfBaths;
  }

  public int getSquareFootage() {
    return squareFootage;
  }

  public void setSquareFootage(int squareFootage) {
    this.squareFootage = squareFootage;
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

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }
}
