package com.pattern.behavioral.extension.extensionImpl;

import com.pattern.behavioral.extension.extensionApi.SoldierExtension;
import com.pattern.behavioral.extension.units.SoldierUnit;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by khan on 4/5/18.
 */

@Slf4j
public class Soldier implements SoldierExtension {

  private SoldierUnit unit;
  public Soldier(SoldierUnit unit) {
    this.unit = unit;
  }

  @Override
  public void soldierReady() {
    log.info("[Soldier]" + unit.getName() + "is Ready !");
  }
}
