package com.ricequant.riceauth.core.api;

import java.util.List;

public interface UserEntity {

  String id();

  UserEntity id(String id);

  String name();

  UserEntity name(String name);

  UserEntity appendSubUser(UserEntity... user);

  UserEntity clearSubUsers();

  UserEntity replaceSubUsers(UserEntity... users);

  List<? extends UserEntity> subUsers();

  boolean hasSubUsers();

}
