package ru.ivashkevich
package chapter_3

object Exercise5 {
  /** How do you compute the average of an Array[Double]? */
  def func(a: Array[Int]): Double = {
    a.sum.toDouble / a.length
  }

  def test(a: Array[Int]): Unit = {
    println("Exercise 5:")
    println(s"Initial array: ${a.mkString("Array(", ", ", ")")}")
    println(s"Array after using function with for/yield: ${Exercise5.func(a)}")
    println("-------------------------------------------------")
  }
}
