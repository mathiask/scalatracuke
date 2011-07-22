package test

import org.scalatra._

class MiniFilter extends ScalatraFilter { 
  get("/start") { 
    "Hello Cucumber"
  }
}
