package com.designPatterns.decorator;

import com.designPatterns.decorator.concreteComponent.Decaf;
import com.designPatterns.decorator.concreteComponent.Espress;
import com.designPatterns.decorator.concreteDecorator.Caramel;
import com.designPatterns.decorator.concreteDecorator.Milk;

/*
 * change behiavour in the run time not on the compilation time.
 * without rewrite inner obj and outer obj
 * obj wrap an other object
 * 2 object in the same type
 * is-a and has-a
 * additional responsibility to the object dynamically(runtime)
 * Flexible alternative for subclass (extend functionality)
 * 
 * Inheritance is not for code reuse, not for charing behavior.
 * composition is for code reuse, for charing behavior.
 * 
 * composition can combine several behavior.
 * inheritance, you inherit one class.
 * 
 * base concept and additional decorator.
 * Separate the concert 
 * 
 */

public class Main {

  public static void main(String[] args) {
    Beverage b = new Caramel(new Espress());
    System.out.println(b.getDescription()+" "+ b.cost());
    
    Beverage b1 = new Caramel(new Milk( new Espress()));
    System.out.println(b1.getDescription()+" "+ b1.cost());

    Beverage b2 = new Caramel(new Milk( new Decaf()));
    System.out.println(b2.getDescription()+" "+ b2.cost());

  }

}
