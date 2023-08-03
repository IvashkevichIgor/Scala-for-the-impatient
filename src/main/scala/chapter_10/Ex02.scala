package ru.ivashkevich
package chapter_10

import java.awt.Point

object Ex02 extends App {
  /** Define a class OrderedPoint by mixing scala.math.Ordered[Point] into java.awt.Point.
   *  Use lexicographic ordering, i.e. (x, y) < (x’, y’) if x < x’ or x = x’ and y < y’. */

  class OrderedPoint(x: Int, y: Int) extends Point(x, y) with scala.math.Ordered[Point] {
    override def compare(that: Point): Int = {
      if (this.getX > that.getX) 1
      else if (this.getX < that.getX) -1
      else if (this.getY > that.getY) 1
      else if (this.getY < that.getY) -1
      else 0
    }

    override def toString = s"(x=${this.getX}, y=${this.getY})"
  }

  println("Exercise 2:")
  val p1 = new OrderedPoint(0, 0)
  val p2 = new OrderedPoint(0, 2)
  val p3 = new OrderedPoint(1, -3)
  val p4 = new OrderedPoint(1, 4)
  val p5 = new OrderedPoint(0, 2)
  val arr = Array(p1, p2, p3, p4, p5)
  println(s"Initial array: ${arr.mkString("Array(", ", ", ")")}")
  println(s"Sorted array: ${arr.sorted.mkString("Array(", ", ", ")")}")
  println("-------------------------------------------------")
}
