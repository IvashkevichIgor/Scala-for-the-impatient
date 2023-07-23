package ru.ivashkevich
package chapter_04

object Ex09 {
  /** Write a function lteqgt(values: Array[Int], v: Int) that returns a triple containing
   * the counts of values less than v, equal to v, and greater than v. */
  def func(a: Array[Int], v: Int): (Int, Int, Int) = {
    (a.count(x => x < v), a.count(x => x == v), a.count(x => x > v))
  }

  def test(a:Array[Int], v: Int): Unit = {
    println("Exercise 9:")
    println(s"Tuple containing the counts of values less than v, equal to v, and greater than v: ${func(a, v)}")
    println("-------------------------------------------------")
  }
}
