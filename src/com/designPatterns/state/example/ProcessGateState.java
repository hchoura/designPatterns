package com.designPatterns.state.example;

public class ProcessGateState implements GateState {
  Gate gate;

  public ProcessGateState(Gate gate) {
    this.gate = gate;
  }

  @Override
  public void enter() {
    System.out.println("the payment in process; in process ...");

  }

  @Override
  public void pay() {
    System.out.println("the payment in process; in process ...");

  }

  @Override
  public void payOk() {
    System.out.println("the gate is open. Thanks for payment");
    this.gate.changeState(new OpenGateState(this.gate));

  }

  @Override
  public void payFailed() {
    System.out.println("the gate remain closed; you need to pay");
    this.gate.changeState(new CloseGateState(this.gate));
  }

}
