package ru.ivashkevich
package chapter_03

import scala.collection.mutable.ArrayBuffer

object Ex08 {
  /** Suppose you are given an array buffer of integers and want to remove all but
   *  the first negative number. Here is a sequential solution that sets a flag
   *  when the first negative number is called, then removes all elements beyond.
   *  var first = true
   *  var n = a.length
   *  var i = 0
   *  while (i < n) {
   *  if (a(i) >= 0) i += 1
   *  else {
   *  if (first) { first = false; i += 1 }
   *  else { a.remove(i); n -= 1 }
   *  }
   *  }
   *  This is a complex and inefficient solution. Rewrite it in Scala by collecting
   *  positions of the negative elements, dropping the first element, reversing the
   *  sequence, and calling a.remove(i) for each index. */
  def func(a: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    val positionsToRemove = (for(i <- a.indices if a(i) < 0) yield i).drop(1).reverse
    for (i <- positionsToRemove) a.remove(i)
    a
  }

  def test(a: ArrayBuffer[Int]): Unit = {
    println("Exercise 8:")
    println(s"Initial array buffer: ${a.mkString("ArrayBuffer(", ", ", ")")}")
    println(s"After using function: ${Ex08.func(a).mkString("ArrayBuffer(", ", ", ")")}")
    println("-------------------------------------------------")
  }
}
