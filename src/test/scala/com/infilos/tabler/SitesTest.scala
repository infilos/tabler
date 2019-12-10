package com.infilos.tabler

import korolev._
import korolev.akkahttp._
import korolev.execution._
import korolev.server._
import korolev.state.javaSerialization._
import levsha.dsl._
import levsha.dsl.html._

import scala.concurrent.Future

/**
 * @author mowen on 2019-12-09.
 *
 */

object SitesTest extends SimpleAkkaHttpKorolevApp {

  private val GlobalContext = Context[Future,Any,Any]
  import GlobalContext._
  import symbolDsl._

  private val dragged = elementId(Some("clientx"))

  override def service:AkkaHttpService = akkaHttpService(
    KorolevServiceConfig[Future,Any,Any](
      stateLoader = StateLoader.default(),
      head = Sites.head("Demo"),
      render = _ => optimize(
        body(
          div(
            Headers.H1("This is an h1"),
            Headers.H2("This is an h2"),
            Headers.H3("This is an h3"),
            Headers.H4("This is an h4"),
            Headers.H5("This is an h5"),
            Headers.H6("This is an h6"),
            div(
              Headers.H5("This is an h5"),
              Headers.H6("This is an h6")
            )
          ),
          div(
            Icons("user"),
            Icons("gb"),
            Icons("visa", Icons.Props().asPayment),
            Icons("user", Icons.Props().asFlag),
            Icons("user", Icons.Props().asLink("https://baidu.com")),
            Icons("user", Icons.Props().asAriaHidden),
          )
        )
      )
    )
  )
}
