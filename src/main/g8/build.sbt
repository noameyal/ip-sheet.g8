// give the user a nice default project!
ThisBuild / scalaVersion := "2.13.1"

lazy val root = (project in file(".")).
  settings(
    name := "PS$number$"
  )
