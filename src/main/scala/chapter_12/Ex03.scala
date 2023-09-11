package ru.ivashkevich
package chapter_12

object Ex03 extends App {
  /** Implement the factorial function using to and reduceLeft, without a loop or
   *  recursion. */

  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else (1 to n).reduceLeft(_ * _)
  }

  println("Exercise 3:")
  val x = 7
  println(s"$x! = ${factorial(x)}")
  println("-------------------------------------------------")
}
