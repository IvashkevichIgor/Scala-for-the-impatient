package ru.ivashkevich
package chapter_09

import java.io.{File, FileWriter, PrintWriter}
import scala.io.Source

object Ex04 extends App {
  /** Write a Scala program that reads a text file containing only floating-point
   *  numbers. Print the sum, average, maximum, and minimum of the numbers
   *  in the file. */

  func(new java.io.File("C:\\Java\\projects\\scala_for_the_impatient\\src\\files\\chapter_09\\ex04.txt"))

  def func(file: File): Unit = {
    val source = Source.fromFile(file)
    val arr: Array[Double] = source.getLines()
      .flatMap(s => s.split(" "))
      .map(s => s.toDouble)
      .toArray
    source.close()

    val sum = s"Sum is ${arr.sum}"
    val avg = s"Average is ${arr.sum / arr.length}"
    val max = s"Max is ${arr.max}"
    val min = s"Min is ${arr.min}"

    val out = new PrintWriter(new FileWriter(file, true))
    out.println()
    out.println(sum)
    out.println(avg)
    out.println(max)
    out.print(min)
    out.close()
  }
}
