import sbt._
import templemore.sbt.CucumberProject

class Project(info: ProjectInfo) extends DefaultWebProject(info) with CucumberProject {
  val scalatraVersion = "2.0.0-SNAPSHOT"
  val scalatra = "org.scalatra" %% "scalatra" % scalatraVersion
  val scalatratest = "org.scalatra" %% "scalatra-scalatest" % scalatraVersion % "test"
  val servletApi = "org.mortbay.jetty" % "servlet-api" % "2.5-20081211" % "provided"

  val sonatypeNexusSnapshots = "Sonatype Nexus Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

  val jetty6 = "org.mortbay.jetty" % "jetty" % "6.1.22" % "test"
  val scalatest = "org.scalatest" % "scalatest_2.9.0" % "1.6.1" % "test"
}
