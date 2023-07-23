package ru.ivashkevich
package chapter_04

import chapter_04.Ex03.func

import java.io.File
import scala.collection.SortedMap

object Ex04 {
  /** Repeat the preceding exercise with a sorted map, so that the words are
   * printed in sorted order. */

  def func(file: File): SortedMap[String, Int] = {
    var wordCount = SortedMap[String, Int]()
    val in = new java.util.Scanner(file)
    while (in.hasNextLine) {
      val s = in.nextLine().split(" ")
      for(word <- s) wordCount = wordCount + (word -> (wordCount.getOrElse(word, 0) + 1))
    }
    wordCount
  }

  def test(file: File): Unit = {
    println("Exercise 4:")
    println(s"Reading the file: $file")
    println(s"Words from file using sorted map: ${func(file).mkString("\n", "\n", "")}")
    println("-------------------------------------------------")
  }
}
