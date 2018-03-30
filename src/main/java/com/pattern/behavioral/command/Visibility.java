package com.pattern.behavioral.command;

/**
 * Created by khan on 3/29/18.
 */
public enum Visibility {
  VISIBLE("visible"), INVISIBLE("invisible");
  private String title;

  Visibility(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return title;
  }
}
