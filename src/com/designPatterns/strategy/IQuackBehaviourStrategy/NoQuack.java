package com.designPatterns.strategy.IQuackBehaviourStrategy;

public class NoQuack implements IQuackBehaviour {

  @Override
  public String quack() {
    return "No Quack";

  }

}
