package com.designPatterns.abstractFactory;

import com.designPatterns.abstractFactory.product.ConcreteProductA3;
import com.designPatterns.abstractFactory.product.ConcreteProductB3;
import com.designPatterns.abstractFactory.product.ProductA;
import com.designPatterns.abstractFactory.product.ProductB;

public class ConcreteFactory3 implements Factory {
  
  private ProductA productA;
  private ProductB productB;

  public ConcreteFactory3() {
    this.productA = new ConcreteProductA3();
    this.productB = new ConcreteProductB3();
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
