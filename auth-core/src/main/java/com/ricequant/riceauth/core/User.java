package com.ricequant.riceauth.core;

import com.ricequant.riceauth.core.api.UserEntity;

import java.util.ArrayList;
import java.util.List;

public class User implements UserEntity {

  private String id;

  private String name;

  private List<UserEntity> children = new ArrayList<>();

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
  public UserEntity appendSubUser(UserEntity... user) {
    for (UserEntity node : user)
      children.add(node);
    return this;
  }

  @Override
  public UserEntity clearSubUsers() {
    children.clear();
    return this;
  }

  @Override
  public UserEntity replaceSubUsers(UserEntity... users) {
    children.clear();
    appendSubUser(users);
    return this;
  }

  @Override
  public List<? extends UserEntity> subUsers() {
    return new ArrayList<>(children);
  }

  @Override
  public boolean hasSubUsers() {
    return children.size() > 0;
  }

}
