
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/jonaskaltenbach/Documents/Scala/MPS_Connect4/WUI/conf/routes
// @DATE:Sat Jan 23 12:10:17 CET 2016


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
