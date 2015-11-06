
package views.html.users

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
object signup extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""

"""),_display_(Seq[Any](/*3.2*/main(title = "Sign Up")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
    """),_display_(Seq[Any](/*4.6*/validations(form))),format.raw/*4.23*/("""
    <h1>Sign Up</h1>

    """),_display_(Seq[Any](/*7.6*/helper/*7.12*/.form(action = routes.UserController.save)/*7.54*/ {_display_(Seq[Any](format.raw/*7.56*/("""
        <div class="form-group">
            """),_display_(Seq[Any](/*9.14*/helper/*9.20*/.inputText(form("email"), '_showConstraints -> false, '_label -> "Email", 'placeholder -> "Email", 'class -> "form-control"))),format.raw/*9.144*/("""
        </div>
        <div class="form-group">
            """),_display_(Seq[Any](/*12.14*/helper/*12.20*/.inputPassword(form("password"), '_showConstraints -> false, '_label -> "Password", 'placeholder -> "Password", 'class -> "form-control"))),format.raw/*12.157*/("""
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-success">Submit</button>
        </div>
    """)))})),format.raw/*17.6*/("""

""")))})),format.raw/*19.2*/("""

"""))}
    }
    
    def render(form:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[User]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 05 23:00:20 PST 2015
                    SOURCE: /Users/vincent/Desktop/SoC/Lab/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/users/signup.scala.html
                    HASH: d13f437fb9e53304bbf2567889df858686a50894
                    MATRIX: 785->1|897->19|934->22|965->45|1004->47|1044->53|1082->70|1144->98|1158->104|1208->146|1247->148|1329->195|1343->201|1489->325|1587->387|1602->393|1762->530|1936->673|1970->676
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|35->7|35->7|35->7|35->7|37->9|37->9|37->9|40->12|40->12|40->12|45->17|47->19
                    -- GENERATED --
                */
            