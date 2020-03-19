package com.ricequant.riceauth.core.api;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Set;

public interface Profile {

  Set<UserEntity> users();

  Set<UserEntity> users(Set<PermItem> perms);

  Set<PermItem> perms(Set<UserEntity> users);

  Profile addPerms(PermItem... perm);

  // default scheme is inherit
  Set<Pair<UserEntity, PermItem>> associate(UserEntity user, PermItem perm, PermPolicy policy);

  Set<Pair<UserEntity, PermItem>> associate(UserEntity user, PermItem perm, PermPolicy policy,
          PopulatingScheme popScheme);


}
