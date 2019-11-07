package com.ricequant.riceauth.core.api;

import java.util.Set;

public interface Role {

  String name();

  Set<PermItem> perms();

  Role addPerms(PermItem... permItem);

  Role removePerms(PermItem... permItem);
}
