package com.designPatterns.state.example;

public interface GateState {
  //just to delegate
  
  void enter();

  void pay();

  void payOk();

  void payFailed();
}
