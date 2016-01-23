
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/jonaskaltenbach/Documents/Scala/MPS_Connect4/WUI/conf/routes
// @DATE:Sat Jan 23 12:10:17 CET 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

object Routes extends Routes

class Routes extends GeneratedRouter {

  import ReverseRouteContext.empty

  override val errorHandler: play.api.http.HttpErrorHandler = play.api.http.LazyHttpErrorHandler

  private var _prefix = "/"

  def withPrefix(prefix: String): Routes = {
    _prefix = prefix
    router.RoutesPrefix.setPrefix(prefix)
    
    this
  }

  def prefix: String = _prefix

  lazy val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation: Seq[(String, String, String)] = List(
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""GET""", prefix, """controllers.Application.init()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """start""", """controllers.Application.start()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """command""", """controllers.Application.command()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:10
  private[this] lazy val controllers_Assets_at0_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at0_invoker = createInvoker(
    controllers.Assets.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_init1_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_init1_invoker = createInvoker(
    controllers.Application.init(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "init",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_start2_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("start")))
  )
  private[this] lazy val controllers_Application_start2_invoker = createInvoker(
    controllers.Application.start(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "start",
      Nil,
      "GET",
      """""",
      this.prefix + """start"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_command3_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("command")))
  )
  private[this] lazy val controllers_Application_command3_invoker = createInvoker(
    controllers.Application.command(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "command",
      Nil,
      "GET",
      """""",
      this.prefix + """command"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:10
    case controllers_Assets_at0_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at0_invoker.call(controllers.Assets.at(path, file))
      }
  
    // @LINE:12
    case controllers_Application_init1_route(params) =>
      call { 
        controllers_Application_init1_invoker.call(controllers.Application.init())
      }
  
    // @LINE:13
    case controllers_Application_start2_route(params) =>
      call { 
        controllers_Application_start2_invoker.call(controllers.Application.start())
      }
  
    // @LINE:14
    case controllers_Application_command3_route(params) =>
      call { 
        controllers_Application_command3_invoker.call(controllers.Application.command())
      }
  }
}