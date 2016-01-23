
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/jonaskaltenbach/Documents/Scala/MPS_Connect4/WUI/conf/routes
// @DATE:Sat Jan 23 12:10:17 CET 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:10
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:10
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def command: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.command",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "command"})
        }
      """
    )
  
    // @LINE:13
    def start: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.start",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "start"})
        }
      """
    )
  
    // @LINE:12
    def init: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.init",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}