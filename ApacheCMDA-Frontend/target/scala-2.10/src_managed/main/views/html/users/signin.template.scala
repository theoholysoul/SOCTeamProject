
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
object signin extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""

"""),_display_(Seq[Any](/*3.2*/main(title = "Sign In")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
    """),_display_(Seq[Any](/*4.6*/validations(form))),format.raw/*4.23*/("""
    <h1>Sign In</h1>

    """),_display_(Seq[Any](/*7.6*/helper/*7.12*/.form(routes.UserController.authenticate)/*7.53*/ {_display_(Seq[Any](format.raw/*7.55*/("""
        <div class="form-group">
            """),_display_(Seq[Any](/*9.14*/helper/*9.20*/.inputText(form("email"), '_showConstraints -> false, '_label -> "Email", 'placeholder -> "Email", 'class -> "form-control"))),format.raw/*9.144*/("""
        </div>
        <div class="form-group">
            """),_display_(Seq[Any](/*12.14*/helper/*12.20*/.inputPassword(form("password"), '_showConstraints -> false, '_label -> "Password", 'placeholder -> "Password", 'class -> "form-control"))),format.raw/*12.157*/("""
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-success">Submit</button>
        </div>
        <div class="form-group">
            <div style="border-top: 1px solid#888; padding-top:15px; font-size:85%" >
                Don't have an account?
                <a href=""""),_display_(Seq[Any](/*20.27*/routes/*20.33*/.UserController.create)),format.raw/*20.55*/("""">
                    Sign Up Here
                </a>
            </div>
        </div>
    """)))})),format.raw/*25.6*/("""

""")))})),format.raw/*27.2*/("""

"""))}
    }
    
    def render(form:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[User]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 05 23:00:20 PST 2015
                    SOURCE: /Users/vincent/Desktop/SoC/Lab/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/users/signin.scala.html
                    HASH: 0471a504d1329c760b1ebdaaa1b6d744c1454072
                    MATRIX: 785->1|897->19|934->22|965->45|1004->47|1044->53|1082->70|1144->98|1158->104|1207->145|1246->147|1328->194|1342->200|1488->324|1586->386|1601->392|1761->529|2119->851|2134->857|2178->879|2305->975|2339->978
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|35->7|35->7|35->7|35->7|37->9|37->9|37->9|40->12|40->12|40->12|48->20|48->20|48->20|53->25|55->27
                    -- GENERATED --
                */
            