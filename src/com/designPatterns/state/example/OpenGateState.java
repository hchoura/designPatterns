package com.designPatterns.state.example;

public class OpenGateState implements GateState {
  Gate gate;// to change the state

  OpenGateState(Gate gate) {
    super();
    this.gate = gate;
  }

  @Override
  public void enter() {
    System.out.println("the gate is closed; see you.");
    this.gate.changeState(new CloseGateState(this.gate));

  }

  @Override
  public void pay() {
    // TODO Auto-generated method stub
    System.out.println("the gate is open. Thanks for payment");
  }

  @Override
  public void payOk() {
    // TODO let user in
    System.out.println("the gate is open. Thanks for payment");
    // this.gate.changeState(new CloseGateState(this.gate));

  }

  @Override
  public void payFailed() {
    System.out.println("the gate is open. Thanks for payment");
    // this.gate.changeState(new CloseGateState(this.gate));
  }

}
