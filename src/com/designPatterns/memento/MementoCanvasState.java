package com.designPatterns.memento;

public class MementoCanvasState {

  private Object state;

  public MementoCanvasState(Object state){
     this.state = state;
  }

  public Object getState(){
     return state;
  }    
}
