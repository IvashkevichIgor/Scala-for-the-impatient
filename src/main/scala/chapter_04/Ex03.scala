package ru.ivashkevich
package chapter_04

import java.io.File

object Ex03 {
  /** Repeat the preceding exercise with an immutable map. */
  def func(file: File): Map[String, Int] = {
    var wordCount = Map[String, Int]()
    val in = new java.util.Scanner(file)
    while (in.hasNextLine) {
      val s = in.nextLine().split(" ")
      for(word <- s) wordCount = wordCount + (word -> (wordCount.getOrElse(word, 0) + 1))
    }
    wordCount
  }

  def test(file: File): Unit = {
    println("Exercise 3:")
    println(s"Reading the file: $file")
    println(s"Words from file using immutable map: ${func(file).mkString("\n", "\n", "")}")
    println("-------------------------------------------------")
  }
}
