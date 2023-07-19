package ru.ivashkevich
package chapter_03

object Ex02 {
  /** Write a loop that swaps adjacent elements of an array of integers. For example,
   *  Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5). */
  def func(a: Array[Int]): Array[Int] = {
    for(i <- 1 until a.length by 2) {
      val b = a(i)
      a(i) = a(i-1)
      a(i-1) = b
    }
    a
  }

  def test(a: Array[Int]): Unit = {
    println("Exercise 2:")
    println(s"Initial array: ${a.mkString("Array(", ", ", ")")}")
    println(s"Array after using function: ${Ex02.func(a).mkString("Array(", ", ", ")")}")
    println("-------------------------------------------------")
  }
}
