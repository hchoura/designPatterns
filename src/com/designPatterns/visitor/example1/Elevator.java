package com.designPatterns.visitor.example1;

public class Elevator implements IElement {
  
  private int ElevatorNbr;

  public int getElevatorNbr() {
    return ElevatorNbr;
  }

  public void setElevatorNbr(int elevatorNbr) {
    ElevatorNbr = elevatorNbr;
  }

  public Elevator(int elevatorNbr) {
    super();
    ElevatorNbr = elevatorNbr;
  }

  @Override
  public void accept(IVisitor visitor) {
    visitor.visit(this);

  }

}
