package com.pattern.behavioral.command;

/**
 * Created by khan on 3/30/18.
 */
public class ShrinkSpell extends Command {

  private Size oldSize;
  private Target target;

  @Override
  public void execute(Target target) {
    oldSize = target.getSize();
    target.setSize(Size.SMALL);
    this.target = target;
  }

  @Override
  public void undo() {
    if (oldSize != null && target != null) {
      Size size = target.getSize();
      target.setSize(oldSize);
      oldSize = size;
    }
  }

  @Override
  public void redo() {
    undo();
  }

  @Override
  public String toString() {
    return "Shrink spell";
  }
}
