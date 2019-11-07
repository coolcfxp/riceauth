package com.ricequant.riceauth.core.api;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Set;

public interface Profile {

  Set<User> users();

  Set<User> users(Set<PermItem> perms);

  Set<PermItem> perms(Set<User> users);

  Profile addPerms(PermItem... perm);

  // default scheme is inherit
  Set<Pair<User, PermItem>> associate(User user, PermItem perm, PermPolicy policy);

  Set<Pair<User, PermItem>> associate(User user, PermItem perm, PermPolicy policy,
          PopulatingScheme popScheme);


}
