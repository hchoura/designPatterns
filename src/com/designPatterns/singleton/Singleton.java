package com.designPatterns.singleton;

public class Singleton {
  
  private static Singleton instance;
  
  private Singleton() {

  }

  public static Singleton getInstance() {
    instance = instance!= null ? instance : new Singleton();
    return instance;
    
  }

}
