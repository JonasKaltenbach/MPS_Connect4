
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object index_Scope1 {
import helper._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(content: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.19*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>

        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css")),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png")),format.raw/*9.97*/("""">
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.at("javascripts/jquery-1.9.0.min.js")),format.raw/*10.74*/("""" type="text/javascript"></script>
    </head>
    <body>

        """),_display_(/*14.10*/form(action = routes.Application.start())/*14.51*/ {_display_(Seq[Any](format.raw/*14.53*/("""
            """),format.raw/*15.13*/("""<label for="s1">Spieler 1 :
                <input id="s1" name="s1">
            </label>
            <br/>
            <label for="s2">Spieler 2 :
                <input id="s2" name="s2">
            </label>
            <br/>
            <br/>


            <input type="submit" id="start" value="Start">

            <br/>
        """)))}),format.raw/*29.10*/("""

    """),format.raw/*31.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(content:String): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}


}
}

/**/
object index extends index_Scope0.index_Scope1.index
              /*
                  -- GENERATED --
                  DATE: Sat Dec 26 11:33:20 CET 2015
                  SOURCE: /Users/jonaskaltenbach/Documents/Scala/wui/app/views/index.scala.html
                  HASH: 2a9a063cd8a69145f9e893d1dea3d89e41ce1f0b
                  MATRIX: 571->18|683->35|710->36|825->125|839->131|893->165|980->226|994->232|1046->264|1098->289|1113->295|1179->340|1274->408|1324->449|1364->451|1405->464|1773->801|1806->807
                  LINES: 23->2|28->2|29->3|34->8|34->8|34->8|35->9|35->9|35->9|36->10|36->10|36->10|40->14|40->14|40->14|41->15|55->29|57->31
                  -- GENERATED --
              */
          