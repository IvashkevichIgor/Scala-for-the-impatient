package ru.ivashkevich
package chapter_09

import java.io.File
import scala.io.Source

object Ex03 extends App {
  /** Write a Scala code snippet that reads a file and prints all words with more
   *  than 10 characters to the console. Extra credit if you can do this in a single line. */

  func(new java.io.File("C:\\Java\\projects\\scala_for_the_impatient\\src\\files\\chapter_09\\ex03.txt"))

  def func(file: File): Unit = {
    val source = Source.fromFile(file)
    source.getLines()
      .flatMap(s => s.split(" "))
      .filter(s => s.length > 10)
      .foreach(s => println(s))
    source.close()
  }
}
