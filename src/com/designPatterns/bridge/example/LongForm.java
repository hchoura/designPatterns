package com.designPatterns.bridge.example;

public class LongForm extends View {

  public LongForm(Resource resource) {
    super(resource);

  }

  @Override
  public String show() {
    System.out.println("display in long format");
    return "The long format of the response is : " + this.resource.snippet();
    // you can add more html
  }

}
