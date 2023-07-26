package ru.ivashkevich
package chapter_09

import java.io.{File, PrintWriter}
import scala.io.Source

object Ex01 extends App {
  /** Write a Scala code snippet that reverses the lines in a file (making the last
   *  line the first one, and so on). */

    func(new java.io.File("C:\\Java\\projects\\scala_for_the_impatient\\src\\files\\chapter_09\\ex01.txt"))

  def func(file: File): Unit = {
    val source = Source.fromFile(file)
    val lines = source.getLines().toArray.reverse
    source.close()

    val out = new PrintWriter(file)
    for (s <- lines) out.println(s)
    out.close()
  }
}
