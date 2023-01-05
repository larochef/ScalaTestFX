///*
// * Copyright (c) 2016, Innoave.com
// * All rights reserved.
// *
// * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
// * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
// * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
// * DISCLAIMED. IN NO EVENT SHALL INNOAVE.COM OR ITS CONTRIBUTORS BE LIABLE
// * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
// * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
// * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
// * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
// * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
// */
//package io.scalatestfx.api
//
//import scala.language.implicitConversions
//import scala.jdk.CollectionConverters.*
//import scalafx.Includes.given
//
//object ImplicitConversions extends ImplicitConversions
//
//trait ImplicitConversions
//  extends JfxConversions
//
//object JfxConversions extends JfxConversions
//
//trait JfxConversions {
// TODO: see if we need these
//
//  import javafx.stage as jfxst
//  import javafx.scene as jfxsc
//  import javafx.scene.input as jfxin
//  import scalafx.stage.Window
//  import scalafx.scene.Node
//  import scalafx.scene.input.KeyCode
//  import scalafx.scene.input.MouseButton
//  import scalafx.scene.input.InputIncludes.*
//
//  given Conversion[java.util.List[jfxst.Window], Seq[Window]] with
//    def apply(windowList: java.util.List[jfxst.Window]): Seq[Window] =
//      windowList.asScala.toSeq.map(x => x)
//
//
//  given Conversion[java.util.Set[jfxsc.Node], Set[Node]] with
//    def apply(nodeSet: java.util.Set[jfxsc.Node]): Set[Node] =
//      Set.from[jfxsc.Node](nodeSet.asScala).map(x => x)
//
//  given Conversion[java.util.List[jfxsc.Node], List[Node]] with
//    def apply(nodeList: java.util.List[jfxsc.Node]): List[Node] =
//      nodeList.asScala.toList.map(x => x)
//
//  given Conversion[Seq[jfxin.MouseButton], Seq[MouseButton]] with
//    def apply(mouseButtons: Seq[jfxin.MouseButton]): Seq[MouseButton] =
//      mouseButtons.map[MouseButton] { mouseButton => mouseButton}
//
//  given Conversion[Set[Node], Set[jfxsc.Node]] with
//    def apply(nodeSet: Set[Node]): Set[jfxsc.Node] =
//      nodeSet.map[jfxsc.Node] { node => node }
//
//
//  implicit def asJfxNodeSet(nodeList: List[Node]): List[jfxsc.Node] =
//    nodeList.map[jfxsc.Node] { node => node }
//
//  implicit def asJfxKeyCodeSeq(keyCodes: Seq[KeyCode]): Seq[jfxin.KeyCode] =
//    keyCodes.map[jfxin.KeyCode] { keyCode => keyCode }
//
//  implicit def asJfxMouseButtonSeq(
//                                    mouseButtons: Seq[MouseButton]
//                                  ): Seq[jfxin.MouseButton] =
//    mouseButtons.map[jfxin.MouseButton] { mouseButton =>
//      mouseButton
//    }
//
//}
