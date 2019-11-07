package com.ricequant.riceauth.core.api;

import java.util.List;

public interface User {

  String id();

  User id(String id);

  String name();

  User name(String name);

  User appendUser(User... user);

  User clearChildren();

  User replaceChildren(User... user);

  List<? extends User> children();

}
