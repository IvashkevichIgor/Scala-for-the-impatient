package ru.ivashkevich
package chapter_12

object Ex06 extends App {
  /** Modify the previous function to return the input at which the output is largest.
   *  For example, largestAt(x => 10 * x - x * x, 1 to 10) should return 5. Don’t use
   *  a loop or recursion. */

  def largest(fun: (Int) => Int, inputs: Seq[Int]): Int = {
    inputs.find(fun(_) == inputs.map(fun).max).get
  }

  println("Exercise 6:")
  println(s"largest(x => 10 * x - x * x, 1 to 10) = ${largest(x => 10 * x - x * x, 1 to 10)}")
  println("-------------------------------------------------")

}
