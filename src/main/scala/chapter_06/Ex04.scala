package ru.ivashkevich
package chapter_06

object Ex04 {
  /** Define a Point class with a companion object so that you can construct Point
   *  instances as Point(3, 4), without using new. */

  class Point(val x: Int, val y: Int) {
    override def toString = s"Point($x, $y)"
  }

  object Point {
    def apply(x: Int, y: Int): Point = new Point(x, y)
  }

  def test(point: Point): Unit = {
    println("Exercise 4:")
    println(point)
    println("-------------------------------------------------")
  }

}
