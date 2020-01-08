package com.designPatterns.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

  private List<ICommand> cmd;

  ICommand on;
  ICommand off;
  ICommand up;
  ICommand down;

  // use in the queue, to keep the list of cmd
  void setCommand(ICommand cmd) {
    this.cmd.add(cmd);
  }

  List<ICommand> getCommand() {
    return this.cmd;
  }

  ICommand getLastCommand() {
    return this.cmd.get(this.cmd.size() - 1);
  }

  public Invoker(ICommand on, ICommand off, ICommand up, ICommand down) {
    this.on = on;
    this.off = off;
    this.up = up;
    this.down = down;
    this.cmd = new ArrayList<ICommand>();
  }

  public void clickOn() {
    this.on.execute();
    setCommand(this.on);
  }

  public void clickOff() {
    this.off.execute();
    setCommand(this.off);
  }

}
