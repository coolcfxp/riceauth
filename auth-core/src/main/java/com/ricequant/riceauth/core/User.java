package com.ricequant.riceauth.core;

public class User<ExtendedType extends User> {

  private long id;

  private String name;

  public long id() {
    return this.id;
  }

  public ExtendedType id(long id) {
    this.id = id;
    return (ExtendedType) this;
  }

  public String name() {
    return this.name;
  }

  public ExtendedType name(String name) {
    this.name = name;
    return (ExtendedType) this;
  }

}
