inThisBuild(List(
  organization := "com.github.japgolly.sbt-docker-compose",
  homepage := Some(url("https://github.com/japgolly/sbt-docker-compose")),
  licenses := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")),
  developers := List(
    Developer("japgolly", "David Barri", "japgolly@gmail.com", url("https://github.com/japgolly")),
  ),
))

name := "lib"

// MANDATORY: sbt 1.x plugins and build libraries must use Scala 2.12
scalaVersion := "2.12.21"

libraryDependencies += "org.scala-sbt" % "sbt" % "1.11.7" % Provided

libraryDependencies += "com.lihaoyi" %% "utest" % "0.9.2" % Test

testFrameworks += new TestFramework("utest.runner.Framework")
