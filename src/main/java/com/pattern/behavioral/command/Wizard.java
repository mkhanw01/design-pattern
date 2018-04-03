package com.pattern.behavioral.command;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by khan on 3/30/18.
 */
@NoArgsConstructor
@Slf4j
public class Wizard {

  private Deque<Command> undoStack = new LinkedList<Command>();
  private Deque<Command> redoStack =  new LinkedList<Command>();

  /**
   * cast spell
   */
  public void castSpell(Command command, Target target) {
    log.info("{}, cast: {}, at: {}", this, command, target);
    command.execute(target);
    undoStack.offerLast(command);
  }

  /**
   * Undo last spell
   */
  public void undoLastSpell() {
    if(!undoStack.isEmpty()) {
      Command previousSpell = undoStack.pollLast();
      redoStack.offerLast(previousSpell);
      log.info(": {}, undo: {}", this, previousSpell);
      previousSpell.undo();
    }
  }

  /**
   *  redo last spell
   */

  public void redoLastSpell() {
    if(!redoStack.isEmpty()) {
      Command previousSpell = redoStack.pollLast();
      undoStack.offerLast(previousSpell);
      log.info(": {}, redo: {}", this, previousSpell);
      previousSpell.redo();
    }
  }

  @Override
  public String toString() {
    return "Wizard";
  }
}
