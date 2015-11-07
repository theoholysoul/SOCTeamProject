
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
object oneUser extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[User,play.api.templates.HtmlFormat.Appendable] {

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

<h1>User """),_display_(Seq[Any](/*26.11*/user/*26.15*/.userName)),format.raw/*26.24*/("""</h1>
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
		<tr>
			<td><font size="2">"""),_display_(Seq[Any](/*46.24*/user/*46.28*/.id)),format.raw/*46.31*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*47.24*/user/*47.28*/.userName)),format.raw/*47.37*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*48.24*/user/*48.28*/.firstName)),format.raw/*48.38*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*49.24*/user/*49.28*/.lastName)),format.raw/*49.37*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*50.24*/user/*50.28*/.affiliation)),format.raw/*50.40*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*51.24*/user/*51.28*/.email)),format.raw/*51.34*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*52.24*/user/*52.28*/.password)),format.raw/*52.37*/("""</font></td>
		</tr>
		</tbody>
	</table>

	<table class="table table-striped table-bordered table-condensed tablesorter" id ="description">
		<thead>
		<tr>
			<th style = "vertical-align: top;" class="col-md-1 header">Description</th>
		</tr>
		</thead>
		<tbody>
		<tr>
			<td><font size="2">"""),_display_(Seq[Any](/*65.24*/user/*65.28*/.description)),format.raw/*65.40*/("""</font></td>
		</tr>
		</tbody>
	</table>

</div>

""")))})))}
    }
    
    def render(user:User): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((User) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Nov 07 01:21:26 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/oneUser.scala.html
                    HASH: d1cb9dc3d4995d867c421a9d8dde06e4b3ea992d
                    MATRIX: 3177->1205|3301->1217|3330->1237|3367->1239|3396->1259|3436->1261|3474->1264|3511->1279|3559->1291|3572->1295|3603->1304|4340->2005|4353->2009|4378->2012|4450->2048|4463->2052|4494->2061|4566->2097|4579->2101|4611->2111|4683->2147|4696->2151|4727->2160|4799->2196|4812->2200|4846->2212|4918->2248|4931->2252|4959->2258|5031->2294|5044->2298|5075->2307|5407->2603|5420->2607|5454->2619
                    LINES: 56->18|60->18|62->21|63->22|63->22|63->22|65->24|65->24|67->26|67->26|67->26|87->46|87->46|87->46|88->47|88->47|88->47|89->48|89->48|89->48|90->49|90->49|90->49|91->50|91->50|91->50|92->51|92->51|92->51|93->52|93->52|93->52|106->65|106->65|106->65
                    -- GENERATED --
                */
            