package com.ricequant.riceauth.web;

import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;

public class WebServer {

  private static WebServer server;

  private final Vertx vertx;

  public static void main(String[] args) {
    server = new WebServer();
    server.start();
  }

  WebServer() {
    vertx = Vertx.vertx();
    Router router = Router.router(vertx);
    router.route("/create-profile").handler(c -> {

    });
  }

  private void start() {

  }

}
