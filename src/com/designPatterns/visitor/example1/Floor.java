package com.designPatterns.visitor.example1;

public class Floor implements IElement {
  
  private int floorNbr;

  public Floor(int floorNbr) {
    super();
    this.floorNbr = floorNbr;
  }

  @Override
  public void accept(IVisitor visitor) {
    visitor.visit(this);
    
  }

  public int getFloorNbr() {
    return floorNbr;
  }

  public void setFloorNbr(int floorNbr) {
    this.floorNbr = floorNbr;
  }

}
