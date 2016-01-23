
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/jonaskaltenbach/Documents/Scala/wui/conf/routes
// @DATE:Mon Jan 18 11:24:53 CET 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
