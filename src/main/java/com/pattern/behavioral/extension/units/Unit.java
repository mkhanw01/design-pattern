package com.pattern.behavioral.extension.units;

import com.pattern.behavioral.extension.extensionApi.UnitExtension;

/**
 * Created by khan on 4/5/18.
 */
public class Unit {

  private String name;
  protected UnitExtension unitExtension = null;

  public Unit(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public UnitExtension getUnitExtension(String extensionName) {
    return null;
  }

  public void setName(String name) {
    this.name = name;
  }
}
