// @SOURCE:/Users/vincent/Desktop/SoC/Lab/SOC-Fall-2015/ApacheCMDA-Frontend/conf/routes
// @HASH:2aba3af2ec5e40be2303d20f0d65ecafa64ba03b
// @DATE:Thu Nov 05 23:02:47 PST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:56
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:35
// @LINE:34
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:10
// @LINE:7
// @LINE:6
package controllers {

// @LINE:56
class ReverseAssets {
    

// @LINE:56
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:35
// @LINE:34
class ReverseAboutusController {
    

// @LINE:35
def aboutProject(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "aboutProject")
}
                                                

// @LINE:34
def aboutUs(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "aboutus")
}
                                                
    
}
                          

// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
class ReverseBugReportController {
    

// @LINE:27
def reports(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "bugs")
}
                                                

// @LINE:31
def solveReport(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "solve/report")
}
                                                

// @LINE:30
def deleteReport(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "delete/report")
}
                                                

// @LINE:29
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "bug/list")
}
                                                

// @LINE:28
def newReport(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "newReport")
}
                                                
    
}
                          

// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseUserController {
    

// @LINE:24
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:22
def show(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:20
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/create")
}
                                                

// @LINE:16
def signOut(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signout")
}
                                                

// @LINE:23
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
}
                                                

// @LINE:21
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "users/create")
}
                                                

// @LINE:15
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signin")
}
                                                

// @LINE:19
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users")
}
                                                

// @LINE:14
def signIn(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signin")
}
                                                
    
}
                          

// @LINE:10
class ReverseApplication {
    

// @LINE:10
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "application")
}
                                                
    
}
                          

// @LINE:53
// @LINE:52
// @LINE:51
class ReverseDatasetController {
    

// @LINE:53
def getSearchResult(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/getSearchResult")
}
                                                

// @LINE:52
def searchDataset(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/searchDataSet")
}
                                                

// @LINE:51
def datasetList(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/datasets")
}
                                                
    
}
                          

// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:7
// @LINE:6
class ReverseClimateServiceController {
    

// @LINE:48
def addClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/new/climateServices")
}
                                                

// @LINE:41
def mostRecentlyAddedClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/mostRecentlyAddedClimateServices")
}
                                                

// @LINE:47
def editClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/edit/climateServices")
}
                                                

// @LINE:43
def mostPopularClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/mostPopularClimateServices")
}
                                                

// @LINE:39
def tutorial(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/tutorial")
}
                                                

// @LINE:49
def oneService(url:String = null): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/oneService" + queryString(List(if(url == null) None else Some(implicitly[QueryStringBindable[String]].unbind("url", url)))))
}
                                                

// @LINE:46
def downloadClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/download/climateServices")
}
                                                

// @LINE:42
def mostRecentlyUsedClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/mostRecentlyUsedClimateServices")
}
                                                

// @LINE:40
def climateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/climateServices")
}
                                                

// @LINE:44
def newClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/new/climateServices")
}
                                                

// @LINE:38
// @LINE:7
// @LINE:6
def home(email:String = null, vfile:String = null, dataset:String = null): Call = {
   (email: @unchecked, vfile: @unchecked, dataset: @unchecked) match {
// @LINE:6
case (email, vfile, dataset) if true => Call("GET", _prefix + { _defaultPrefix } + "home" + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
                                                        
// @LINE:7
case (email, vfile, dataset) if true => Call("GET", _prefix + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
                                                        
// @LINE:38
case (email, vfile, dataset) if true => Call("GET", _prefix + { _defaultPrefix } + "climate" + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
                                                        
   }
}
                                                

// @LINE:45
def deleteClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/delete/climateServices")
}
                                                
    
}
                          
}
                  


// @LINE:56
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:35
// @LINE:34
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:10
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:56
class ReverseAssets {
    

// @LINE:56
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:35
// @LINE:34
class ReverseAboutusController {
    

// @LINE:35
def aboutProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutusController.aboutProject",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutProject"})
      }
   """
)
                        

// @LINE:34
def aboutUs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutusController.aboutUs",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutus"})
      }
   """
)
                        
    
}
              

// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
class ReverseBugReportController {
    

// @LINE:27
def reports : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.reports",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugs"})
      }
   """
)
                        

// @LINE:31
def solveReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.solveReport",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "solve/report"})
      }
   """
)
                        

// @LINE:30
def deleteReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.deleteReport",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/report"})
      }
   """
)
                        

// @LINE:29
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bug/list"})
      }
   """
)
                        

// @LINE:28
def newReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.newReport",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newReport"})
      }
   """
)
                        
    
}
              

// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseUserController {
    

// @LINE:24
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:22
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.show",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:20
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/create"})
      }
   """
)
                        

// @LINE:16
def signOut : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.signOut",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signout"})
      }
   """
)
                        

// @LINE:23
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/update"})
      }
   """
)
                        

// @LINE:21
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/create"})
      }
   """
)
                        

// @LINE:15
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signin"})
      }
   """
)
                        

// @LINE:19
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
      }
   """
)
                        

// @LINE:14
def signIn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.signIn",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signin"})
      }
   """
)
                        
    
}
              

// @LINE:10
class ReverseApplication {
    

// @LINE:10
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "application"})
      }
   """
)
                        
    
}
              

// @LINE:53
// @LINE:52
// @LINE:51
class ReverseDatasetController {
    

// @LINE:53
def getSearchResult : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.getSearchResult",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/getSearchResult"})
      }
   """
)
                        

// @LINE:52
def searchDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.searchDataset",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/searchDataSet"})
      }
   """
)
                        

// @LINE:51
def datasetList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.datasetList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/datasets"})
      }
   """
)
                        
    
}
              

// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:7
// @LINE:6
class ReverseClimateServiceController {
    

// @LINE:48
def addClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.addClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/new/climateServices"})
      }
   """
)
                        

// @LINE:41
def mostRecentlyAddedClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostRecentlyAddedClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/mostRecentlyAddedClimateServices"})
      }
   """
)
                        

// @LINE:47
def editClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.editClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/edit/climateServices"})
      }
   """
)
                        

// @LINE:43
def mostPopularClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostPopularClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/mostPopularClimateServices"})
      }
   """
)
                        

// @LINE:39
def tutorial : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.tutorial",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/tutorial"})
      }
   """
)
                        

// @LINE:49
def oneService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.oneService",
   """
      function(url) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/oneService" + _qS([(url == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("url", url))])})
      }
   """
)
                        

// @LINE:46
def downloadClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.downloadClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/download/climateServices"})
      }
   """
)
                        

// @LINE:42
def mostRecentlyUsedClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostRecentlyUsedClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/mostRecentlyUsedClimateServices"})
      }
   """
)
                        

// @LINE:40
def climateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.climateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/climateServices"})
      }
   """
)
                        

// @LINE:44
def newClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.newClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/new/climateServices"})
      }
   """
)
                        

// @LINE:38
// @LINE:7
// @LINE:6
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.home",
   """
      function(email, vfile, dataset) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
      }
   """
)
                        

// @LINE:45
def deleteClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.deleteClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/delete/climateServices"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:56
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:35
// @LINE:34
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:10
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:56
class ReverseAssets {
    

// @LINE:56
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:35
// @LINE:34
class ReverseAboutusController {
    

// @LINE:35
def aboutProject(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutusController.aboutProject(), HandlerDef(this, "controllers.AboutusController", "aboutProject", Seq(), "GET", """""", _prefix + """aboutProject""")
)
                      

// @LINE:34
def aboutUs(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutusController.aboutUs(), HandlerDef(this, "controllers.AboutusController", "aboutUs", Seq(), "GET", """ About Us""", _prefix + """aboutus""")
)
                      
    
}
                          

// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
class ReverseBugReportController {
    

// @LINE:27
def reports(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.reports(), HandlerDef(this, "controllers.BugReportController", "reports", Seq(), "GET", """ BugReporting""", _prefix + """bugs""")
)
                      

// @LINE:31
def solveReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.solveReport(), HandlerDef(this, "controllers.BugReportController", "solveReport", Seq(), "POST", """""", _prefix + """solve/report""")
)
                      

// @LINE:30
def deleteReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.deleteReport(), HandlerDef(this, "controllers.BugReportController", "deleteReport", Seq(), "POST", """""", _prefix + """delete/report""")
)
                      

// @LINE:29
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.list(), HandlerDef(this, "controllers.BugReportController", "list", Seq(), "GET", """""", _prefix + """bug/list""")
)
                      

// @LINE:28
def newReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.newReport(), HandlerDef(this, "controllers.BugReportController", "newReport", Seq(), "GET", """""", _prefix + """newReport""")
)
                      
    
}
                          

// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseUserController {
    

// @LINE:24
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.delete(id), HandlerDef(this, "controllers.UserController", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """users/$id<[^/]+>/delete""")
)
                      

// @LINE:22
def show(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.show(id), HandlerDef(this, "controllers.UserController", "show", Seq(classOf[Long]), "GET", """""", _prefix + """users/$id<[^/]+>""")
)
                      

// @LINE:20
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.create(), HandlerDef(this, "controllers.UserController", "create", Seq(), "GET", """""", _prefix + """users/create""")
)
                      

// @LINE:16
def signOut(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.signOut(), HandlerDef(this, "controllers.UserController", "signOut", Seq(), "GET", """""", _prefix + """signout""")
)
                      

// @LINE:23
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.update(id), HandlerDef(this, "controllers.UserController", "update", Seq(classOf[Long]), "POST", """""", _prefix + """users/$id<[^/]+>/update""")
)
                      

// @LINE:21
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.save(), HandlerDef(this, "controllers.UserController", "save", Seq(), "POST", """""", _prefix + """users/create""")
)
                      

// @LINE:15
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.authenticate(), HandlerDef(this, "controllers.UserController", "authenticate", Seq(), "POST", """""", _prefix + """signin""")
)
                      

// @LINE:19
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.index(), HandlerDef(this, "controllers.UserController", "index", Seq(), "GET", """ User page""", _prefix + """users""")
)
                      

// @LINE:14
def signIn(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.signIn(), HandlerDef(this, "controllers.UserController", "signIn", Seq(), "GET", """ Login page""", _prefix + """signin""")
)
                      
    
}
                          

// @LINE:10
class ReverseApplication {
    

// @LINE:10
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page application""", _prefix + """application""")
)
                      
    
}
                          

// @LINE:53
// @LINE:52
// @LINE:51
class ReverseDatasetController {
    

// @LINE:53
def getSearchResult(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.getSearchResult(), HandlerDef(this, "controllers.DatasetController", "getSearchResult", Seq(), "GET", """""", _prefix + """climate/getSearchResult""")
)
                      

// @LINE:52
def searchDataset(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.searchDataset(), HandlerDef(this, "controllers.DatasetController", "searchDataset", Seq(), "GET", """""", _prefix + """climate/searchDataSet""")
)
                      

// @LINE:51
def datasetList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.datasetList(), HandlerDef(this, "controllers.DatasetController", "datasetList", Seq(), "GET", """Keyword search""", _prefix + """climate/datasets""")
)
                      
    
}
                          

// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:7
// @LINE:6
class ReverseClimateServiceController {
    

// @LINE:48
def addClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.addClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "addClimateServices", Seq(), "GET", """""", _prefix + """climate/new/climateServices""")
)
                      

// @LINE:41
def mostRecentlyAddedClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostRecentlyAddedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyAddedClimateServices", Seq(), "GET", """""", _prefix + """climate/mostRecentlyAddedClimateServices""")
)
                      

// @LINE:47
def editClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.editClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "editClimateService", Seq(), "POST", """""", _prefix + """climate/edit/climateServices""")
)
                      

// @LINE:43
def mostPopularClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostPopularClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostPopularClimateServices", Seq(), "GET", """""", _prefix + """climate/mostPopularClimateServices""")
)
                      

// @LINE:39
def tutorial(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.tutorial(), HandlerDef(this, "controllers.ClimateServiceController", "tutorial", Seq(), "GET", """""", _prefix + """climate/tutorial""")
)
                      

// @LINE:49
def oneService(url:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.oneService(url), HandlerDef(this, "controllers.ClimateServiceController", "oneService", Seq(classOf[String]), "GET", """""", _prefix + """climate/oneService""")
)
                      

// @LINE:46
def downloadClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.downloadClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "downloadClimateService", Seq(), "POST", """""", _prefix + """climate/download/climateServices""")
)
                      

// @LINE:42
def mostRecentlyUsedClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostRecentlyUsedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyUsedClimateServices", Seq(), "GET", """""", _prefix + """climate/mostRecentlyUsedClimateServices""")
)
                      

// @LINE:40
def climateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.climateServices(), HandlerDef(this, "controllers.ClimateServiceController", "climateServices", Seq(), "GET", """""", _prefix + """climate/climateServices""")
)
                      

// @LINE:44
def newClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.newClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "newClimateService", Seq(), "POST", """""", _prefix + """climate/new/climateServices""")
)
                      

// @LINE:6
def home(email:String, vfile:String, dataset:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]), "GET", """ Home page""", _prefix + """home""")
)
                      

// @LINE:45
def deleteClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.deleteClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "deleteClimateService", Seq(), "POST", """""", _prefix + """climate/delete/climateServices""")
)
                      
    
}
                          
}
        
    