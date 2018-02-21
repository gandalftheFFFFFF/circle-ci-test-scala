scalaVersion := "2.12.4"

lazy val akkaVersion = "2.5.9"
lazy val akkaHttpVersion = "10.0.11"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,

  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
  "org.scalatest" %% "scalatest" % "3.0.4" % "test"
)
