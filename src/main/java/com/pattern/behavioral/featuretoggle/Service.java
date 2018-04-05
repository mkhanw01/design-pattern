package com.pattern.behavioral.featuretoggle;

import com.pattern.behavioral.featuretoggle.user.User;

/**
 * Created by khan on 4/5/18.
 */
public interface Service {

  String getWelcomeMessage(User user);
  boolean isEnhanced();
}
