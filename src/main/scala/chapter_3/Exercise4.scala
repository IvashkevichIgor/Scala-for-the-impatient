package ru.ivashkevich
package chapter_3

object Exercise4 {
  /** Given an array of integers, produce a new array that contains all positive
   *  values of the original array, in their original order, followed by all values that
   *  are zero or negative, in their original order. */
  def func(a: Array[Int]): Array[Int] = {
    a.filter(x => x > 0)  ++ a.filter(x => x <= 0)
  }

  def test(a: Array[Int]): Unit = {
    println("Exercise 4:")
    println(s"Initial array: ${a.mkString("Array(", ", ", ")")}")
    println(s"Array after using function: ${Exercise4.func(a).mkString("Array(", ", ", ")")}")
    println("-------------------------------------------------")
  }
}
