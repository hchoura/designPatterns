package com.designPatterns.adapter;

public class Adapter implements ITarget {
  Adaptee adaptee;

  public Adapter(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  @Override
  public void request() {
    System.out.println("the request is adapted");// (change param)
    this.adaptee.specificRequest();

  }

}
