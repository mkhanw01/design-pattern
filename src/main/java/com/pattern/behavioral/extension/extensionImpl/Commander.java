package com.pattern.behavioral.extension.extensionImpl;

import com.pattern.behavioral.extension.extensionApi.CommanderExtension;
import com.pattern.behavioral.extension.units.CommanderUnit;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by khan on 4/5/18.
 */
@Slf4j
public class Commander implements CommanderExtension {

  private CommanderUnit commanderUnit;

  public Commander(CommanderUnit commanderUnit) {
    this.commanderUnit = commanderUnit;
  }

  @Override
  public void commanderReady() {
    log.info("[Commander]" + commanderUnit.getName() + "is Ready! ");
  }
}
