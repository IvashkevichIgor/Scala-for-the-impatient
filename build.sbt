ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

lazy val root = (project in file("."))
  .settings(
    name := "scala_for_the_impatient",
    idePackagePrefix := Some("ru.ivashkevich")
  )
