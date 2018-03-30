package com.pattern.behavioral.command;

/**
 * Created by khan on 3/29/18.
 */
public enum Size {
  SMALL("small"), NORMAL("normal");
  private String title;

  Size(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return title;
  }
}