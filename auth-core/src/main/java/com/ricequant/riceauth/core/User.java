package com.ricequant.riceauth.core;

import java.util.ArrayList;
import java.util.List;

public class User implements com.ricequant.riceauth.core.api.User {

  private String id;

  private String name;

  private List<com.ricequant.riceauth.core.api.User> children = new ArrayList<>();

  public String id() {
    return this.id;
  }

  public User id(String id) {
    this.id = id;
    return this;
  }

  public String name() {
    return this.name;
  }

  public User name(String name) {
    this.name = name;
    return this;
  }

  @Override
  public com.ricequant.riceauth.core.api.User appendUser(com.ricequant.riceauth.core.api.User... user) {
    for (com.ricequant.riceauth.core.api.User node : user)
      children.add(node);
    return this;
  }

  @Override
  public com.ricequant.riceauth.core.api.User clearUsers() {
    children.clear();
    return this;
  }

  @Override
  public com.ricequant.riceauth.core.api.User replaceUsers(com.ricequant.riceauth.core.api.User... nodes) {
    children.clear();
    appendUser(nodes);
    return this;
  }

  @Override
  public List<? extends com.ricequant.riceauth.core.api.User> users() {
    return new ArrayList<>(children);
  }

}
