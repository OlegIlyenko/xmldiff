name := "xmldiff"

version := "0.5"

organization := "in.org.patel"

scalaVersion := "2.10.2"

mainClass in oneJar := Some("in.org.patel.xmldiff.Main")

seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.9.1" % "test"
)