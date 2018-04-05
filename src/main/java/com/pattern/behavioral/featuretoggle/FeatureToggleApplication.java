package com.pattern.behavioral.featuretoggle;

import com.pattern.behavioral.featuretoggle.user.User;
import com.pattern.behavioral.featuretoggle.user.UserGroup;
import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

/**
 * Created by khan on 4/5/18.
 */
@Slf4j
public class FeatureToggleApplication {
  public static void main(String[] args) {
    final Properties properties = new Properties();
    properties.put("enhancedWelcome", true);
    Service service = new PropertiesFeatureToggleVersion(properties);
    final String welcomeMessage = service.getWelcomeMessage(new User("Jamine no code"));
    log.info("welcome message is: {}", welcomeMessage);



    final Properties turnedOff = new Properties();
    turnedOff.put("enhancedWelcome", false);
    Service turnedOffService = new PropertiesFeatureToggleVersion(turnedOff);
    final String welcomeMessageturnedOff = turnedOffService.getWelcomeMessage(new User("Jamie No Code"));
    log.info(welcomeMessageturnedOff);

    // --------------------------------------------

    Service service2 = new TieredFeatureToggleVersion();

    final User paidUser = new User("Jamie Coder");
    final User freeUser = new User("Alan Defect");

    UserGroup.addUserToPaidGroup(paidUser);
    UserGroup.addUserToFreeGroup(freeUser);

    final String welcomeMessagePaidUser = service2.getWelcomeMessage(paidUser);
    final String welcomeMessageFreeUser = service2.getWelcomeMessage(freeUser);
    log.info(welcomeMessageFreeUser);
    log.info(welcomeMessagePaidUser);
  }
}
