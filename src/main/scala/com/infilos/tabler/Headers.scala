package com.infilos.tabler

import levsha.Document
import levsha.dsl._
import levsha.dsl.html._

/**
 * @author mowen on 2019-12-06.
 *
 */

object Headers {

  def H1(header:String):Document.Node[Nothing] = h1(clazz := "h1 mt-0 mb-4", header)

  def H2(header:String):Document.Node[Nothing] = h2(clazz := "h2 mt-0 mb-4", header)

  def H3(header:String):Document.Node[Nothing] = h3(clazz := "h3 mt-0 mb-4", header)

  def H4(header:String):Document.Node[Nothing] = h4(clazz := "h4 mt-0 mb-4", header)

  def H5(header:String):Document.Node[Nothing] = h5(clazz := "h5 mt-0 mb-4", header)

  def H6(header:String):Document.Node[Nothing] = h6(clazz := "h6 mt-0 mb-4", header)
}
