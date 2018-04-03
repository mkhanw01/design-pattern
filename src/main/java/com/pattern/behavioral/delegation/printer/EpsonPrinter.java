package com.pattern.behavioral.delegation.printer;

import com.pattern.behavioral.delegation.Printer;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by khan on 4/3/18.
 */
@Slf4j
public class EpsonPrinter implements Printer {

  @Override
  public void print(String message) {
    log.info("Epson Printer: {}", message);
  }
}
