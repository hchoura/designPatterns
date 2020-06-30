package com.designPatterns.command.example;

import com.designPatterns.command.ICommand;

public class LightOnCommand implements ICommand {
  Light l;

  public LightOnCommand(Light l) {
    this.l = l;
  }

  @Override
  public void execute() {
    this.l.on();

  }

  @Override
  public void unexecute() {
    this.l.off();

  }
}
