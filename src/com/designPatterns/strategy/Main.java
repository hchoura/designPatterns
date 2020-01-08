package com.designPatterns.strategy;

import com.designPatterns.strategy.IDisplayBehaviourStrategy.DisplayAsGraphical;
import com.designPatterns.strategy.IDisplayBehaviourStrategy.DisplayAsText;
import com.designPatterns.strategy.IFlyBehaviourStrategy.JetFly;
import com.designPatterns.strategy.IFlyBehaviourStrategy.NoFly;
import com.designPatterns.strategy.IFlyBehaviourStrategy.SimpleFly;
import com.designPatterns.strategy.IQuackBehaviourStrategy.NoQuack;
import com.designPatterns.strategy.IQuackBehaviourStrategy.SimpleQuackBehaviour;

/*
 * using composition rather than inheritance 
 * code reuse
 * encapsulation (to be reusable and interchangeable)
 * independently for the client that use it.
 * change in the implementation
 * cross hierarchy functionality.
 * need functionality cross the hierarchies. (duplicate code)
 * 
 * extact the funcitonality
 * create stategy===> create interface (or abstract)
 * 
 * there are no need to create class for each concept.
 * Just we need to create a configuration each time we need a new concept.
 */
public class Main {

  public static void main(String[] args) {

    Duck cityDuck = new Duck(new SimpleFly(), new SimpleQuackBehaviour(), new DisplayAsGraphical());
    System.out.println("the City DUck is " + cityDuck.toString());
    
    Duck cloudDuck = new Duck(new JetFly(), new SimpleQuackBehaviour(), new DisplayAsGraphical());
    System.out.println("the Cloud DUck is " + cloudDuck.toString());
    
    Duck mountainDuck = new Duck(new JetFly(), new SimpleQuackBehaviour(), new DisplayAsGraphical());
    System.out.println("the Mountain DUck is " + mountainDuck.toString());
    
    Duck wildDuck = new Duck(new SimpleFly(), new SimpleQuackBehaviour(), new DisplayAsGraphical());
    System.out.println("the Wild DUck is " + wildDuck.toString());
    
    Duck rubberDuck = new Duck(new NoFly(), new NoQuack(), new DisplayAsText());
    System.out.println("the Rubber DUck is " + rubberDuck.toString());

    cityDuck.Fly();
  }

}
