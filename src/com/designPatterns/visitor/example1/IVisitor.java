package com.designPatterns.visitor.example1;

public interface IVisitor {

  void visit(Floor floor);

  void visit(Elevator elevator);

}
