package com.ricequant.riceauth.core.api;

public interface PermInstance {

  PermItem item();

  PermPolicy policy();

  AuthEntityNode user();
}
