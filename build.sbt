name := "scala-project"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core"    % "7.2.3",
  "org.specs2" %% "specs2-core"    % "3.8.3"  % "test"
)

resolvers ++= Seq(
  "oss snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "oss releases"  at "http://oss.sonatype.org/content/repositories/releases"
)

scalacOptions := Seq(
  "-deprecation",
  "-unchecked",
  "-Xlint",
  "-feature",
  "-language:_",
  "-Ywarn-unused",
  "-Ywarn-value-discard",
  "-Ywarn-dead-code"
)

scalacOptions in Test ++= Seq("-Yrangepos")

javacOptions ++= Seq(
  "-source", "1.8",
  "-target", "1.8"
)

initialCommands in console := "import scalaz._, Scalaz._"

