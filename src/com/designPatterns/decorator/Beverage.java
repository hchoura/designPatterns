package com.designPatterns.decorator;
/*
 * to add chocolate, the open/close principle,
 * interface aggregation : a subclass should not be
 * forced to depend on method that it don't use
 * if you add tea, you will get an applicable method. 
 * 
 */
public abstract class Beverage {// can be interface

//  public abstract String getDescription();
  public String getDescription()
  {
    return null;
  }

  public abstract float cost() ;

}
