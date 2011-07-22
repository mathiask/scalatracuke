import cuke4duke.{EN, ScalaDsl} 
import org.scalatest.matchers.ShouldMatchers
import org.scalatra.test.ScalatraTests

import org.eclipse.jetty.testing.ServletTester

class CucumberSteps extends ScalaDsl with EN with ScalatraTests with ShouldMatchers {

  lazy val tester = new ServletTester
  var url: String = _


  Before { 
    start() 
    addFilter(classOf[test.MiniFilter], "*")
    ()
  }

  After{ stop() }

  Given("""^a running server$""") { url = "unknown" }

  When("""^I go to "/start"$""") {
    url = "/start"
  }

  Then("""^I should see "Hello Cucumber"$""") {
    get(url) { 
      body should include ("Hello Cucumber")
    }
  }
}
