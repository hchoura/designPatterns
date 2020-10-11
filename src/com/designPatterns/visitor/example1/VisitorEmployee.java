package com.designPatterns.visitor.example1;

public class VisitorEmployee implements IVisitor {

  String name;
  
  public VisitorEmployee(String name) {
    super();
    this.name = name;
  }

  @Override
  public void visit(Floor floor) {
    System.out.println("visitor :" + this.name + " is in this floor " + floor.getFloorNbr());

  }

  @Override
  public void visit(Elevator elevator) {
    System.out.println("visitor :" + this.name + " is in this floor " + elevator.getElevatorNbr());

  }

}
