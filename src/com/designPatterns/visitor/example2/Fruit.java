package com.designPatterns.visitor.example2;

public class Fruit implements IElement {
  
  private float priceKg;
  private float weight;
  private String name;
  
  public Fruit(float priceKg, float weight, String name) {
    super();
    this.priceKg = priceKg;
    this.weight  = weight;
    this.name    = name;
  }

  public float getPriceKg() {
    return priceKg;
  }

  public void setPriceKg(float priceKg) {
    this.priceKg = priceKg;
  }

  public float getWeight() {
    return weight;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public float accept(IVisitor visitor) {
    return visitor.visit(this);

  }

}
