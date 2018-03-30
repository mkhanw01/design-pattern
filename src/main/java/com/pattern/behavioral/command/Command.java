package com.pattern.behavioral.command;

/**
 * Created by khan on 3/29/18.
 */
public abstract class Command {

public abstract void execute(Target target);
public abstract void undo();
public abstract void redo();

  @Override
  public abstract String toString();
}
