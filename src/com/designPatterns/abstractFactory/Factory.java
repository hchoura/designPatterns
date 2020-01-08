package com.designPatterns.abstractFactory;

import com.designPatterns.abstractFactory.product.ProductA;
import com.designPatterns.abstractFactory.product.ProductB;

public interface Factory {
  ProductA getProductA();
  ProductB getProductB();
}
