package com.ricequant.riceauth.core;

import com.ricequant.riceauth.core.api.AuthEntityNode;

import java.util.ArrayList;
import java.util.List;

public class User implements AuthEntityNode {

  private long id;

  private String name;

  private List<AuthEntityNode> children = new ArrayList<>();

  public long id() {
    return this.id;
  }

  public User id(long id) {
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
  public AuthEntityNode appendAuthables(AuthEntityNode... nodes) {
    for (AuthEntityNode node : nodes)
      children.add(node);
    return this;
  }

  @Override
  public AuthEntityNode clearChildren() {
    children.clear();
    return this;
  }

  @Override
  public AuthEntityNode replaceChildren(AuthEntityNode... nodes) {
    children.clear();
    appendAuthables(nodes);
    return this;
  }

  @Override
  public List<? extends AuthEntityNode> children() {
    return new ArrayList<>(children);
  }

}
