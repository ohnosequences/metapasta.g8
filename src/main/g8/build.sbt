import AssemblyKeys._

Statika.distributionProject

name := "$name$"

description := ""

organization := "$organization$"

libraryDependencies ++= Seq(
  "ohnosequences" % "metapasta_2.10" % "0.1.6"
)

resolvers += Resolver.sonatypeRepo("snapshots")

metadataObject := name.value

dependencyOverrides += "ohnosequences" % "aws-scala-tools_2.10" % "0.6.1"

dependencyOverrides += "ohnosequences" % "aws-statika_2.10" % "1.0.1"

dependencyOverrides += "ohnosequences" % "amazon-linux-ami_2.10" % "0.14.1"

dependencyOverrides += "commons-codec" % "commons-codec" % "1.6"

dependencyOverrides += "org.scala-lang" % "scala-library" % "2.10.3"

dependencyOverrides += "org.scala-lang" % "scala-compiler" % "2.10.3"

dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-core" % "2.1.2"

dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-databind" % "2.1.2"

dependencyOverrides += "jline" % "jline" % "2.6"

dependencyOverrides += "org.slf4j" % "slf4j-api" % "1.7.5"

