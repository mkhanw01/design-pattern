package com.pattern.behavioral.featuretoggle;

import com.pattern.behavioral.featuretoggle.user.User;
import com.pattern.behavioral.featuretoggle.user.UserGroup;

/**
 * Created by khan on 4/5/18.
 */
public class TieredFeatureToggleVersion implements Service {

  @Override
  public String getWelcomeMessage(User user) {
    if(UserGroup.isPaid(user)){
      return user+ "Thanks for paying for this awesome software ..";
    }
    return "I Suppose you can use this software ..";
  }

  @Override
  public boolean isEnhanced() {
    return true;
  }
}
