package com.ricequant.riceauth.core.api;

import java.util.Set;

public interface Application {

  String name();

  Application name(String name);

  String id();

  Application id(String id);

  Set<Role> roles();

  Application roles(Role... roles);
}
