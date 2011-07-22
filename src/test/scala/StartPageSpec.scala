import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers

import org.scalatra.test.scalatest.ScalatraSuite

class StartPageSpec extends WordSpec with ScalatraSuite with ShouldMatchers { 
  addFilter(classOf[test.MiniFilter], "*")

  "The start page" should { 
    "contain the word 'Hello'" in { 
      get("/start") { 
        body should include ("Hello")
      }
    }
  }
}
