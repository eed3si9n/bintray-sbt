addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.5")
addSbtPlugin("com.dwijnand"      % "sbt-dynver"  % "4.0.0")

libraryDependencies += "org.scala-sbt" % "scripted-plugin" % sbtVersion.value
