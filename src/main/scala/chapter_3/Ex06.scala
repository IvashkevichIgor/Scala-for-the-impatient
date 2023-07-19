package ru.ivashkevich
package chapter_3

import scala.collection.mutable.ArrayBuffer

object Ex06 {
  /** How do you rearrange the elements of an Array[Int] so that they appear in
   *  reverse sorted order? How do you do the same with an ArrayBuffer[Int]? */
  def func1(a: Array[Int]): Array[Int] = {
    a.sorted.reverse
  }

  def func2(a: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    a.sorted.reverse
  }

  def test(a: Array[Int]): Unit = {
    println("Exercise 6:")
    println(s"Initial array: ${a.mkString("Array(", ", ", ")")}")
    println(s"After using function: ${Ex06.func1(a).mkString("Array(", ", ", ")")}")
    println(s"Initial ArrayBuffer: ${a.toBuffer.mkString("Array(", ", ", ")")}")
    println(s"After using function: ${Ex06.func2(a.to(ArrayBuffer)).mkString("ArrayBuffer(", ", ", ")")}")
    println("-------------------------------------------------")
  }
}
