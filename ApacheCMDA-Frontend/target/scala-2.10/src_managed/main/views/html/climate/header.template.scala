
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
object header extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*18.4*/("""
	<div class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" style="padding-bottom: 0;" href="/climate"><img
					src='"""),_display_(Seq[Any](/*29.12*/routes/*29.18*/.Assets.at("images/NASA_JPL_logo.png"))),format.raw/*29.56*/("""' style="height: 40px; width: 220px;">&nbsp&nbsp<img
					src='"""),_display_(Seq[Any](/*30.12*/routes/*30.18*/.Assets.at("images/logo.png"))),format.raw/*30.47*/("""' style="height: 15px; width: 250px;"></a>
			</div>
			<div class="navbar-collapse collapse" style="height:">
				<ul class="nav navbar-nav navbar-right">

					<li class="dropdown"><a href="#"
											class="dropdown-toggle" data-toggle="dropdown">Workflow<b
							class="caret"></b></a>
						<ul class="dropdown-menu">

							<li><a href=""""),_display_(Seq[Any](/*40.22*/routes/*40.28*/.WorkflowController.workflows())),format.raw/*40.59*/("""">Workflow List</a></li>
							<li><a href=""""),_display_(Seq[Any](/*41.22*/routes/*41.28*/.TagController.tagCloud())),format.raw/*41.53*/("""">Tag Cloud</a></li>
							<li><a href=""""),_display_(Seq[Any](/*42.22*/routes/*42.28*/.TagController.tags())),format.raw/*42.49*/("""">Tag List</a></li>
							<li><a href=""""),_display_(Seq[Any](/*43.22*/routes/*43.28*/.WorkflowController.createWorkflow())),format.raw/*43.64*/("""">Create Workflow</a></li>
							<li><a href=""""),_display_(Seq[Any](/*44.22*/routes/*44.28*/.WorkflowController.workflowsByTopViewCount())),format.raw/*44.73*/("""">Workflow Popularity</a></li>
						</ul>

					</li>
					
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">Service<b
							class="caret"></b></a>
						<ul class="dropdown-menu">

						<li><a href=""""),_display_(Seq[Any](/*54.21*/routes/*54.27*/.ClimateServiceController.climateServices())),format.raw/*54.70*/("""">Service List</a></li>
					
						</ul>
					
					</li>
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">Dataset<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
						
						<li><a href=""""),_display_(Seq[Any](/*64.21*/routes/*64.27*/.DatasetController.datasetList())),format.raw/*64.59*/("""">Dataset List</a></li>
						<li><a href=""""),_display_(Seq[Any](/*65.21*/routes/*65.27*/.DatasetController.searchDataset())),format.raw/*65.61*/("""">Search dataset</a></li>
						</ul>
					</li>
					"""),format.raw/*68.42*/("""
						"""),format.raw/*69.67*/("""
							"""),format.raw/*70.34*/("""
						"""),format.raw/*71.37*/("""
							"""),format.raw/*72.101*/("""
							"""),format.raw/*73.106*/("""
						"""),format.raw/*74.16*/("""
					"""),format.raw/*75.15*/("""
					
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">About<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
						<li><a href=""""),_display_(Seq[Any](/*81.21*/routes/*81.27*/.ClimateServiceController.home())),format.raw/*81.59*/("""">Home</a></li>
						<li><a href=""""),_display_(Seq[Any](/*82.21*/routes/*82.27*/.AboutusController.aboutUs())),format.raw/*82.55*/("""">About Us</a></li>
						<li><a href=""""),_display_(Seq[Any](/*83.21*/routes/*83.27*/.AboutusController.aboutProject())),format.raw/*83.60*/("""">About project</a></li>
						</ul>
					</li>
					"""),_display_(Seq[Any](/*86.7*/if(session.get("userId") == null || session.get("userId").trim.isEmpty)/*86.78*/ {_display_(Seq[Any](format.raw/*86.80*/("""
					<li class="dropdown"><a href="#"
											class="dropdown-toggle" data-toggle="dropdown">Sign In / Sign Up<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(Seq[Any](/*91.22*/routes/*91.28*/.UserController.signInForm)),format.raw/*91.54*/("""">Sign In</a></li>
							<li><a href=""""),_display_(Seq[Any](/*92.22*/routes/*92.28*/.UserController.signUpForm)),format.raw/*92.54*/("""">Sign Up</a></li>
						</ul>
					</li>
					""")))}/*95.7*/else/*95.11*/{_display_(Seq[Any](format.raw/*95.12*/("""
					<li class="dropdown"><a href="#"
											class="dropdown-toggle" data-toggle="dropdown">My Profile<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(Seq[Any](/*100.22*/routes/*100.28*/.UserController.profile)),format.raw/*100.51*/("""">Profile</a></li>
							<li><a href=""""),_display_(Seq[Any](/*101.22*/routes/*101.28*/.UserController.allUsers)),format.raw/*101.52*/("""">All Users</a></li>
							<li><a href=""""),_display_(Seq[Any](/*102.22*/routes/*102.28*/.UserController.showFriends)),format.raw/*102.55*/("""">Friends</a></li>
							<li><a href=""""),_display_(Seq[Any](/*103.22*/routes/*103.28*/.UserController.showSubscriptions)),format.raw/*103.61*/("""">Subscriptions</a></li>
							<li><a href=""""),_display_(Seq[Any](/*104.22*/routes/*104.28*/.UserGroupController.showGroups)),format.raw/*104.59*/("""">User Groups</a></li>
							<li><a href=""""),_display_(Seq[Any](/*105.22*/routes/*105.28*/.UserController.signOut)),format.raw/*105.51*/("""">Sign Out</a></li>
						</ul>
					</li>
					""")))})),format.raw/*108.7*/("""
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Dec 01 13:47:29 PST 2015
                    SOURCE: /Users/Holysoul/Desktop/SOCTeamProject/ApacheCMDA-Frontend/app/views/climate/header.scala.html
                    HASH: cf00d0db911a9d11c034ecbc96a0aa12cafa0eab
                    MATRIX: 3171->1205|3267->1207|3799->1703|3814->1709|3874->1747|3974->1811|3989->1817|4040->1846|4425->2195|4440->2201|4493->2232|4575->2278|4590->2284|4637->2309|4715->2351|4730->2357|4773->2378|4850->2419|4865->2425|4923->2461|5007->2509|5022->2515|5089->2560|5371->2806|5386->2812|5451->2855|5737->3105|5752->3111|5806->3143|5886->3187|5901->3193|5957->3227|6039->3317|6074->3384|6110->3418|6145->3455|6182->3556|6219->3662|6254->3678|6288->3693|6513->3882|6528->3888|6582->3920|6654->3956|6669->3962|6719->3990|6795->4030|6810->4036|6865->4069|6954->4123|7034->4194|7074->4196|7311->4397|7326->4403|7374->4429|7450->4469|7465->4475|7513->4501|7579->4549|7592->4553|7631->4554|7862->4748|7878->4754|7924->4777|8001->4817|8017->4823|8064->4847|8143->4889|8159->4895|8209->4922|8286->4962|8302->4968|8358->5001|8441->5047|8457->5053|8511->5084|8592->5128|8608->5134|8654->5157|8735->5206
                    LINES: 56->18|59->18|70->29|70->29|70->29|71->30|71->30|71->30|81->40|81->40|81->40|82->41|82->41|82->41|83->42|83->42|83->42|84->43|84->43|84->43|85->44|85->44|85->44|95->54|95->54|95->54|105->64|105->64|105->64|106->65|106->65|106->65|109->68|110->69|111->70|112->71|113->72|114->73|115->74|116->75|122->81|122->81|122->81|123->82|123->82|123->82|124->83|124->83|124->83|127->86|127->86|127->86|132->91|132->91|132->91|133->92|133->92|133->92|136->95|136->95|136->95|141->100|141->100|141->100|142->101|142->101|142->101|143->102|143->102|143->102|144->103|144->103|144->103|145->104|145->104|145->104|146->105|146->105|146->105|149->108
                    -- GENERATED --
                */
            