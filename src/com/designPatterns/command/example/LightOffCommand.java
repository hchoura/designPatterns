package com.designPatterns.command.example;

import com.designPatterns.command.ICommand;

public class LightOffCommand implements ICommand {
  Light l;

  public LightOffCommand(Light l) {
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
