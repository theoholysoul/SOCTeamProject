
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
							<li><a href=""""),_display_(Seq[Any](/*41.22*/routes/*41.28*/.TagController.tags())),format.raw/*41.49*/("""">Tag List</a></li>
							<li><a href=""""),_display_(Seq[Any](/*42.22*/routes/*42.28*/.WorkflowController.createWorkflow())),format.raw/*42.64*/("""">Create Workflow</a></li>
							<li><a href=""""),_display_(Seq[Any](/*43.22*/routes/*43.28*/.WorkflowController.workflowsByTopViewCount())),format.raw/*43.73*/("""">Workflow Popularity</a></li>
						</ul>

					</li>
					
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">Service<b
							class="caret"></b></a>
						<ul class="dropdown-menu">

						<li><a href=""""),_display_(Seq[Any](/*53.21*/routes/*53.27*/.ClimateServiceController.climateServices())),format.raw/*53.70*/("""">Service List</a></li>
					
						</ul>
					
					</li>
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">Dataset<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
						
						<li><a href=""""),_display_(Seq[Any](/*63.21*/routes/*63.27*/.DatasetController.datasetList())),format.raw/*63.59*/("""">Dataset List</a></li>
						<li><a href=""""),_display_(Seq[Any](/*64.21*/routes/*64.27*/.DatasetController.searchDataset())),format.raw/*64.61*/("""">Search dataset</a></li>
						</ul>
					</li>
					"""),format.raw/*67.42*/("""
						"""),format.raw/*68.67*/("""
							"""),format.raw/*69.34*/("""
						"""),format.raw/*70.37*/("""
							"""),format.raw/*71.101*/("""
							"""),format.raw/*72.106*/("""
						"""),format.raw/*73.16*/("""
					"""),format.raw/*74.15*/("""
					
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">About<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
						<li><a href=""""),_display_(Seq[Any](/*80.21*/routes/*80.27*/.ClimateServiceController.home())),format.raw/*80.59*/("""">Home</a></li>
						<li><a href=""""),_display_(Seq[Any](/*81.21*/routes/*81.27*/.AboutusController.aboutUs())),format.raw/*81.55*/("""">About Us</a></li>
						<li><a href=""""),_display_(Seq[Any](/*82.21*/routes/*82.27*/.AboutusController.aboutProject())),format.raw/*82.60*/("""">About project</a></li>
						</ul>
					</li>
					"""),_display_(Seq[Any](/*85.7*/if(session.get("userId") == null || session.get("userId").trim.isEmpty)/*85.78*/ {_display_(Seq[Any](format.raw/*85.80*/("""
					<li class="dropdown"><a href="#"
											class="dropdown-toggle" data-toggle="dropdown">Sign In / Sign Up<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(Seq[Any](/*90.22*/routes/*90.28*/.UserController.signInForm)),format.raw/*90.54*/("""">Sign In</a></li>
							<li><a href=""""),_display_(Seq[Any](/*91.22*/routes/*91.28*/.UserController.signUpForm)),format.raw/*91.54*/("""">Sign Up</a></li>
						</ul>
					</li>
					""")))}/*94.7*/else/*94.11*/{_display_(Seq[Any](format.raw/*94.12*/("""
					<li class="dropdown"><a href="#"
											class="dropdown-toggle" data-toggle="dropdown">My Profile<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(Seq[Any](/*99.22*/routes/*99.28*/.UserController.profile)),format.raw/*99.51*/("""">Profile</a></li>
							<li><a href=""""),_display_(Seq[Any](/*100.22*/routes/*100.28*/.UserController.allUsers)),format.raw/*100.52*/("""">All Users</a></li>
							<li><a href=""""),_display_(Seq[Any](/*101.22*/routes/*101.28*/.UserController.showFriends)),format.raw/*101.55*/("""">Friends</a></li>
							<li><a href=""""),_display_(Seq[Any](/*102.22*/routes/*102.28*/.UserController.showSubscriptions)),format.raw/*102.61*/("""">Subscriptions</a></li>
							<li><a href=""""),_display_(Seq[Any](/*103.22*/routes/*103.28*/.UserGroupController.showGroups)),format.raw/*103.59*/("""">User Groups</a></li>
							<li><a href=""""),_display_(Seq[Any](/*104.22*/routes/*104.28*/.UserController.signOut)),format.raw/*104.51*/("""">Sign Out</a></li>
						</ul>
					</li>
					""")))})),format.raw/*107.7*/("""
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
                    DATE: Mon Nov 30 16:55:56 PST 2015
                    SOURCE: /Users/Ethan/Desktop/teamMerge/SOC-Fall-2015-Team18-Lead-Xin-Wan/ApacheCMDA-Frontend/app/views/climate/header.scala.html
                    HASH: 0657dcde44449adac3d326f4e177a7ec529c8639
                    MATRIX: 3171->1205|3267->1207|3799->1703|3814->1709|3874->1747|3974->1811|3989->1817|4040->1846|4425->2195|4440->2201|4493->2232|4575->2278|4590->2284|4633->2305|4710->2346|4725->2352|4783->2388|4867->2436|4882->2442|4949->2487|5231->2733|5246->2739|5311->2782|5597->3032|5612->3038|5666->3070|5746->3114|5761->3120|5817->3154|5899->3244|5934->3311|5970->3345|6005->3382|6042->3483|6079->3589|6114->3605|6148->3620|6373->3809|6388->3815|6442->3847|6514->3883|6529->3889|6579->3917|6655->3957|6670->3963|6725->3996|6814->4050|6894->4121|6934->4123|7171->4324|7186->4330|7234->4356|7310->4396|7325->4402|7373->4428|7439->4476|7452->4480|7491->4481|7721->4675|7736->4681|7781->4704|7858->4744|7874->4750|7921->4774|8000->4816|8016->4822|8066->4849|8143->4889|8159->4895|8215->4928|8298->4974|8314->4980|8368->5011|8449->5055|8465->5061|8511->5084|8592->5133
                    LINES: 56->18|59->18|70->29|70->29|70->29|71->30|71->30|71->30|81->40|81->40|81->40|82->41|82->41|82->41|83->42|83->42|83->42|84->43|84->43|84->43|94->53|94->53|94->53|104->63|104->63|104->63|105->64|105->64|105->64|108->67|109->68|110->69|111->70|112->71|113->72|114->73|115->74|121->80|121->80|121->80|122->81|122->81|122->81|123->82|123->82|123->82|126->85|126->85|126->85|131->90|131->90|131->90|132->91|132->91|132->91|135->94|135->94|135->94|140->99|140->99|140->99|141->100|141->100|141->100|142->101|142->101|142->101|143->102|143->102|143->102|144->103|144->103|144->103|145->104|145->104|145->104|148->107
                    -- GENERATED --
                */
            