name := """hello-rxjava2"""

version := "1.0"

scalaVersion := "2.11.8"

val rxjava2Version = "2.0.3"
val logbackVersion = "1.1.7"
val groovyVersion = "2.4.7"
libraryDependencies ++= Seq(

  "io.reactivex.rxjava2" % "rxjava" % s"${rxjava2Version}",

  "ch.qos.logback" % "logback-core" % s"${logbackVersion}",
  "ch.qos.logback" % "logback-classic" % s"${logbackVersion}",
  "ch.qos.logback" % "logback-access" % s"${logbackVersion}",
  "org.codehaus.groovy" % "groovy-all" % s"${groovyVersion}",
  "junit"             % "junit"           % "4.12"  % "test",
  "com.novocode"      % "junit-interface" % "0.11"  % "test"
)
