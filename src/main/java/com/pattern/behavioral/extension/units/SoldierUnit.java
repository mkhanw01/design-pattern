package com.pattern.behavioral.extension.units;

import com.pattern.behavioral.extension.extensionApi.UnitExtension;
import com.pattern.behavioral.extension.extensionImpl.Soldier;

/**
 * Created by khan on 4/5/18.
 */
public class SoldierUnit extends Unit {

  public SoldierUnit(String name) {
    super(name);
  }

  @Override
  public UnitExtension getUnitExtension(String extensionName) {
    if(extensionName.equals("SoldierExtension")){
      if(unitExtension == null ){
        unitExtension = new Soldier(this);
      }
      return unitExtension;
    }
    return super.getUnitExtension(extensionName);
  }
}
