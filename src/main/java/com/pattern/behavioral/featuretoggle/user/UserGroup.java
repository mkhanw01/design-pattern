package com.pattern.behavioral.featuretoggle.user;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by khan on 4/5/18.
 */
public class UserGroup {

  private static List<User> freeGroup = new ArrayList<>();
  private static List<User> paidGroup = new ArrayList<>();


  public static void addUserToFreeGroup(final User user) {
    if (paidGroup.contains(user)) {
      throw new IllegalArgumentException("User already member of paid user");
    } else {
      if (!freeGroup.contains(user)) {
        freeGroup.add(user);
      }
    }
  }



  public static void addUserToPaidGroup(final User user) {

    if (freeGroup.contains(user)) {
      throw new IllegalArgumentException("User already member of free user");
    } else {
      if (!paidGroup.contains(user)) {
        freeGroup.add(user);
      }
    }
  }



  public static boolean isPaid(User user)  {
    return paidGroup.contains(user);
  }
}


