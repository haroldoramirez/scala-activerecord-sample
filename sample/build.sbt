val _version = "0.3.1"

name := "scala-activerecord-sample"

organization := "com.github.aselab"

version := _version

scalaVersion := "2.11.6"

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  "com.github.aselab" %% "scala-activerecord" % _version,
  "com.h2database" % "h2" % "1.4.185",
  "org.slf4j" % "slf4j-nop" % "1.7.10"
  // for debug
  //"org.slf4j" % "slf4j-api" % "1.7.10",
  //"ch.qos.logback" % "logback-classic" % "1.1.2"
)

scalacOptions ++= Seq("-deprecation", "-unchecked")

discoveredMainClasses in Compile ~= {_.sorted}

activerecordGeneratorSettings
