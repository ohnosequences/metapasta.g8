import AssemblyKeys._

Statika.distributionProject

name := "$name$"

description := ""

organization := "$organization$"

libraryDependencies ++= Seq(
  ("ohnosequences" %% "metapasta" % "0.9.12-RC2").exclude("com.amazonaws", "aws-java-sdk")
)

resolvers +=  Resolver.url("era7" + " public ivy releases",  url("http://releases.era7.com.s3.amazonaws.com"))(Resolver.ivyStylePatterns)

resolvers +=  Resolver.url("era7" + " public ivy snapshots",  url("http://snapshots.era7.com.s3.amazonaws.com"))(Resolver.ivyStylePatterns)

resolvers += Resolver.sonatypeRepo("snapshots")

metadataObject := name.value

dependencyOverrides += "ohnosequences" %% "aws-scala-tools" % "0.13.2"

dependencyOverrides += "ohnosequences" %% "aws-statika" % "1.0.1"

dependencyOverrides += "ohnosequences" %% "amazon-linux-ami" % "0.14.1"

dependencyOverrides += "commons-codec" % "commons-codec" % "1.6"

dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-core" % "2.1.2"

dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-databind" % "2.1.2"

dependencyOverrides += "jline" % "jline" % "2.6"

dependencyOverrides += "org.slf4j" % "slf4j-api" % "1.7.5"

