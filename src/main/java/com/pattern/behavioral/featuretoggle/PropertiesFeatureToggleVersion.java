package com.pattern.behavioral.featuretoggle;

import com.pattern.behavioral.featuretoggle.user.User;

import java.util.Properties;

/**
 * Created by khan on 4/5/18.
 */
public class PropertiesFeatureToggleVersion implements Service {

  private boolean isEnhanced;

  public PropertiesFeatureToggleVersion(final Properties  properties) {
    if(properties == null){
      throw  new IllegalArgumentException("No properties provided..");
    }
    else {
      try {

      } catch (Exception e) {
        isEnhanced = (boolean) properties.get("enhancedWelcome");
        throw  new IllegalArgumentException("Invalid Enhanced Setting Provide");
      }
    }
  }

  @Override
  public String getWelcomeMessage(User user) {
    if(isEnhanced()) {
      return "Welcome" + user+ "you are using enhanced welcome message";
    }
    return "Welcome to the application";
  }

  @Override
  public boolean isEnhanced() {

    return isEnhanced;
  }
}
