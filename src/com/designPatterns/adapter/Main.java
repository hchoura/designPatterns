package com.designPatterns.adapter;//Wrapper
/*
 * the difference are Adapter pattern is about making 2 interfaces
 * (contract) that aren't compatible
 * Facade pattern is about taking a bunch of complex interactions
 * and creating a facade that you can use instead of dealing with
 * complex objects and complex interactions
 *   
 * proxy is a way of placing a intermediate between an object you want to
 * call. The reasons could be for examples: security, caching.
 * 
 * Decorator is a way of adding behaviour to some particular object
 * without actually opening that up and changing that object.
 * 
 * Adapter convert the interface of class into another interface 
 * that the client expect. (not modify the behaviour)
 * just accessibility (example : the order of the arguments)
 * has an adaptee (composition)
 */

public class Main {
  
  public static void main(String[] args) {
    ITarget target = new Adapter(new Adaptee());
    target.request();
  }
}
