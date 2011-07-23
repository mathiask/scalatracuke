import cuke4duke.{EN, ScalaDsl} 
import org.scalatest.matchers.ShouldMatchers
import org.scalatra.test.ScalatraTests

import org.eclipse.jetty.testing.ServletTester

class CucumberSteps extends ScalaDsl with EN with ScalatraTests with ShouldMatchers {

  lazy val tester = new ServletTester
  var lastBody: String = _


  Before { 
    start() 
    addFilter(classOf[test.MiniFilter], "*")
    ()
  }

  After{ stop() }

  Given("""^a running server$""") {}

  When("""^I go to "/start"$""") {
    get("/start"){
      lastBody = body
    }
  }

  Then("""^I should see "Hello Cucumber"$""") {
    lastBody should include ("Hello Cucumber")
  }
}
