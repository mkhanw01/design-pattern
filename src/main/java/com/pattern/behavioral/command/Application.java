package com.pattern.behavioral.command;

/**
 * Created by khan on 3/29/18.
 */
public class Application {

  public static void main(String[] args) {
    Wizard wizard = new Wizard();
    Devil devil = new Devil();

    devil.printStatus();

    wizard.castSpell(new ShrinkSpell(), devil);
    devil.printStatus();

    wizard.castSpell(new VisibilitySpell(), devil);
    devil.printStatus();

    wizard.undoLastSpell();
    devil.printStatus();

    wizard.undoLastSpell();
    devil.printStatus();

    wizard.redoLastSpell();
    devil.printStatus();

    wizard.redoLastSpell();
    devil.printStatus();
  }
}
