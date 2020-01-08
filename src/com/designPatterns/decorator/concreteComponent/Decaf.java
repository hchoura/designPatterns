package com.designPatterns.decorator.concreteComponent;

import com.designPatterns.decorator.Beverage;

public class Decaf extends Beverage {
  
  public String getDescription() {
    return "Decaf";
  }
  
  public float cost() {
    return 2;
  }
}
