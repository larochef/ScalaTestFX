/*
 * Copyright (c) 2016, Innoave.com
 * All rights reserved.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL INNOAVE.COM OR ITS CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

//
// Project Modules
//

lazy val root = project.in(file("."))
  .settings(
    name := "scalatestfx-build",
    publishArtifact := false
  )
  .settings(commonSettings: _*)
  .aggregate(scalatestfx)

lazy val scalatestfx =
  project.in(file("scalatestfx"))
    .settings(commonSettings: _*)
    .settings(
      description := "The ScalaTestFX Framework",
      publishArtifact := true,
      libraryDependencies ++= Seq(
        scalatest,
        testfxCore,
        scalafx
      )
    )

//
// Dependencies
//
lazy val scalatest = "org.scalatest" %% "scalatest" % "3.2.14"
lazy val testfxCore = "org.testfx" % "testfx-core" % "4.0.16-alpha"
lazy val scalafx = "org.scalafx" %% "scalafx" % "19.0.0-R30"

//
// Plugins
//
enablePlugins(GitBranchPrompt)



//
// Common Settings
//
lazy val commonSettings = projectSettings ++ buildSettings

//
// Project Settings
//

lazy val projectSettings = Seq(
  organization := "io.scalatestfx",
  homepage := Some(url("https://github.com/haraldmaida/ScalaTestFX")),
  startYear := Some(2016),
  licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html")),
  scmInfo := Some(ScmInfo(
    url("https://github.com/haraldmaida/ScalaTestFX"),
      "scm:git:git@github.com:haraldmaida/ScalaTestFX.git"
  )),
  git.remoteRepo := "git@github.com:haraldmaida/ScalaTestFX.git"
)

//
// Build Settings
//
lazy val buildSettings = Seq(
  crossScalaVersions := Seq("3.2.1"),
  scalaVersion := crossScalaVersions.value.head,
  scalacOptions ++= Seq(
    "-encoding", "utf8",
    "-unchecked",
    "-deprecation",
    "-feature",
    "-language:_"
  ),
  javacOptions ++= Seq(
    "-xlint:deprecation"
  ),
  sourcesInBase := false,
  parallelExecution := false,
  fork := true
)

