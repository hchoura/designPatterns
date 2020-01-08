package com.designPatterns.strategy;

import com.designPatterns.strategy.IDisplayBehaviourStrategy.IDisplayBehaviour;
import com.designPatterns.strategy.IFlyBehaviourStrategy.IFlyBehaviour;
import com.designPatterns.strategy.IQuackBehaviourStrategy.IQuackBehaviour;

/*
 * each Duck have a fly behaviour.
 * we need to delegate to the IFlyB the get the appropriate Fly.
 */
public class Duck {

  private IQuackBehaviour   quack;
  private IFlyBehaviour     fly;
  private IDisplayBehaviour display;

  public Duck(IFlyBehaviour fly, IQuackBehaviour quack, IDisplayBehaviour display) {
    this.quack = quack;
    this.fly = fly;
    this.display = display;
  }

  String Fly() {
    return  this.fly.fly();
  }

  String quack() {
    return this.quack.quack();

  }

  String display() {
    return this.display.display();
   
  }
  
  public String toString() {
    return " \n\t is able to "+this.Fly()+
        "\n\t is able to "+this.quack()+
        "\n\t is able to "+this.display();
    
  }

}
