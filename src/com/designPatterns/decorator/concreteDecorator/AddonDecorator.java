package com.designPatterns.decorator.concreteDecorator;

import com.designPatterns.decorator.Beverage;

/*
 * is-a and has-a
 * has -a can be decorated by an other decorator
 */
public abstract class AddonDecorator extends Beverage {

  Beverage beverage;

  public AddonDecorator(Beverage beverage) {
    this.beverage = beverage;
  }

  String getDesription() {
    return null;
  }

}
