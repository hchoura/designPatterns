package com.designPatterns.bridge.example;

public class ShortForm extends View{

  public ShortForm(Resource resource) {
    super(resource);
    // TODO Auto-generated constructor stub
  }

  @Override
  public String show() {
    System.out.println("display in short format");
    return this.resource.snippet();
  }

}
