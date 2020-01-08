package com.designPatterns.decorator.concreteComponent;

import com.designPatterns.decorator.Beverage;

public class Espress extends Beverage {

  public String getDescription() {
    return "Espress";
  }
  
  public float cost() {
    return 1;
  }
}
