package com.designPatterns.abstractFactory;

/*
 * it is a set of factory methods that provide an interface for creating
 * a family of concrete independent or related object without specifying 
 * the concrete classes
 * 
 * so if you contrast this to the factory method pattern the single 
 * difference between these two is that the factory method pattern 
 * constructs a single object and the abstract Factory construct
 * multiple objects 
 *  
 * DI 
 * family of related object
 * in the concrete factory, the products are related (or composable) 
 * 
 */
public class Main {

  public static void main(String[] args) {
    Factory prod1 = new ConcreteFactory1();
    System.out.println(prod1.getProductA().getClass());
    System.out.println(prod1.getProductB().getClass());
    
    Factory prod2 = new ConcreteFactory2();
    System.out.println(prod2.getProductA().getClass());
    System.out.println(prod2.getProductB().getClass());
    
  }
}
