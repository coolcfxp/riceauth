package com.ricequant.riceauth.core.api;

import java.util.List;

public interface AuthEntityNode {

  long id();

  AuthEntityNode id(long id);

  String name();

  AuthEntityNode name(String name);

  AuthEntityNode appendAuthables(AuthEntityNode... nodes);

  AuthEntityNode clearChildren();

  AuthEntityNode replaceChildren(AuthEntityNode... nodes);

  List<? extends AuthEntityNode> children();

}
