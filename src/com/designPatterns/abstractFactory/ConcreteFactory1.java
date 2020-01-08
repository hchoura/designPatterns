package com.designPatterns.abstractFactory;

import com.designPatterns.abstractFactory.product.ConcreteProductA1;
import com.designPatterns.abstractFactory.product.ConcreteProductB1;
import com.designPatterns.abstractFactory.product.ProductA;
import com.designPatterns.abstractFactory.product.ProductB;

public class ConcreteFactory1 implements Factory {

  private ProductA productA;
  private ProductB productB;

  public ConcreteFactory1() {
    this.productA = new ConcreteProductA1();
    this.productB = new ConcreteProductB1();
  }

  @Override
  public ProductA getProductA() {
    return this.productA;
  }

  @Override
  public ProductB getProductB() {
    return this.productB;
  }

}
