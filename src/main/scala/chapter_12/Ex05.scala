package ru.ivashkevich
package chapter_12

object Ex05 extends App {
  /** Write a function largest(fun: (Int) => Int, inputs: Seq[Int]) that yields the largest
   *  value of a function within a given sequence of inputs. For example, largest(x
   *  => 10 * x - x * x, 1 to 10) should return 25. Don’t use a loop or recursion. */

  def largest(fun: (Int) => Int, inputs: Seq[Int]): Int = {
    inputs.map(fun).max
  }

  println("Exercise 5:")
  println(s"largest(x => 10 * x - x * x, 1 to 10) = ${largest(x => 10 * x - x * x, 1 to 10)}")
  println("-------------------------------------------------")
}
