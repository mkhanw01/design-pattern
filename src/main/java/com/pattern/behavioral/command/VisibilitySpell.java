package com.pattern.behavioral.command;

/**
 * Created by khan on 3/30/18.
 */
public class VisibilitySpell extends Command {

  private Target target;


  @Override
  public void execute(Target target) {
    target.setVisibility(Visibility.INVISIBLE);
    this.target = target;
  }

  @Override
  public void undo() {
    if (target != null) {
      target.setVisibility(Visibility.VISIBLE);
    }
  }

  @Override
  public void redo() {
    if(target != null) {
      target.setVisibility(Visibility.INVISIBLE);
    }
  }

  @Override
  public String toString() {
    return "Visibility Spell";
  }
}
