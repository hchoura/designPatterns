package com.designPatterns.abstractFactory;

import com.designPatterns.abstractFactory.product.ConcreteProductA2;
import com.designPatterns.abstractFactory.product.ConcreteProductB2;
import com.designPatterns.abstractFactory.product.ProductA;
import com.designPatterns.abstractFactory.product.ProductB;

public class ConcreteFactory2 implements Factory {

  private ProductA productA;
  private ProductB productB;

  public ConcreteFactory2() {
    this.productA = new ConcreteProductA2();
    this.productB = new ConcreteProductB2();
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
