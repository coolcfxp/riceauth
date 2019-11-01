package com.ricequant.riceauth.core.api;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Set;

public interface Profile {

  Set<AuthEntityNode> users();

  Set<AuthEntityNode> users(Set<PermItem> perms);

  Set<PermItem> perms(Set<AuthEntityNode> users);

  Profile addPerms(PermItem... perm);

  // default scheme is inherit
  Set<Pair<AuthEntityNode, PermItem>> associate(AuthEntityNode user, PermItem perm, PermPolicy policy);

  Set<Pair<AuthEntityNode, PermItem>> associate(AuthEntityNode user, PermItem perm, PermPolicy policy,
          PopulatingScheme popScheme);
}
