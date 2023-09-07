ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

lazy val root = (project in file("."))
  .settings(
    name := "Scala_Database_Connect"
  )
// https://mvnrepository.com/artifact/mysql/mysql-connector-java
//libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.16"
libraryDependencies += "com.mysql" % "mysql-connector-j" % "8.1.0"
//libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.28"
//libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.26"