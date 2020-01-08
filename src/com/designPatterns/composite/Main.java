package com.designPatterns.composite;

import java.util.ArrayList;
import java.util.List;

import com.designPatterns.composite.example.Project;
import com.designPatterns.composite.example.ToDo;
import com.designPatterns.composite.example.ToDoList;

/*
 * list or an object are treated as the same (unified)
 * the same hierarchy
 * 
 * the composite pattern composes objects into tree 
 * structures to represent part-whole hierarchies composite let's 
 * clients treat individual objects and compositions 
 * of objects uniformly
 * 
 * composite pattern composes objects into tree structure
 * 
 */
public class Main {
  
  public static void main(String[] args) {

    List<ToDoList> mainTodos = new ArrayList<ToDoList>();
    mainTodos.add(new Project("one", null));
    mainTodos.add(new Project("two", null));
    mainTodos.add(new Project("three", null));

    List<ToDoList> todos = new ArrayList<ToDoList>();
    todos.add(new ToDo("four1"));
    todos.add(new ToDo("four2"));

    mainTodos.add(new Project("four", todos));

    for ( ToDoList toDoList : mainTodos ) {
      System.out.println(toDoList.toHTML());
    }
  }

}
