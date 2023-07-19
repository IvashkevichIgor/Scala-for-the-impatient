package ru.ivashkevich
package chapter_3

import scala.util.Random

object Ex01 {
  /** Write a code snippet that sets a to an array of n random integers between 0
   *  (inclusive) and n (exclusive). */
  def func(n: Int): Array[Int] = {
    val array = new Array[Int](n)
    for(_ <- array) yield Random.between(0, n)
  }

  def test(n: Int) : Unit = {
    println("Exercise 1:")
    println(s"Getting array of $n random integers between 0 and $n:")
    println(s"${Ex01.func(n).mkString("Array(", ", ", ")")}")
    println("-------------------------------------------------")
  }
}
