
package views.html.errors

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object error404 extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main(title = "Error")/*1.23*/ {_display_(Seq[Any](format.raw/*1.25*/("""
<h1>Error (404)</h1>
<p>The page you were looking for appears to have been moved, deleted or does not exist. You could <a href="javascript:history.back()">go back</a> to where you were or head straight to the <a href=""""),_display_(Seq[Any](/*3.199*/routes/*3.205*/.Application.index)),format.raw/*3.223*/("""">home page</a>.</p>
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 05 23:00:20 PST 2015
                    SOURCE: /Users/vincent/Desktop/SoC/Lab/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/errors/error404.scala.html
                    HASH: 7dca7075ab8592030179c3b21cbb18a3dcd46b75
                    MATRIX: 874->1|903->22|942->24|1198->244|1213->250|1253->268
                    LINES: 29->1|29->1|29->1|31->3|31->3|31->3
                    -- GENERATED --
                */
            