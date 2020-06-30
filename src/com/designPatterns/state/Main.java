package com.designPatterns.state;

import com.designPatterns.state.example.Gate;

/*
 * the state pattern allows an object to alter its behavior,
 * when its internal state changes the object will appear to change its class
 */
public class Main {
/*
 * action   enter   pay     payOk   payFailed
 * state    ---------------------------------
 * closed   c       proc     c       c
 * open     c       o        o       o
 * Proc     proc    proc     o       c
 */
  
  public static void main(String[] args) {
    Gate gate = new Gate();//close by default

    gate.enter();
    gate.payFailed();
    gate.pay();
    gate.pay();
    gate.payOk();
    gate.payFailed();
    gate.enter();
    gate.enter();
  }

}
