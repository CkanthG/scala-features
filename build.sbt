ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.10"

lazy val root = (project in file("."))
  .settings(
    name := "scala-features"
  )

libraryDependencies += "org.scala-lang.modules" % "scala-xml_2.12" % "2.2.0"
