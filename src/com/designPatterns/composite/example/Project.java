package com.designPatterns.composite.example;

import java.util.List;

public class Project implements ToDoList {
  String         title;
  List<ToDoList> todos;// todoList

  public Project(String title, List<ToDoList> todos) {

    this.title = title;
    this.todos = todos;
  }

  @Override
  public String toHTML() {
    String html = "<h1>" + this.title + "</h1>";

    if ( todos == null ) return html;
    html += "<ul>";

    for ( ToDoList toDoList : todos ) {
      html += "<li>" + toDoList.toHTML() + "</li>";
    }

    html += "</ul>";
    return html;

  }

}
