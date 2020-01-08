package com.designPatterns.decorator.concreteDecorator;

import com.designPatterns.decorator.Beverage;

public class Milk extends AddonDecorator {
  public Milk(Beverage beverage) {
    super(beverage);
  }

  public String getDescription() {
    return this.beverage.getDescription() + " with milk";

  }

  public float cost() {
    // depend on the flavor
    // need to navigate throw all the decorators that may decorate the decorator
    // until the concrete component
    // behaviour (cost) that is added
    return this.beverage.cost() + 1;

  }
}
