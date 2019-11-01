package com.ricequant.riceauth.core;

public interface PermInstance {

  PermItem item();

  PermPolicy policy();

  AuthEntityNode user();
}
