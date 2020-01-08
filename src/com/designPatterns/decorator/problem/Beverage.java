package com.designPatterns.decorator.problem;

public abstract class Beverage {
  private boolean milk;
  private boolean caramel;

  String getdescription() {
    String descrip = "";
    descrip += caramel ? " with caramel" : "";
    descrip += milk ? " with milk" : "";

    return descrip;
  }

  float cost() {
    // depend on the flavor
    return 0;

  }

  boolean hasMilk() {
    return this.milk;
  }

  void setMilk(boolean milk) {
    this.milk = milk;

  }

  boolean hascaramel() {
    return this.caramel;
  }

  void setCaramel(boolean caraeml) {
    this.caramel = caraeml;
  }

}
