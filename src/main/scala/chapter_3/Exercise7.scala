package ru.ivashkevich
package chapter_3

object Exercise7 {
  /** Write a code snippet that produces all values from an array with duplicates
   *  removed. (Hint: Look at Scaladoc.) */
  def func(a: Array[Int]): Array[Int] = {
    a.distinct
  }

  def test(a: Array[Int]): Unit = {
    println("Exercise 7:")
    println(s"Initial array: ${a.mkString("Array(", ", ", ")")}")
    println(s"Array after using function: ${Exercise7.func(a).mkString("Array(", ", ", ")")}")
    println("-------------------------------------------------")
  }
}
