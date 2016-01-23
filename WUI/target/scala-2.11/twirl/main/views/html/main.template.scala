
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object main_Scope1 {
import helper._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(content: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.19*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*7.54*/routes/*7.60*/.Assets.at("stylesheets/main.css")),format.raw/*7.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.at("images/favicon.png")),format.raw/*8.97*/("""">
        <script src=""""),_display_(/*9.23*/routes/*9.29*/.Assets.at("javascripts/jquery-1.9.0.min.js")),format.raw/*9.74*/("""" type="text/javascript"></script>
    </head>
    <body>

        """),_display_(/*13.10*/form(action = routes.Application.command())/*13.53*/ {_display_(Seq[Any](format.raw/*13.55*/("""
            """),format.raw/*14.13*/("""<label for="line">Bitte Spalte angeben :
                <input id="line" name="line" size="3">
            </label>
            <br/>
            <input type="submit" id="go" value="OK">
            <br/>
            <br/>
            <br/>
        """)))}),format.raw/*22.10*/("""
        """),format.raw/*23.9*/("""<textarea readonly cols='60' rows='15' >"""),_display_(/*23.50*/content),format.raw/*23.57*/("""</textarea>
    </body>
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
object main extends main_Scope0.main_Scope1.main
              /*
                  -- GENERATED --
                  DATE: Mon Jan 18 11:24:54 CET 2016
                  SOURCE: /Users/jonaskaltenbach/Documents/Scala/wui/app/views/main.scala.html
                  HASH: 7b716c0a8919d0e39bf1e68e40e19d72c7ba2550
                  MATRIX: 568->18|680->35|708->37|821->124|835->130|889->164|976->225|990->231|1042->263|1093->288|1107->294|1172->339|1267->407|1319->450|1359->452|1400->465|1682->716|1718->725|1786->766|1814->773
                  LINES: 23->2|28->2|30->4|33->7|33->7|33->7|34->8|34->8|34->8|35->9|35->9|35->9|39->13|39->13|39->13|40->14|48->22|49->23|49->23|49->23
                  -- GENERATED --
              */
          