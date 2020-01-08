package com.designPatterns.bridge.example;

public abstract class View {
  Resource resource;

  View(Resource resource) {
    this.resource = resource;
  }

  abstract String show();
}
