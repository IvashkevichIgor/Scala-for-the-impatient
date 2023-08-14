package ru.ivashkevich
package chapter_11

import java.nio.file.{Path, Paths}

object Ex09 extends App{
  /** Define an object PathComponents with an unapply operation class that extracts
   *  the directory path and file name from an java.nio.file.Path. For example, the
   *  file /home/cay/readme.txt has directory path /home/cay and file name readme.txt. */

  object PathComponents {
    def unapply(path: Path): (Path, String) = {
      val sPath = path.toString
      val index = sPath.lastIndexOf("\\")
      val directory = Paths.get(sPath.take(index))
      val fileName = sPath.drop(index + 1)
      (directory, fileName)
    }
  }

  println("Exercise 9:")
  val tuple = PathComponents.unapply(Paths.get("/home/cay/readme.txt"))
  println(s"Full path: /home/cay/readme.txt")
  println(s"Directory: ${tuple._1}")
  println(s"File name: ${tuple._2}")
  println("-------------------------------------------------")
}
