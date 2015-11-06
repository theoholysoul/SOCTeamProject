
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(users: List[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.21*/("""

"""),_display_(Seq[Any](/*3.2*/main(title = "Users")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
    <h1>Users</h1>

    <table class="table table-striped">
        <tr>
            <td>ID</td>
            <td>Email</td>
            <td>Password</td>
            <td>Actions</td>
        </tr>
        """),_display_(Seq[Any](/*13.10*/for(user <- users) yield /*13.28*/{_display_(Seq[Any](format.raw/*13.29*/("""
        <tr>
            <td>"""),_display_(Seq[Any](/*15.18*/user/*15.22*/.id)),format.raw/*15.25*/("""</td>
            <td>"""),_display_(Seq[Any](/*16.18*/user/*16.22*/.email)),format.raw/*16.28*/("""</td>
            <td>"""),_display_(Seq[Any](/*17.18*/user/*17.22*/.password)),format.raw/*17.31*/("""</td>
            <td>"""),_display_(Seq[Any](/*18.18*/helper/*18.24*/.form(routes.UserController.delete(user.id))/*18.68*/ {_display_(Seq[Any](format.raw/*18.70*/("""<a href=""""),_display_(Seq[Any](/*18.80*/routes/*18.86*/.UserController.show(user.id))),format.raw/*18.115*/("""" class="btn btn-default">Edit</a> <button type="submit" class="btn btn-danger">Delete</button>""")))})),format.raw/*18.211*/("""</td>
        </tr>
        """)))})),format.raw/*20.10*/("""
    </table>
""")))})))}
    }
    
    def render(users:List[User]): play.api.templates.HtmlFormat.Appendable = apply(users)
    
    def f:((List[User]) => play.api.templates.HtmlFormat.Appendable) = (users) => apply(users)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 05 22:34:50 PST 2015
                    SOURCE: /Users/vincent/Desktop/SoC/Lab/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/users/index.scala.html
                    HASH: 6d44b2e7e599896efa3bbcfc77816e5f6c7c89db
                    MATRIX: 784->1|897->20|934->23|963->44|1002->46|1245->253|1279->271|1318->272|1385->303|1398->307|1423->310|1482->333|1495->337|1523->343|1582->366|1595->370|1626->379|1685->402|1700->408|1753->452|1793->454|1839->464|1854->470|1906->499|2035->595|2096->624
                    LINES: 26->1|29->1|31->3|31->3|31->3|41->13|41->13|41->13|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|48->20
                    -- GENERATED --
                */
            