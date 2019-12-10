package com.infilos.tabler

import korolev._
import korolev.Context.ComponentEntry
import korolev.execution._
import korolev.state.javaSerialization._
import levsha.dsl._
import levsha.dsl.html._

import scala.concurrent.Future

/**
 * @author mowen on 2019-12-09.
 *
 */

object Icons {

  case class Props(
    private[Icons] val name:String,
    private[Icons] val prefix:String = "fe",
    private[Icons] val isFlag:Boolean = false,
    private[Icons] val isPayment:Boolean = false,
    private[Icons] val isLink:Boolean = false,
    private[Icons] val isLinkHref:Option[String] = None,
    private[Icons] val isAriaHidden:Boolean = false
  ) {
    def useFe:Props = this.copy(prefix = "fe")
    def useFa:Props = this.copy(prefix = "fa")
    def asFlag:Props = this.copy(isFlag = true)
    def asPayment:Props = this.copy(isPayment = true)
    def asLink(href:String):Props = this.copy(isLink = true, isLinkHref = Some(href))
    def asAriaHidden:Props = this.copy(isAriaHidden = true)

    private[Icons] def tagClassPrefix:String = if (isFlag) "flag" else if (isPayment) "payment" else prefix
    private[Icons] def tagClass:String = s"$tagClassPrefix $tagClassPrefix-$name"
  }

  object Props {
    def apply():Props = new Props("")
  }

  private object Icon extends Component[Future,Unit,Props,Unit](()) {
    override def render(props:Props, state:Unit):Icon.context.Node = {
      if(props.isLink) {
        div(
          a(
            clazz := "icon",
            whenAttri(props.isAriaHidden)(AttrDef("aria-hidden") := "true"),
            whenAttri(props.isLinkHref)(linkHref => AttrDef("href") := linkHref),
            i(clazz := props.tagClass)
          )
        )
      } else {
        i(clazz := props.tagClass)
      }
    }
  }

  def apply(name:String, props:Props = Props("")):ComponentEntry[Future, String, Any, Unit, Props, Unit] = {
    new ComponentEntry(Icon, props.copy(name = name), (_, _) => Future.unit)
  }
}
