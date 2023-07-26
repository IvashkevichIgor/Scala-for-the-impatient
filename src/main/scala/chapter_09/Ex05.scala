package ru.ivashkevich
package chapter_09

import java.io.{File, PrintWriter}

object Ex05 extends App {
  /** Write a Scala program that writes the powers of 2 and their reciprocals to a
   *  file, with the exponent ranging from 0 to 20. Line up the columns:
   *    1   1
   *    2   0.5
   *    4   0.25
   *  ...   ... */

  func(new java.io.File("C:\\Java\\projects\\scala_for_the_impatient\\src\\files\\chapter_09\\ex05.txt"))

  def func(file: File): Unit = {
    val arr: Array[(Double, Double)] = {
      for (i <- 0 to 20) yield (math.pow(2, i), math.pow(2, -i))
    }.toArray
    val maxLength = arr.last._1.toString.length
    val out = new PrintWriter(file)
    for ((a, b) <- arr) out.println(s"${" " * (maxLength - a.toString.length)} ${a.toInt}${"\t" * 2}$b")
    out.close()
  }
}
