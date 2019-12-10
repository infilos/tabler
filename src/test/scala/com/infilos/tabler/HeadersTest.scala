package com.infilos.tabler

import levsha.text.{renderHtml => render}
import org.scalatest.FunSuite

/**
 * @author mowen on 2019-12-06.
 *
 */

class HeadersTest extends FunSuite {

  test("headers") {
    println(render(Headers.H1("Header 1")))
    println(render(Headers.H2("Header 2")))
    println(render(Headers.H3("Header 3")))
    println(render(Headers.H4("Header 4")))
    println(render(Headers.H5("Header 5")))
    println(render(Headers.H6("Header 6")))
  }
}
