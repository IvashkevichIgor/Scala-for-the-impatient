package ru.ivashkevich
package chapter_12

object Ex02 extends App {
  /** How do you get the largest element of an array with reduceLeft? */
  val arr = Array(1, 5, 9, 15, 28, -7, -33)

  println("Exercise 2:")
  println(s"Max from ${arr.mkString("Array(", ", ", ")")} is ${arr.reduceLeft(_.max(_))}")
  println("-------------------------------------------------")
}
