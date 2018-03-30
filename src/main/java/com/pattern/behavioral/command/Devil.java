package com.pattern.behavioral.command;

/**
 * Created by khan on 3/30/18.
 */
public class Devil extends  Target {

  public Devil() {
    setSize(Size.NORMAL);
    setVisibility(Visibility.VISIBLE);
  }

  @Override
  public String toString() {
    return "Devil";
  }
}
