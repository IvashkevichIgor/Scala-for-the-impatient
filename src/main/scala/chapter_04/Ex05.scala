package ru.ivashkevich
package chapter_04

import scala.jdk.CollectionConverters._
import java.io.File
import scala.collection.mutable

object Ex05 {
  /** Repeat the preceding exercise with a java.util.TreeMap that you adapt to the
   * Scala API. */

  def func(file: File): mutable.Map[String, Int] = {
    var wordCount = new java.util.TreeMap[String, Int]()
    val in = new java.util.Scanner(file)
    while (in.hasNextLine) {
      val s = in.nextLine().split(" ")
      for(word <- s){
        if (wordCount.containsKey(word)) wordCount.put(word, wordCount.get(word) + 1)
        else wordCount.put(word, 1)
      }
    }
    wordCount.asScala
  }

  def test(file: File): Unit = {
    println("Exercise 5:")
    println(s"Reading the file: $file")
    println(s"Words from file using TreeMap: ${func(file).mkString("\n", "\n", "")}")
    println("-------------------------------------------------")
  }

}
