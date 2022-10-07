ThisBuild / organization := "edu.berkeley.cs"
ThisBuild / scalaVersion := "3.2.0"
ThisBuild / version      := "0.1.0-SNAPSHOT"
ThisBuild / crossScalaVersions := Seq("2.13.9", "3.2.0")

lazy val root = (project in file("."))
  .settings(
    name := "hoa-parser",
  )
