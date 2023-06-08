scalaVersion := "2.13.8"
val sparkVersion = "3.4.0"

name := "hello-world"
organization := "ch.epfl.scala"
version := "1.0"
fork := true

val sparkDependencies = Seq(
    "org.apache.spark" %% "spark-core" % sparkVersion,
    "org.apache.spark" %% "spark-sql" % sparkVersion,
    "org.apache.spark" %% "spark-sql-kafka-0-10" % sparkVersion,
    "org.apache.spark" %% "spark-streaming-kafka-0-10" % sparkVersion
)

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.1"
libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.20.0"
libraryDependencies ++= sparkDependencies 

javaOptions ++= Seq(
  "-Dlog4j.configuration=file:src/main/resources/log4j.properties",
  "--add-opens=java.base/sun.nio.ch=ALL-UNNAMED"
)