package com.designPatterns.command;

public class Command implements ICommand {
  Receiver reciever;

  Command(Receiver reciever) {
    this.reciever = reciever;
  }

  @Override
  public void execute() {

  }

  @Override
  public void unexecute() {

  }
}
