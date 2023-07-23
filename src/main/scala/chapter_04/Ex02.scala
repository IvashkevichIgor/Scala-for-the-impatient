package ru.ivashkevich
package chapter_04

import java.io.File
import scala.collection.mutable

object Ex02 {
  /** Write a program that reads words from a file. Use a mutable map to count
   * how often each word appears. To read the words, simply use a java.util.Scanner:
   * val in = new java.util.Scanner(new java.io.File("myfile.txt"))
   * while (in.hasNext()) process in.next()
   * Or look at Chapter 9 for a Scalaesque way.
   * At the end, print out all words and their counts. */

  def func(file: File): mutable.Map[String, Int] = {
    val wordCount = mutable.Map[String, Int]()
    val in = new java.util.Scanner(file)
    while (in.hasNextLine) {
      val s = in.nextLine().split(" ")
      for(word <- s){
        if (wordCount.contains(word)) wordCount += (word -> (wordCount(word) + 1))
        else wordCount += (word -> 1)
      }
    }
    wordCount
  }

  def test(file: File): Unit = {
    println("Exercise 2:")
    println(s"Reading the file: $file")
    println(s"Words from file: ${func(file).mkString("\n", "\n", "")}")
    println("-------------------------------------------------")
  }
}
