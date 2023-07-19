package ru.ivashkevich
package chapter_3

object Ex03 {
  /** Repeat the preceding assignment, but produce a new array with the swapped
   *  values. Use for/yield. */
  def func(a: Array[Int]): Array[Int] = {
    (for (i <- a.indices) yield {
      if (i % 2 == 0) {if ((i + 1) == a.length) a(i)
                       else a(i + 1)}
      else a(i - 1)
    }).toArray
  }

  def test(a: Array[Int]): Unit = {
    println("Exercise 3:")
    println(s"Initial array: ${a.mkString("Array(", ", ", ")")}")
    println(s"Array after using function with for/yield: ${Ex03.func(a).mkString("Array(", ", ", ")")}")
    println("-------------------------------------------------")
  }
}
