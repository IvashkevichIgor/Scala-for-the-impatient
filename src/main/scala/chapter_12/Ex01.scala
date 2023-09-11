package ru.ivashkevich
package chapter_12

object Ex01 extends App {
  /** Write a function values(fun: (Int) => Int, low: Int, high: Int) that yields a collection
   *  of function inputs and outputs in a given range. For example, values(x =>
   *  x * x, -5, 5) should produce a collection of pairs (-5, 25), (-4, 16), (-3, 9), . . . ,
   *  (5, 25). */

  def values (fun: (Int) => Int, low: Int, high: Int): Seq[(Int, Int)] = {
    (low to high).map(x => (x, fun(x)))
  }

  println("Exercise 1:")
  println(s"values(x => x * x, -5, 5) = ${values(x => x * x, -5, 5)}")
  println("-------------------------------------------------")
}
