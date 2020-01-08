package com.designPatterns.composite.example;

public class ToDo implements ToDoList {
  String text;

  public ToDo(String text) {
    this.text = text;
  }

  @Override
  public String toHTML() {
    return this.text;

  }

}
