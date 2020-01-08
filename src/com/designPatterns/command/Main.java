package com.designPatterns.command;

/*
 * command pattern encapsulate a request (demand) as
 * an object thereby letting you parameterize other (command object) objects with
 * different requests queue or log request and
 * support undoable operations. (do and undo)
 * 
 * the command is encapsulated
 */
public class Main {
  
  public static void main(String[] args) {
    Light l = new Light();
    Invoker invoker1 = new Invoker(new LightOnCommand(l), new LightOffCommand(l), null, null);

    invoker1.clickOn();
    invoker1.clickOff();
    
    invoker1.getLastCommand().unexecute();
    invoker1.getLastCommand().execute();
  }
 
}
