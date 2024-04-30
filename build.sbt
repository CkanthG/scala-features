ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.13"

lazy val root = (project in file("."))
  .settings(
    name := "scala-features"
  )

libraryDependencies += "org.scala-lang.modules" % "scala-xml_2.12" % "2.2.0"
// https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.9.0-M2"
// https://mvnrepository.com/artifact/org.scala-lang.modules/scala-parallel-collections
libraryDependencies += "org.scala-lang.modules" %% "scala-parallel-collections" % "1.0.4"
// https://mvnrepository.com/artifact/org.scala-stm/scala-stm
libraryDependencies += "org.scala-stm" %% "scala-stm" % "0.11.1"
