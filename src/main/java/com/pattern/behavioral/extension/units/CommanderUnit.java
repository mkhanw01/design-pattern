package com.pattern.behavioral.extension.units;

import com.pattern.behavioral.extension.extensionApi.UnitExtension;
import com.pattern.behavioral.extension.extensionImpl.Commander;

/**
 * Created by khan on 4/5/18.
 */
public class CommanderUnit extends Unit {

  public CommanderUnit(String name) {
    super(name);
  }

  @Override
  public UnitExtension getUnitExtension(String extensionName) {
    if(extensionName.equals("CommanderExtension")){
      if(unitExtension == null){
        unitExtension = new Commander(this);
      }
      return unitExtension;
    }
    return super.getUnitExtension(extensionName);
  }
}
