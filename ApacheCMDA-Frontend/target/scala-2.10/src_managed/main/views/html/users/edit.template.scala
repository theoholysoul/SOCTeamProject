
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
object edit extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, form: Form[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.30*/("""

"""),_display_(Seq[Any](/*3.2*/main(title = "Edit User")/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""
    """),_display_(Seq[Any](/*4.6*/validations(form))),format.raw/*4.23*/("""
    <h1>Edit User</h1>

    """),_display_(Seq[Any](/*7.6*/helper/*7.12*/.form(action = routes.UserController.update(id))/*7.60*/ {_display_(Seq[Any](format.raw/*7.62*/("""
        <div class="form-group">
            """),_display_(Seq[Any](/*9.14*/helper/*9.20*/.inputText(form("email"), '_showConstraints -> false, '_label -> "Email", 'placeholder -> "Email", 'class -> "form-control"))),format.raw/*9.144*/("""
        </div>
        <div class="form-group">
            """),_display_(Seq[Any](/*12.14*/helper/*12.20*/.inputPassword(form("password"), '_showConstraints -> false, '_label -> "Password", 'placeholder -> "Password", 'value -> form("password").value, 'class -> "form-control"))),format.raw/*12.191*/("""
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-success">Update</button>
        </div>
    """)))})),format.raw/*17.6*/("""

""")))})),format.raw/*19.2*/("""

"""))}
    }
    
    def render(id:Long,form:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(id,form)
    
    def f:((Long,Form[User]) => play.api.templates.HtmlFormat.Appendable) = (id,form) => apply(id,form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 05 22:34:50 PST 2015
                    SOURCE: /Users/vincent/Desktop/SoC/Lab/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/users/edit.scala.html
                    HASH: d9d544c4a0b8d306685079369515f75a75009d68
                    MATRIX: 788->1|910->29|947->32|980->57|1019->59|1059->65|1097->82|1161->112|1175->118|1231->166|1270->168|1352->215|1366->221|1512->345|1610->407|1625->413|1819->584|1993->727|2027->730
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|35->7|35->7|35->7|35->7|37->9|37->9|37->9|40->12|40->12|40->12|45->17|47->19
                    -- GENERATED --
                */
            