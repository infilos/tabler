package com.infilos.tabler

import korolev.Async
import korolev.Context
import levsha.Document
import levsha.dsl._
import levsha.dsl.html._

/**
 * @author mowen on 2019-12-09.
 *
 */

object Sites {

  def head[F[_]:Async, S, M](htmlPageTitle:String): S => Seq[Document.Node[Context.Binding[F,S,M]]] = {
    _:S => Seq(
      title(htmlPageTitle),
      meta(charset := "UTF-8"),
      meta(
        name := "viewport",
        content := "width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"
      ),
      meta(
        `http-equiv` := "X-UA-Compatible",
        content := "ie=edge"
      ),
      meta(
        `http-equiv` := "Content-Language",
        content := "en"
      ),
      meta(
        name := "msapplication-TileColor",
        content := "#2d89ef"
      ),
      meta(
        name := "theme-color",
        content := "#4188c9"
      ),
      meta(
        name := "apple-mobile-web-app-status-bar-style",
        content := "black-translucent"
      ),
      meta(
        name := "apple-mobile-web-app-capable",
        content := "yes"
      ),
      meta(
        name := "mobile-web-app-capable",
        content := "yes"
      ),
      meta(
        name := "HandheldFriendly",
        content := "True"
      ),
      meta(
        name := "MobileOptimized",
        content := "320"
      ),
      link(
        rel := "icon",
        href := "/favicon.ico",
        `type` := "image/x-icon"
      ),
      link(
        rel := "shortcut icon",
        `type` := "image/x-icon",
        href := "/favicon.ico"
      ),
      link(
        rel := "stylesheet",
        href := "/static/css/font-awesome.min.css"
      ),
      link(
        rel := "stylesheet",
        href := "/static/css/fonts-googleapis.css"
      ),
      script(
        src := "/static/js/require.min.js"
      ),
      script(
        """requirejs.config({
                  baseUrl: '.'
              });"""
      ),
      //  Dashboard Core ,
      link(
        href := "/static/css/dashboard.css",
        rel := "stylesheet"
      ),
      script(
        src := "/static/js/dashboard.js"
      ),
      //  c3.js Charts Plugin ,
      link(
        href := "/static/plugins/charts-c3/plugin.css",
        rel := "stylesheet"
      ),
      script(
        src := "/static/plugins/charts-c3/plugin.js"
      ),
      //  Google Maps Plugin ,
      link(
        href := "/static/plugins/maps-google/plugin.css",
        rel := "stylesheet"
      ),
      script(
        src := "/static/plugins/maps-google/plugin.js"
      ),
      //  Input Mask Plugin ,
      script(
        src := "/static/plugins/input-mask/plugin.js"
      ),
      link(
        href := "/static/css/tabler.css",
        rel := "stylesheet",
        `type` := "text/css"
      )
    )
  }
}
