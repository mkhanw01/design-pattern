package com.pattern.behavioral.extension;

import com.pattern.behavioral.extension.extensionApi.CommanderExtension;
import com.pattern.behavioral.extension.extensionApi.SoldierExtension;
import com.pattern.behavioral.extension.units.CommanderUnit;
import com.pattern.behavioral.extension.units.SoldierUnit;
import com.pattern.behavioral.extension.units.Unit;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by khan on 4/5/18.
 */
@Slf4j
public class ExtensionObjectApplication {


  public static void main(String[] args) {
    Unit soldierUnit = new SoldierUnit("SoldierUnit..");
    Unit commanderUnit = new CommanderUnit("CommanderUnit..");

    checkExtensionForUnit(soldierUnit);
    checkExtensionForUnit(commanderUnit);
  }

  private static void checkExtensionForUnit(Unit unit) {

    SoldierExtension soldierExtension =
        (SoldierExtension) unit.getUnitExtension("SoilderExtension");
    CommanderExtension commanderExtension =
        (CommanderExtension) unit.getUnitExtension("CommanderExtension");

    if (soldierExtension != null) {
      soldierExtension.soldierReady();
    } else {
      log.info(unit.getName() + "Without soldierExtension");
    }

    if (commanderExtension != null) {
      commanderExtension.commanderReady();
    } else {
      log.info(unit.getName() + "without CommanderExtension");
    }
  }
}
