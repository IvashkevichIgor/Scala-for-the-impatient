package ru.ivashkevich
package chapter_11

import java.nio.file.{Path, Paths}

object Ex10 extends App {
  /** Modify the PathComponents object of the preceding exercise to instead define an
   *  unapplySeq operation that extracts all path segments. For example, for the file
   *  /home/cay/readme.txt, you should produce a sequence of three segments: home,
   *  cay, and readme.txt. */

  object PathComponents {
    def unapplySeq(path: Path): Option[Seq[String]] = {
      val sPath = path.toString
      if (sPath.trim == "") None else Some(sPath.trim.split('\\'))
    }
  }

  println("Exercise 10:")
  val seq = PathComponents.unapplySeq(Paths.get("\\home\\cay\\readme.txt")).get
  println(s"Full path: \\home\\cay\\readme.txt")
  println(s"Path's parts:")
  for (i <- seq) println(i)
  println("-------------------------------------------------")

}
