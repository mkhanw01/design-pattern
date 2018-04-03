package com.pattern.behavioral.delegation.printer;

import com.pattern.behavioral.delegation.Printer;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by khan on 4/3/18.
 */
@Slf4j
public class SonyPrinter implements Printer {

  @Override
  public void print(String message) {
    log.info("SonyPrinter: {}", message);
  }
}
