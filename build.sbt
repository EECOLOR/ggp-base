name := "ggp-base"

organization := "ggp-org"

version := "1.0"

scalaSource in Compile := baseDirectory.value / "src"

scalaSource in Test := baseDirectory.value / "src-test"

javaSource in Compile := baseDirectory.value / "src"

javaSource in Test := baseDirectory.value / "src-test"

unmanagedJars in Compile := ((baseDirectory.value / "src/external")  ** "*.jar").classpath

val player = inputKey[Unit]("Runs Player.java")

player := (runMain in Compile).partialInput(" org.ggp.base.apps.player.Player").evaluated