package com.designPatterns.command;

public class LightOffCommand implements ICommand {
  Light l;

  LightOffCommand(Light l) {
    this.l = l;
  }

  @Override
  public void execute() {
    this.l.off();

  }

  @Override
  public void unexecute() {
    this.l.on();

  }
}
