package com.pattern.behavioral.command;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by khan on 3/29/18.
 */

@Slf4j
@Data
public abstract class Target {

  private Size size;
  private Visibility visibility;

  @Override
  public abstract String toString();

  public void printStatus() {
    log.info("{}, [size={}] [visibility={}]", this, getSize(), getVisibility());
  }
}
