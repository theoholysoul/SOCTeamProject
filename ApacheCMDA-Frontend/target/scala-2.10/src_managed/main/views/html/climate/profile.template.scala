
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
object profile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[User,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(user: User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 


Seq[Any](format.raw/*18.14*/("""

"""),format.raw/*21.1*/("""
"""),_display_(Seq[Any](/*22.2*/main("User Profile")/*22.22*/ {_display_(Seq[Any](format.raw/*22.24*/("""

"""),_display_(Seq[Any](/*24.2*/flash_message())),format.raw/*24.17*/("""

<h1>My Profile</h1>
<div style="overflow-y:scroll">


	<table class="table table-striped table-bordered table-condensed tablesorter" id ="myTable">
		<tr>
			<th style="vertical-align: top;" class="col-md-2">Id</th>
			<td><font size="2">"""),_display_(Seq[Any](/*33.24*/user/*33.28*/.id)),format.raw/*33.31*/("""</font></td>
		</tr>
		<tr>
			<th style="vertical-align: top;" class="col-md-1">User Name</th>
			<td><font size="2">"""),_display_(Seq[Any](/*37.24*/user/*37.28*/.userName)),format.raw/*37.37*/("""</font></td>
		</tr>
		<tr>
			<th style="vertical-align: top;" class="col-md-2">First Name</th>
			<td><font size="2">"""),_display_(Seq[Any](/*41.24*/user/*41.28*/.firstName)),format.raw/*41.38*/("""</font></td>
		</tr>
		<tr>
			<th style="vertical-align: top;" class="col-md-1">Last Name</th>
			<td><font size="2">"""),_display_(Seq[Any](/*45.24*/user/*45.28*/.lastName)),format.raw/*45.37*/("""</font></td>
		</tr>
		<tr>
			<th style="vertical-align: top;" class="col-md-2">Affiliation</th>
			<td><font size="2">"""),_display_(Seq[Any](/*49.24*/user/*49.28*/.affiliation)),format.raw/*49.40*/("""</font></td>
		</tr>
		<tr>
			<th style="vertical-align: top;" class="col-md-1">Phone Number</th>
			<td><font size="2">"""),_display_(Seq[Any](/*53.24*/user/*53.28*/.phoneNumber)),format.raw/*53.40*/("""</font></td>
		</tr>
		<tr>
			<th style="vertical-align: top;" class="col-md-2">Research Fields</th>
			<td><font size="2">"""),_display_(Seq[Any](/*57.24*/user/*57.28*/.researchFields)),format.raw/*57.43*/("""</font></td>
		</tr>
		<tr>
			<th style="vertical-align: top;" class="col-md-1">Email</th>
			<td><font size="2">"""),_display_(Seq[Any](/*61.24*/user/*61.28*/.email)),format.raw/*61.34*/("""</font></td>
		</tr>
		<tr>
			<th style="vertical-align: top;" class="col-md-2">Description</th>
			<td><font size="2">"""),_display_(Seq[Any](/*65.24*/user/*65.28*/.description)),format.raw/*65.40*/("""</font></td>
		</tr>
	</table>

	<!--table class="table table-striped table-bordered table-condensed tablesorter" id ="description">
		<thead>
		<tr>
			<th style = "vertical-align: top;" class="col-md-1 header">Description</th>
		</tr>
		</thead>
		<tbody>
		<tr>
			<td><font size="2">"""),_display_(Seq[Any](/*77.24*/user/*77.28*/.description)),format.raw/*77.40*/("""</font></td>
		</tr>
		</tbody>
	</table-->

</div>

""")))})))}
    }
    
    def render(user:User): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((User) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Nov 30 16:01:41 PST 2015
                    SOURCE: /Users/vincent/Desktop/SoC/Lab/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/profile.scala.html
                    HASH: 12f58731dd3201759183ef0741c7cb71e1d2a81f
                    MATRIX: 3177->1205|3301->1217|3330->1237|3367->1239|3396->1259|3436->1261|3474->1264|3511->1279|3788->1520|3801->1524|3826->1527|3981->1646|3994->1650|4025->1659|4181->1779|4194->1783|4226->1793|4381->1912|4394->1916|4425->1925|4582->2046|4595->2050|4629->2062|4787->2184|4800->2188|4834->2200|4995->2325|5008->2329|5045->2344|5196->2459|5209->2463|5237->2469|5394->2590|5407->2594|5441->2606|5765->2894|5778->2898|5812->2910
                    LINES: 56->18|60->18|62->21|63->22|63->22|63->22|65->24|65->24|74->33|74->33|74->33|78->37|78->37|78->37|82->41|82->41|82->41|86->45|86->45|86->45|90->49|90->49|90->49|94->53|94->53|94->53|98->57|98->57|98->57|102->61|102->61|102->61|106->65|106->65|106->65|118->77|118->77|118->77
                    -- GENERATED --
                */
            