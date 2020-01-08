package com.designPatterns.command;

public class LightOnCommand implements ICommand {
  Light l;

  LightOnCommand(Light l) {
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
