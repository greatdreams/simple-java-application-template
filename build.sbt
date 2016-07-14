name := """simple-java-application-template"""

version := "1.0"

scalaVersion := "2.11.8"

val slf4jVersion = "1.7.21"
val log4jVersion = "2.6.2"

libraryDependencies ++= Seq(

  "org.slf4j" % "slf4j-api" % slf4jVersion,
  "org.apache.logging.log4j"% "log4j-slf4j-impl" % log4jVersion,
  "org.apache.logging.log4j"% "log4j-api" % log4jVersion,
  "org.apache.logging.log4j" % "log4j-core" % log4jVersion,
  
  "junit"             % "junit"           % "4.12"  % "test",
  "com.novocode"      % "junit-interface" % "0.11"  % "test"
)
