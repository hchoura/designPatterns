package com.designPatterns.command;

public class Light extends Receiver {

  public void on() {
    System.out.println("on");
    
  }

  public void off() {
    System.out.println("off");
    
  }

}
