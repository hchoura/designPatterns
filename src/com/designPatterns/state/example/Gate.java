package com.designPatterns.state.example;

public class Gate {

  GateState state;

  public Gate() {// GateState state
    super();
    this.state = new CloseGateState(this);
    System.out.println("create closed gate");
  }

  public void enter() {
    this.state.enter();
  }

  public void pay() {
    this.state.pay();
  }

  public void payOk() {
    this.state.payOk();
  }

  public void payFailed() {
    this.state.payFailed();
  }

  public void changeState(GateState state) {
    this.state = state;

  }
}
