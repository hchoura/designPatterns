package com.designPatterns.state.example;

public class CloseGateState implements GateState {
  Gate gate;

  public CloseGateState(Gate gate) {
    this.gate = gate;
  }

  @Override
  public void enter() {
    System.out.println("the gate remain closed; you need to pay");

  }

  @Override
  public void pay() {
    System.out.println("the payment in process; in process ...");
    this.gate.changeState(new ProcessGateState(this.gate));

  }

  @Override
  public void payOk() {
    System.out.println("the gate remain closed; you need to pay");

  }

  @Override
  public void payFailed() {
    System.out.println("the gate remain closed; you need to pay");

  }

}
