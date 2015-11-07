
package views.html.climate

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
/*******************************************************************************
* Licensed to the Apache Software Foundation (ASF) under one or more		   *
* contributor license agreements.  See the NOTICE file distributed with	   *
* this work for additional information regarding copyright ownership.         *
* The ASF licenses this file to You under the Apache License, Version 2.0     *
* (the "License"); you may not use this file except in compliance with        *
* the License.  You may obtain a copy of the License at                       *
*                                                                             *
*    http://www.apache.org/licenses/LICENSE-2.0                               *
*																			   *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.											   *
*******************************************************************************/
object userList extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[User],play.data.Form[User],play.api.templates.HtmlFormat.Appendable] {

    /*******************************************************************************
* Licensed to the Apache Software Foundation (ASF) under one or more		   *
* contributor license agreements.  See the NOTICE file distributed with	   *
* this work for additional information regarding copyright ownership.         *
* The ASF licenses this file to You under the Apache License, Version 2.0     *
* (the "License"); you may not use this file except in compliance with        *
* the License.  You may obtain a copy of the License at                       *
*                                                                             *
*    http://www.apache.org/licenses/LICENSE-2.0                               *
*																			   *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.											   *
*******************************************************************************/
    def apply/*18.2*/(users: List[User], userForm: play.data.Form[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*22.2*/scripts/*22.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.13*/("""
<script src='"""),_display_(Seq[Any](/*23.15*/routes/*23.21*/.Assets.at("javascripts/edit_button.js"))),format.raw/*23.61*/("""'></script>
<script type="text/javascript">
	$(document).ready(function()"""),format.raw/*25.30*/("""{"""),format.raw/*25.31*/("""
		//alert($("#url").text());
	"""),format.raw/*27.2*/("""}"""),format.raw/*27.3*/(""");
	</script>
""")))};
Seq[Any](format.raw/*18.53*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*29.2*/("""

"""),_display_(Seq[Any](/*31.2*/main("User List", scripts)/*31.28*/ {_display_(Seq[Any](format.raw/*31.30*/("""

"""),_display_(Seq[Any](/*33.2*/flash_message())),format.raw/*33.17*/("""

<h1>Users</h1>
<h2>"""),_display_(Seq[Any](/*36.6*/users/*36.11*/.size())),format.raw/*36.18*/(""" Users found</h2>
<div style="overflow-y:scroll">


	<table class="table table-striped table-bordered table-condensed tablesorter" id ="myTable">
		<thead>
		<tr >

			<th style = "vertical-align: top;" class="col-md-1 header">Id</th>
			<th style = "vertical-align: top;" class="col-md-2">User Name</th>
			<th style = "vertical-align: top;" class="col-md-1">First Name</th>
			<th style = "vertical-align: top;" class="col-md-1">Last Name</th>
			<th style = "vertical-align: top;" class="col-md-2">Affiliation</th>
			<th style = "vertical-align: top;" class="col-md-1">Email</th>
			<th style = "vertical-align: top;" class="col-md-1">Password</th>

		</tr>
		</thead>
		<tbody>
		"""),_display_(Seq[Any](/*55.4*/for(user <- users) yield /*55.22*/{_display_(Seq[Any](format.raw/*55.23*/("""
		<tr>

			<td><font size="2">"""),_display_(Seq[Any](/*58.24*/user/*58.28*/.id)),format.raw/*58.31*/("""</font></td>

			<td><a href = """"),_display_(Seq[Any](/*60.20*/{routes.UserController.oneUser(user.id)})),format.raw/*60.60*/(""""><font size="2">"""),_display_(Seq[Any](/*60.78*/user/*60.82*/.userName)),format.raw/*60.91*/("""</font></a></td>

			<td><font size="2">"""),_display_(Seq[Any](/*62.24*/user/*62.28*/.firstName)),format.raw/*62.38*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*63.24*/user/*63.28*/.lastName)),format.raw/*63.37*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*64.24*/user/*64.28*/.affiliation)),format.raw/*64.40*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*65.24*/user/*65.28*/.email)),format.raw/*65.34*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*66.24*/user/*66.28*/.password)),format.raw/*66.37*/("""</font></td>

		</tr>

		""")))})),format.raw/*70.4*/("""
		</tbody>
	</table>



</div>
""")))})),format.raw/*77.2*/("""
"""))}
    }
    
    def render(users:List[User],userForm:play.data.Form[User]): play.api.templates.HtmlFormat.Appendable = apply(users,userForm)
    
    def f:((List[User],play.data.Form[User]) => play.api.templates.HtmlFormat.Appendable) = (users,userForm) => apply(users,userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Nov 07 00:58:59 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/userList.scala.html
                    HASH: 42b963aea3557f376262eb4c809e413b7c8dce9b
                    MATRIX: 3175->1189|3320->1261|3335->1268|3420->1272|3471->1287|3486->1293|3548->1333|3649->1406|3678->1407|3736->1438|3764->1439|3819->1240|3848->1259|3876->1454|3914->1457|3949->1483|3989->1485|4027->1488|4064->1503|4121->1525|4135->1530|4164->1537|4885->2223|4919->2241|4958->2242|5026->2274|5039->2278|5064->2281|5133->2314|5195->2354|5249->2372|5262->2376|5293->2385|5370->2426|5383->2430|5415->2440|5487->2476|5500->2480|5531->2489|5603->2525|5616->2529|5650->2541|5722->2577|5735->2581|5763->2587|5835->2623|5848->2627|5879->2636|5936->2662|6000->2695
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|79->36|79->36|79->36|98->55|98->55|98->55|101->58|101->58|101->58|103->60|103->60|103->60|103->60|103->60|105->62|105->62|105->62|106->63|106->63|106->63|107->64|107->64|107->64|108->65|108->65|108->65|109->66|109->66|109->66|113->70|120->77
                    -- GENERATED --
                */
            