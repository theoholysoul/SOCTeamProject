// @SOURCE:/Users/vincent/Desktop/SoC/Lab/SOC-Fall-2015/ApacheCMDA-Frontend/conf/routes
// @HASH:2aba3af2ec5e40be2303d20f0d65ecafa64ba03b
// @DATE:Thu Nov 05 23:02:47 PST 2015


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_ClimateServiceController_home0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home"))))
        

// @LINE:7
private[this] lazy val controllers_ClimateServiceController_home1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:10
private[this] lazy val controllers_Application_index2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("application"))))
        

// @LINE:14
private[this] lazy val controllers_UserController_signIn3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signin"))))
        

// @LINE:15
private[this] lazy val controllers_UserController_authenticate4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signin"))))
        

// @LINE:16
private[this] lazy val controllers_UserController_signOut5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signout"))))
        

// @LINE:19
private[this] lazy val controllers_UserController_index6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users"))))
        

// @LINE:20
private[this] lazy val controllers_UserController_create7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/create"))))
        

// @LINE:21
private[this] lazy val controllers_UserController_save8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/create"))))
        

// @LINE:22
private[this] lazy val controllers_UserController_show9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:23
private[this] lazy val controllers_UserController_update10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/"),DynamicPart("id", """[^/]+""",true),StaticPart("/update"))))
        

// @LINE:24
private[this] lazy val controllers_UserController_delete11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:27
private[this] lazy val controllers_BugReportController_reports12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bugs"))))
        

// @LINE:28
private[this] lazy val controllers_BugReportController_newReport13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newReport"))))
        

// @LINE:29
private[this] lazy val controllers_BugReportController_list14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bug/list"))))
        

// @LINE:30
private[this] lazy val controllers_BugReportController_deleteReport15 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete/report"))))
        

// @LINE:31
private[this] lazy val controllers_BugReportController_solveReport16 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("solve/report"))))
        

// @LINE:34
private[this] lazy val controllers_AboutusController_aboutUs17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutus"))))
        

// @LINE:35
private[this] lazy val controllers_AboutusController_aboutProject18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutProject"))))
        

// @LINE:38
private[this] lazy val controllers_ClimateServiceController_home19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate"))))
        

// @LINE:39
private[this] lazy val controllers_ClimateServiceController_tutorial20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/tutorial"))))
        

// @LINE:40
private[this] lazy val controllers_ClimateServiceController_climateServices21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/climateServices"))))
        

// @LINE:41
private[this] lazy val controllers_ClimateServiceController_mostRecentlyAddedClimateServices22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mostRecentlyAddedClimateServices"))))
        

// @LINE:42
private[this] lazy val controllers_ClimateServiceController_mostRecentlyUsedClimateServices23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mostRecentlyUsedClimateServices"))))
        

// @LINE:43
private[this] lazy val controllers_ClimateServiceController_mostPopularClimateServices24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mostPopularClimateServices"))))
        

// @LINE:44
private[this] lazy val controllers_ClimateServiceController_newClimateService25 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/new/climateServices"))))
        

// @LINE:45
private[this] lazy val controllers_ClimateServiceController_deleteClimateService26 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/delete/climateServices"))))
        

// @LINE:46
private[this] lazy val controllers_ClimateServiceController_downloadClimateService27 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/download/climateServices"))))
        

// @LINE:47
private[this] lazy val controllers_ClimateServiceController_editClimateService28 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/edit/climateServices"))))
        

// @LINE:48
private[this] lazy val controllers_ClimateServiceController_addClimateServices29 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/new/climateServices"))))
        

// @LINE:49
private[this] lazy val controllers_ClimateServiceController_oneService30 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/oneService"))))
        

// @LINE:51
private[this] lazy val controllers_DatasetController_datasetList31 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/datasets"))))
        

// @LINE:52
private[this] lazy val controllers_DatasetController_searchDataset32 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/searchDataSet"))))
        

// @LINE:53
private[this] lazy val controllers_DatasetController_getSearchResult33 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/getSearchResult"))))
        

// @LINE:56
private[this] lazy val controllers_Assets_at34 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home""","""controllers.ClimateServiceController.home(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix,"""controllers.ClimateServiceController.home(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """application""","""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signin""","""controllers.UserController.signIn()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signin""","""controllers.UserController.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signout""","""controllers.UserController.signOut()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users""","""controllers.UserController.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/create""","""controllers.UserController.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/create""","""controllers.UserController.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/$id<[^/]+>""","""controllers.UserController.show(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/$id<[^/]+>/update""","""controllers.UserController.update(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/$id<[^/]+>/delete""","""controllers.UserController.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugs""","""controllers.BugReportController.reports()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newReport""","""controllers.BugReportController.newReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bug/list""","""controllers.BugReportController.list()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete/report""","""controllers.BugReportController.deleteReport()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """solve/report""","""controllers.BugReportController.solveReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutus""","""controllers.AboutusController.aboutUs()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutProject""","""controllers.AboutusController.aboutProject()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate""","""controllers.ClimateServiceController.home(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/tutorial""","""controllers.ClimateServiceController.tutorial()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/climateServices""","""controllers.ClimateServiceController.climateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mostRecentlyAddedClimateServices""","""controllers.ClimateServiceController.mostRecentlyAddedClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mostRecentlyUsedClimateServices""","""controllers.ClimateServiceController.mostRecentlyUsedClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mostPopularClimateServices""","""controllers.ClimateServiceController.mostPopularClimateServices()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/new/climateServices""","""controllers.ClimateServiceController.newClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/delete/climateServices""","""controllers.ClimateServiceController.deleteClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/download/climateServices""","""controllers.ClimateServiceController.downloadClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/edit/climateServices""","""controllers.ClimateServiceController.editClimateService()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/new/climateServices""","""controllers.ClimateServiceController.addClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/oneService""","""controllers.ClimateServiceController.oneService(url:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/datasets""","""controllers.DatasetController.datasetList()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/searchDataSet""","""controllers.DatasetController.searchDataset()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/getSearchResult""","""controllers.DatasetController.getSearchResult()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_ClimateServiceController_home0(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]),"GET", """ Home page""", Routes.prefix + """home"""))
   }
}
        

// @LINE:7
case controllers_ClimateServiceController_home1(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:10
case controllers_Application_index2(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page application""", Routes.prefix + """application"""))
   }
}
        

// @LINE:14
case controllers_UserController_signIn3(params) => {
   call { 
        invokeHandler(controllers.UserController.signIn(), HandlerDef(this, "controllers.UserController", "signIn", Nil,"GET", """ Login page""", Routes.prefix + """signin"""))
   }
}
        

// @LINE:15
case controllers_UserController_authenticate4(params) => {
   call { 
        invokeHandler(controllers.UserController.authenticate(), HandlerDef(this, "controllers.UserController", "authenticate", Nil,"POST", """""", Routes.prefix + """signin"""))
   }
}
        

// @LINE:16
case controllers_UserController_signOut5(params) => {
   call { 
        invokeHandler(controllers.UserController.signOut(), HandlerDef(this, "controllers.UserController", "signOut", Nil,"GET", """""", Routes.prefix + """signout"""))
   }
}
        

// @LINE:19
case controllers_UserController_index6(params) => {
   call { 
        invokeHandler(controllers.UserController.index(), HandlerDef(this, "controllers.UserController", "index", Nil,"GET", """ User page""", Routes.prefix + """users"""))
   }
}
        

// @LINE:20
case controllers_UserController_create7(params) => {
   call { 
        invokeHandler(controllers.UserController.create(), HandlerDef(this, "controllers.UserController", "create", Nil,"GET", """""", Routes.prefix + """users/create"""))
   }
}
        

// @LINE:21
case controllers_UserController_save8(params) => {
   call { 
        invokeHandler(controllers.UserController.save(), HandlerDef(this, "controllers.UserController", "save", Nil,"POST", """""", Routes.prefix + """users/create"""))
   }
}
        

// @LINE:22
case controllers_UserController_show9(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.UserController.show(id), HandlerDef(this, "controllers.UserController", "show", Seq(classOf[Long]),"GET", """""", Routes.prefix + """users/$id<[^/]+>"""))
   }
}
        

// @LINE:23
case controllers_UserController_update10(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.UserController.update(id), HandlerDef(this, "controllers.UserController", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """users/$id<[^/]+>/update"""))
   }
}
        

// @LINE:24
case controllers_UserController_delete11(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.UserController.delete(id), HandlerDef(this, "controllers.UserController", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """users/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:27
case controllers_BugReportController_reports12(params) => {
   call { 
        invokeHandler(controllers.BugReportController.reports(), HandlerDef(this, "controllers.BugReportController", "reports", Nil,"GET", """ BugReporting""", Routes.prefix + """bugs"""))
   }
}
        

// @LINE:28
case controllers_BugReportController_newReport13(params) => {
   call { 
        invokeHandler(controllers.BugReportController.newReport(), HandlerDef(this, "controllers.BugReportController", "newReport", Nil,"GET", """""", Routes.prefix + """newReport"""))
   }
}
        

// @LINE:29
case controllers_BugReportController_list14(params) => {
   call { 
        invokeHandler(controllers.BugReportController.list(), HandlerDef(this, "controllers.BugReportController", "list", Nil,"GET", """""", Routes.prefix + """bug/list"""))
   }
}
        

// @LINE:30
case controllers_BugReportController_deleteReport15(params) => {
   call { 
        invokeHandler(controllers.BugReportController.deleteReport(), HandlerDef(this, "controllers.BugReportController", "deleteReport", Nil,"POST", """""", Routes.prefix + """delete/report"""))
   }
}
        

// @LINE:31
case controllers_BugReportController_solveReport16(params) => {
   call { 
        invokeHandler(controllers.BugReportController.solveReport(), HandlerDef(this, "controllers.BugReportController", "solveReport", Nil,"POST", """""", Routes.prefix + """solve/report"""))
   }
}
        

// @LINE:34
case controllers_AboutusController_aboutUs17(params) => {
   call { 
        invokeHandler(controllers.AboutusController.aboutUs(), HandlerDef(this, "controllers.AboutusController", "aboutUs", Nil,"GET", """ About Us""", Routes.prefix + """aboutus"""))
   }
}
        

// @LINE:35
case controllers_AboutusController_aboutProject18(params) => {
   call { 
        invokeHandler(controllers.AboutusController.aboutProject(), HandlerDef(this, "controllers.AboutusController", "aboutProject", Nil,"GET", """""", Routes.prefix + """aboutProject"""))
   }
}
        

// @LINE:38
case controllers_ClimateServiceController_home19(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]),"GET", """ Climate Model""", Routes.prefix + """climate"""))
   }
}
        

// @LINE:39
case controllers_ClimateServiceController_tutorial20(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.tutorial(), HandlerDef(this, "controllers.ClimateServiceController", "tutorial", Nil,"GET", """""", Routes.prefix + """climate/tutorial"""))
   }
}
        

// @LINE:40
case controllers_ClimateServiceController_climateServices21(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.climateServices(), HandlerDef(this, "controllers.ClimateServiceController", "climateServices", Nil,"GET", """""", Routes.prefix + """climate/climateServices"""))
   }
}
        

// @LINE:41
case controllers_ClimateServiceController_mostRecentlyAddedClimateServices22(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.mostRecentlyAddedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyAddedClimateServices", Nil,"GET", """""", Routes.prefix + """climate/mostRecentlyAddedClimateServices"""))
   }
}
        

// @LINE:42
case controllers_ClimateServiceController_mostRecentlyUsedClimateServices23(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.mostRecentlyUsedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyUsedClimateServices", Nil,"GET", """""", Routes.prefix + """climate/mostRecentlyUsedClimateServices"""))
   }
}
        

// @LINE:43
case controllers_ClimateServiceController_mostPopularClimateServices24(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.mostPopularClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostPopularClimateServices", Nil,"GET", """""", Routes.prefix + """climate/mostPopularClimateServices"""))
   }
}
        

// @LINE:44
case controllers_ClimateServiceController_newClimateService25(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.newClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "newClimateService", Nil,"POST", """""", Routes.prefix + """climate/new/climateServices"""))
   }
}
        

// @LINE:45
case controllers_ClimateServiceController_deleteClimateService26(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.deleteClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "deleteClimateService", Nil,"POST", """""", Routes.prefix + """climate/delete/climateServices"""))
   }
}
        

// @LINE:46
case controllers_ClimateServiceController_downloadClimateService27(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.downloadClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "downloadClimateService", Nil,"POST", """""", Routes.prefix + """climate/download/climateServices"""))
   }
}
        

// @LINE:47
case controllers_ClimateServiceController_editClimateService28(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.editClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "editClimateService", Nil,"POST", """""", Routes.prefix + """climate/edit/climateServices"""))
   }
}
        

// @LINE:48
case controllers_ClimateServiceController_addClimateServices29(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.addClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "addClimateServices", Nil,"GET", """""", Routes.prefix + """climate/new/climateServices"""))
   }
}
        

// @LINE:49
case controllers_ClimateServiceController_oneService30(params) => {
   call(params.fromQuery[String]("url", Some(null))) { (url) =>
        invokeHandler(controllers.ClimateServiceController.oneService(url), HandlerDef(this, "controllers.ClimateServiceController", "oneService", Seq(classOf[String]),"GET", """""", Routes.prefix + """climate/oneService"""))
   }
}
        

// @LINE:51
case controllers_DatasetController_datasetList31(params) => {
   call { 
        invokeHandler(controllers.DatasetController.datasetList(), HandlerDef(this, "controllers.DatasetController", "datasetList", Nil,"GET", """Keyword search""", Routes.prefix + """climate/datasets"""))
   }
}
        

// @LINE:52
case controllers_DatasetController_searchDataset32(params) => {
   call { 
        invokeHandler(controllers.DatasetController.searchDataset(), HandlerDef(this, "controllers.DatasetController", "searchDataset", Nil,"GET", """""", Routes.prefix + """climate/searchDataSet"""))
   }
}
        

// @LINE:53
case controllers_DatasetController_getSearchResult33(params) => {
   call { 
        invokeHandler(controllers.DatasetController.getSearchResult(), HandlerDef(this, "controllers.DatasetController", "getSearchResult", Nil,"GET", """""", Routes.prefix + """climate/getSearchResult"""))
   }
}
        

// @LINE:56
case controllers_Assets_at34(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     