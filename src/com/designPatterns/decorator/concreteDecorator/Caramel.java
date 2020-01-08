package com.designPatterns.decorator.concreteDecorator;

import com.designPatterns.decorator.Beverage;

public class Caramel extends AddonDecorator {
  // Beverage beverage;

  public Caramel(Beverage beverage) {
    super(beverage);
  }

  public String getDescription() {
    return this.beverage.getDescription() + " with caramel";

  }

  public float cost() {
    // depend on the flavor
    return this.beverage.cost() + 2;

  }

}
