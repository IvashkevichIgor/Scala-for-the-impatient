package ru.ivashkevich
package chapter_12

object Ex04 extends App {
  /** The previous implementation needed a special case when n < 1. Show how
   *  you can avoid this with foldLeft. (Look at the Scaladoc for foldLeft. It’s like
   *  reduceLeft, except that the first value in the chain of combined values is supplied
   *  in the call.) */

  def factorial(x: Int): Int = {
    (1 to x).foldLeft(1)(_ * _)
  }

  println("Exercise 4:")
  val x = -7
  println(s"$x! = ${factorial(x)}")
  println("-------------------------------------------------")
}
