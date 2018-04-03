package com.pattern.behavioral.delegation;

import com.pattern.behavioral.delegation.printer.CanonPrinter;
import com.pattern.behavioral.delegation.printer.EpsonPrinter;
import com.pattern.behavioral.delegation.printer.SonyPrinter;

/**
 * Created by khan on 4/3/18.
 */

/**
 * The delegate pattern provides a mechanism to abstract away the implementation and control of the desired action.
 * The class being called in this case {@link PrinterController} is not responsible for the actual desired action,
 * but is actually delegated to a helper class either {@link CanonPrinter}, {@link EpsonPrinter} or {@link SonyPrinter}.
 * The consumer does not have or require knowledge of the actual class carrying out the action, only the
 * container on which they are calling.
 *
 * In this example the delegates are {@link EpsonPrinter}, {@link SonyPrinter} and {@link CanonPrinter} they all implement
 * {@link Printer}. The {@link PrinterController} class also implements {@link Printer}. However neither provide the
 * functionality of {@link Printer} by printing to the screen, they actually call upon the instance of {@link Printer}
 * that they were instantiated with. Therefore delegating the behaviour to another class.
 */

public class DelegationApplication {


  private static final String MESSAGE_TO_PRINT = "message to print";

  public static void main(String[] args) {

    PrinterController canonPrinter = new PrinterController(new CanonPrinter());
    PrinterController epsonPrinter = new PrinterController(new EpsonPrinter());
    PrinterController sonyPrinter = new PrinterController(new SonyPrinter());
    canonPrinter.print(MESSAGE_TO_PRINT);
    epsonPrinter.print(MESSAGE_TO_PRINT);
    sonyPrinter.print(MESSAGE_TO_PRINT);
  }

}
