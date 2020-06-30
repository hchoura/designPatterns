package com.designPatterns.command.example;

import com.designPatterns.command.Receiver;

public class Light extends Receiver {

  public void on() {
    System.out.println("on");
    
  }

  public void off() {
    System.out.println("off");
    
  }

}
