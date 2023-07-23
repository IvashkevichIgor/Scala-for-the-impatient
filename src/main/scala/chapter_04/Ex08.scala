package ru.ivashkevich
package chapter_04

object Ex08 {
  /** Write a function minmax(values: Array[Int]) that returns a pair containing the
   * smallest and the largest values in the array. */

  def func(a: Array[Int]): (Int, Int) = {
    (a.min, a.max)
  }

  def test(a:Array[Int]): Unit = {
    println("Exercise 8:")
    println(s"Tuple with the smallest and the largest values in the given array: ${func(a)}")
    println("-------------------------------------------------")
  }
}
