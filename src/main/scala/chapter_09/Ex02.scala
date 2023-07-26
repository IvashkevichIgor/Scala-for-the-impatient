package ru.ivashkevich
package chapter_09

import java.io.{File, PrintWriter}
import scala.io.Source

object Ex02 extends App {
  /** Write a Scala program that reads a file with tabs, replaces each tab with spaces
   *  so that tab stops are at n-column boundaries, and writes the result to the
   *  same file. */

  func(new java.io.File("C:\\Java\\projects\\scala_for_the_impatient\\src\\files\\chapter_09\\ex02.txt"))

  def func(file: File): Unit = {
    val source = Source.fromFile(file)
    val lines = source.getLines()
      .toArray
      .map(x => func1(x))
    source.close()

    val out = new PrintWriter(file)
    for (s <- lines) out.println(s)
    out.close()
  }

  def func1(s: String): String = {
    val arr = s.split("\t")
    (for (i <- 0 to arr.length - 2) yield arr(i) + " " * (4 - arr(i).length() % 4))
      .mkString + arr.last
  }

}
