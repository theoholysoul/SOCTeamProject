// @SOURCE:/Users/Holysoul/Desktop/SOCTeamProject/ApacheCMDA-Frontend/conf/routes
// @HASH:8b62dcb11ec977f4c64b0562b5a1bad2f2b6db50
// @DATE:Tue Dec 01 13:47:27 PST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:92
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
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
// @LINE:10
// @LINE:7
// @LINE:6
package controllers {

// @LINE:92
class ReverseAssets {
    

// @LINE:92
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
class ReverseTagController {
    

// @LINE:63
def tagCloud(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "tag/tagCloud")
}
                                                

// @LINE:62
def oneService(url:String = null): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "tag/oneService" + queryString(List(if(url == null) None else Some(implicitly[QueryStringBindable[String]].unbind("url", url)))))
}
                                                

// @LINE:61
def tags(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "tag/tags")
}
                                                

// @LINE:60
def home(email:String = null, vfile:String = null, dataset:String = null): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "tag" + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
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
                          

// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
class ReverseWorkflowController {
    

// @LINE:56
def displayWorkflow(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflow/disWorkflow" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:53
def workflows(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflows")
}
                                                

// @LINE:57
def workflowsByTopViewCount(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflow/getTop10WorkflowsByViewCount")
}
                                                

// @LINE:52
def createWorkflow(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflow/createWorkflow")
}
                                                

// @LINE:54
def handleCreateWorkflow(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflow/workflowCreating")
}
                                                

// @LINE:55
def linkTags(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflow/linkTags")
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
                          

// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
class ReverseUserGroupController {
    

// @LINE:87
def newGroup(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "usergroups/addGroup")
}
                                                

// @LINE:89
def oneGroup(userGroupId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "usergroups/" + implicitly[PathBindable[Long]].unbind("userGroupId", userGroupId))
}
                                                

// @LINE:88
def newGroupForm(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "usergroups/addGroupForm")
}
                                                

// @LINE:86
def showGroups(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "usergroups/all")
}
                                                
    
}
                          

// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
class ReverseUserController {
    

// @LINE:75
def signUp(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/signUp")
}
                                                

// @LINE:74
def signUpForm(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/signUpForm")
}
                                                

// @LINE:83
def deleteSubscribe(userId:Long, isFriend:Boolean): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/deleteSubscribe" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("userId", userId)), Some(implicitly[QueryStringBindable[Boolean]].unbind("isFriend", isFriend)))))
}
                                                

// @LINE:79
def showFriends(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/friends")
}
                                                

// @LINE:72
def profile(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/myProfile")
}
                                                

// @LINE:84
def showSubscriptions(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/subscriptions")
}
                                                

// @LINE:78
def signOut(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/signOut")
}
                                                

// @LINE:85
def oneUser(userId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/account/" + implicitly[PathBindable[Long]].unbind("userId", userId))
}
                                                

// @LINE:76
def signInForm(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/signInForm")
}
                                                

// @LINE:81
def deleteFriend(userId:Long, isSubscribe:Boolean): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/deletefriend" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("userId", userId)), Some(implicitly[QueryStringBindable[Boolean]].unbind("isSubscribe", isSubscribe)))))
}
                                                

// @LINE:73
def allUsers(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/allUsers")
}
                                                

// @LINE:80
def addFriend(userId:Long, isSubscribe:Boolean): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/addfriend" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("userId", userId)), Some(implicitly[QueryStringBindable[Boolean]].unbind("isSubscribe", isSubscribe)))))
}
                                                

// @LINE:82
def addSubscribe(userId:Long, isFriend:Boolean): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/addSubscribe" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("userId", userId)), Some(implicitly[QueryStringBindable[Boolean]].unbind("isFriend", isFriend)))))
}
                                                

// @LINE:77
def signIn(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/signIn")
}
                                                
    
}
                          

// @LINE:10
class ReverseApplication {
    

// @LINE:10
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "application")
}
                                                
    
}
                          

// @LINE:69
// @LINE:68
// @LINE:67
class ReverseDatasetController {
    

// @LINE:69
def getSearchResult(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/getSearchResult")
}
                                                

// @LINE:68
def searchDataset(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/searchDataSet")
}
                                                

// @LINE:67
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
                  


// @LINE:92
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
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
// @LINE:10
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:92
class ReverseAssets {
    

// @LINE:92
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
class ReverseTagController {
    

// @LINE:63
def tagCloud : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TagController.tagCloud",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tag/tagCloud"})
      }
   """
)
                        

// @LINE:62
def oneService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TagController.oneService",
   """
      function(url) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tag/oneService" + _qS([(url == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("url", url))])})
      }
   """
)
                        

// @LINE:61
def tags : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TagController.tags",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tag/tags"})
      }
   """
)
                        

// @LINE:60
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TagController.home",
   """
      function(email,vfile,dataset) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tag" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
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
              

// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
class ReverseWorkflowController {
    

// @LINE:56
def displayWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.displayWorkflow",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/disWorkflow" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:53
def workflows : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.workflows",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflows"})
      }
   """
)
                        

// @LINE:57
def workflowsByTopViewCount : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.workflowsByTopViewCount",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/getTop10WorkflowsByViewCount"})
      }
   """
)
                        

// @LINE:52
def createWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.createWorkflow",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/createWorkflow"})
      }
   """
)
                        

// @LINE:54
def handleCreateWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.handleCreateWorkflow",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/workflowCreating"})
      }
   """
)
                        

// @LINE:55
def linkTags : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.linkTags",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/linkTags"})
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
              

// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
class ReverseUserGroupController {
    

// @LINE:87
def newGroup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserGroupController.newGroup",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usergroups/addGroup"})
      }
   """
)
                        

// @LINE:89
def oneGroup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserGroupController.oneGroup",
   """
      function(userGroupId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usergroups/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userGroupId", userGroupId)})
      }
   """
)
                        

// @LINE:88
def newGroupForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserGroupController.newGroupForm",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usergroups/addGroupForm"})
      }
   """
)
                        

// @LINE:86
def showGroups : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserGroupController.showGroups",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usergroups/all"})
      }
   """
)
                        
    
}
              

// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
class ReverseUserController {
    

// @LINE:75
def signUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.signUp",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/signUp"})
      }
   """
)
                        

// @LINE:74
def signUpForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.signUpForm",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/signUpForm"})
      }
   """
)
                        

// @LINE:83
def deleteSubscribe : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.deleteSubscribe",
   """
      function(userId,isFriend) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/deleteSubscribe" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("userId", userId), (""" + implicitly[QueryStringBindable[Boolean]].javascriptUnbind + """)("isFriend", isFriend)])})
      }
   """
)
                        

// @LINE:79
def showFriends : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.showFriends",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/friends"})
      }
   """
)
                        

// @LINE:72
def profile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.profile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/myProfile"})
      }
   """
)
                        

// @LINE:84
def showSubscriptions : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.showSubscriptions",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/subscriptions"})
      }
   """
)
                        

// @LINE:78
def signOut : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.signOut",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/signOut"})
      }
   """
)
                        

// @LINE:85
def oneUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.oneUser",
   """
      function(userId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/account/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId)})
      }
   """
)
                        

// @LINE:76
def signInForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.signInForm",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/signInForm"})
      }
   """
)
                        

// @LINE:81
def deleteFriend : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.deleteFriend",
   """
      function(userId,isSubscribe) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/deletefriend" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("userId", userId), (""" + implicitly[QueryStringBindable[Boolean]].javascriptUnbind + """)("isSubscribe", isSubscribe)])})
      }
   """
)
                        

// @LINE:73
def allUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.allUsers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/allUsers"})
      }
   """
)
                        

// @LINE:80
def addFriend : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.addFriend",
   """
      function(userId,isSubscribe) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/addfriend" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("userId", userId), (""" + implicitly[QueryStringBindable[Boolean]].javascriptUnbind + """)("isSubscribe", isSubscribe)])})
      }
   """
)
                        

// @LINE:82
def addSubscribe : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.addSubscribe",
   """
      function(userId,isFriend) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/addSubscribe" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("userId", userId), (""" + implicitly[QueryStringBindable[Boolean]].javascriptUnbind + """)("isFriend", isFriend)])})
      }
   """
)
                        

// @LINE:77
def signIn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.signIn",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/signIn"})
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
              

// @LINE:69
// @LINE:68
// @LINE:67
class ReverseDatasetController {
    

// @LINE:69
def getSearchResult : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.getSearchResult",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/getSearchResult"})
      }
   """
)
                        

// @LINE:68
def searchDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.searchDataset",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/searchDataSet"})
      }
   """
)
                        

// @LINE:67
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
        


// @LINE:92
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
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
// @LINE:10
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:92
class ReverseAssets {
    

// @LINE:92
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
class ReverseTagController {
    

// @LINE:63
def tagCloud(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TagController.tagCloud(), HandlerDef(this, "controllers.TagController", "tagCloud", Seq(), "GET", """""", _prefix + """tag/tagCloud""")
)
                      

// @LINE:62
def oneService(url:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TagController.oneService(url), HandlerDef(this, "controllers.TagController", "oneService", Seq(classOf[String]), "GET", """""", _prefix + """tag/oneService""")
)
                      

// @LINE:61
def tags(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TagController.tags(), HandlerDef(this, "controllers.TagController", "tags", Seq(), "GET", """""", _prefix + """tag/tags""")
)
                      

// @LINE:60
def home(email:String, vfile:String, dataset:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TagController.home(email, vfile, dataset), HandlerDef(this, "controllers.TagController", "home", Seq(classOf[String], classOf[String], classOf[String]), "GET", """ Tag Model""", _prefix + """tag""")
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
                          

// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
class ReverseWorkflowController {
    

// @LINE:56
def displayWorkflow(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.displayWorkflow(id), HandlerDef(this, "controllers.WorkflowController", "displayWorkflow", Seq(classOf[Long]), "GET", """""", _prefix + """workflow/disWorkflow""")
)
                      

// @LINE:53
def workflows(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.workflows(), HandlerDef(this, "controllers.WorkflowController", "workflows", Seq(), "GET", """""", _prefix + """workflows""")
)
                      

// @LINE:57
def workflowsByTopViewCount(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.workflowsByTopViewCount(), HandlerDef(this, "controllers.WorkflowController", "workflowsByTopViewCount", Seq(), "GET", """""", _prefix + """workflow/getTop10WorkflowsByViewCount""")
)
                      

// @LINE:52
def createWorkflow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.createWorkflow(), HandlerDef(this, "controllers.WorkflowController", "createWorkflow", Seq(), "GET", """Workflow""", _prefix + """workflow/createWorkflow""")
)
                      

// @LINE:54
def handleCreateWorkflow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.handleCreateWorkflow(), HandlerDef(this, "controllers.WorkflowController", "handleCreateWorkflow", Seq(), "GET", """""", _prefix + """workflow/workflowCreating""")
)
                      

// @LINE:55
def linkTags(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.linkTags(), HandlerDef(this, "controllers.WorkflowController", "linkTags", Seq(), "GET", """""", _prefix + """workflow/linkTags""")
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
                          

// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
class ReverseUserGroupController {
    

// @LINE:87
def newGroup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserGroupController.newGroup(), HandlerDef(this, "controllers.UserGroupController", "newGroup", Seq(), "GET", """""", _prefix + """usergroups/addGroup""")
)
                      

// @LINE:89
def oneGroup(userGroupId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserGroupController.oneGroup(userGroupId), HandlerDef(this, "controllers.UserGroupController", "oneGroup", Seq(classOf[Long]), "GET", """""", _prefix + """usergroups/$userGroupId<[^/]+>""")
)
                      

// @LINE:88
def newGroupForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserGroupController.newGroupForm(), HandlerDef(this, "controllers.UserGroupController", "newGroupForm", Seq(), "GET", """""", _prefix + """usergroups/addGroupForm""")
)
                      

// @LINE:86
def showGroups(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserGroupController.showGroups(), HandlerDef(this, "controllers.UserGroupController", "showGroups", Seq(), "GET", """""", _prefix + """usergroups/all""")
)
                      
    
}
                          

// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
class ReverseUserController {
    

// @LINE:75
def signUp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.signUp(), HandlerDef(this, "controllers.UserController", "signUp", Seq(), "GET", """""", _prefix + """users/signUp""")
)
                      

// @LINE:74
def signUpForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.signUpForm(), HandlerDef(this, "controllers.UserController", "signUpForm", Seq(), "GET", """""", _prefix + """users/signUpForm""")
)
                      

// @LINE:83
def deleteSubscribe(userId:Long, isFriend:Boolean): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.deleteSubscribe(userId, isFriend), HandlerDef(this, "controllers.UserController", "deleteSubscribe", Seq(classOf[Long], classOf[Boolean]), "GET", """""", _prefix + """users/deleteSubscribe""")
)
                      

// @LINE:79
def showFriends(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.showFriends(), HandlerDef(this, "controllers.UserController", "showFriends", Seq(), "GET", """""", _prefix + """users/friends""")
)
                      

// @LINE:72
def profile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.profile(), HandlerDef(this, "controllers.UserController", "profile", Seq(), "GET", """User Profiles""", _prefix + """users/myProfile""")
)
                      

// @LINE:84
def showSubscriptions(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.showSubscriptions(), HandlerDef(this, "controllers.UserController", "showSubscriptions", Seq(), "GET", """""", _prefix + """users/subscriptions""")
)
                      

// @LINE:78
def signOut(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.signOut(), HandlerDef(this, "controllers.UserController", "signOut", Seq(), "GET", """""", _prefix + """users/signOut""")
)
                      

// @LINE:85
def oneUser(userId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.oneUser(userId), HandlerDef(this, "controllers.UserController", "oneUser", Seq(classOf[Long]), "GET", """""", _prefix + """users/account/$userId<[^/]+>""")
)
                      

// @LINE:76
def signInForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.signInForm(), HandlerDef(this, "controllers.UserController", "signInForm", Seq(), "GET", """""", _prefix + """users/signInForm""")
)
                      

// @LINE:81
def deleteFriend(userId:Long, isSubscribe:Boolean): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.deleteFriend(userId, isSubscribe), HandlerDef(this, "controllers.UserController", "deleteFriend", Seq(classOf[Long], classOf[Boolean]), "GET", """""", _prefix + """users/deletefriend""")
)
                      

// @LINE:73
def allUsers(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.allUsers(), HandlerDef(this, "controllers.UserController", "allUsers", Seq(), "GET", """""", _prefix + """users/allUsers""")
)
                      

// @LINE:80
def addFriend(userId:Long, isSubscribe:Boolean): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.addFriend(userId, isSubscribe), HandlerDef(this, "controllers.UserController", "addFriend", Seq(classOf[Long], classOf[Boolean]), "GET", """""", _prefix + """users/addfriend""")
)
                      

// @LINE:82
def addSubscribe(userId:Long, isFriend:Boolean): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.addSubscribe(userId, isFriend), HandlerDef(this, "controllers.UserController", "addSubscribe", Seq(classOf[Long], classOf[Boolean]), "GET", """""", _prefix + """users/addSubscribe""")
)
                      

// @LINE:77
def signIn(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.signIn(), HandlerDef(this, "controllers.UserController", "signIn", Seq(), "GET", """""", _prefix + """users/signIn""")
)
                      
    
}
                          

// @LINE:10
class ReverseApplication {
    

// @LINE:10
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page application""", _prefix + """application""")
)
                      
    
}
                          

// @LINE:69
// @LINE:68
// @LINE:67
class ReverseDatasetController {
    

// @LINE:69
def getSearchResult(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.getSearchResult(), HandlerDef(this, "controllers.DatasetController", "getSearchResult", Seq(), "GET", """""", _prefix + """climate/getSearchResult""")
)
                      

// @LINE:68
def searchDataset(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.searchDataset(), HandlerDef(this, "controllers.DatasetController", "searchDataset", Seq(), "GET", """""", _prefix + """climate/searchDataSet""")
)
                      

// @LINE:67
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
        
    