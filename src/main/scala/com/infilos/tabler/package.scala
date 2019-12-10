package com.infilos

import levsha.Document
import levsha.Document.Empty

/**
 * @author mowen on 2019-12-06.
 *
 */

package object tabler {

  def whenValue(prop:Boolean)(value:String):String = if(prop) value else ""

  def whenValue(prop:Option[String])(fmt: String => String):String = prop.map(fmt).getOrElse("")

  def whenAttri[T, D <: Document[T]](condition: Boolean)(doc: D): D =
    if (condition) doc else Empty.asInstanceOf[D]

  def whenAttri[T, D <: Document[T]](prop:Option[String])(fmt: String => D):D =
    prop.map(fmt).getOrElse(Empty.asInstanceOf[D])

  trait SizeProps {
    type SizePropsType <: SizeProps

    def size:Option[String] = None

    def Size(size:String):SizePropsType

    def SizeAsSmall:SizePropsType = Size("sm")
    def SizeAsMiddle:SizePropsType = Size("md")
    def SizeAsLarge:SizePropsType = Size("lg")
    def SizeAsXLarge:SizePropsType = Size("xl")
    def SizeAsXXLarge:SizePropsType = Size("xxl")
  }

  trait ColorProps {
    type ColorPropsType <: ColorProps

    def color:Option[String] = None

    def Color(color:String):ColorPropsType

    def ColorAsBlue:ColorPropsType = Color("blue")
    def ColorAsAzure:ColorPropsType = Color("azure")
    def ColorAsIndigo:ColorPropsType = Color("indigo")
    def ColorAsPurple:ColorPropsType = Color("purple")
    def ColorAsPink:ColorPropsType = Color("pink")
    def ColorAsRed:ColorPropsType = Color("red")
    def ColorAsYellow:ColorPropsType = Color("yellow")
    def ColorAsLime:ColorPropsType = Color("lime")
    def ColorAsGreen:ColorPropsType = Color("green")
    def ColorAsTeal:ColorPropsType = Color("teal")
    def ColorAsCyan:ColorPropsType = Color("cyan")
    def ColorAsGray:ColorPropsType = Color("gray")
    def ColorAsGrayDark:ColorPropsType = Color("gray-dark")
  }
}
