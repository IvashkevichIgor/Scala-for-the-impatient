package ru.ivashkevich
package chapter_10

object Ex01 extends App {
  /** The java.awt.Rectangle class has useful methods translate and grow that are unfortunately
   *  absent from classes such as java.awt.geom.Ellipse2D. In Scala, you
   *  can fix this problem. Define a trait RectangleLike with concrete methods translate
   *  and grow. Provide any abstract methods that you need for the implementation,
   *  so that you can mix in the trait like this:
   *  val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
   *  egg.translate(10, -10)
   *  egg.grow(10, 20) */

  trait RectangleLike {
    this: java.awt.geom.RectangularShape =>
    def grow(h: Int, v: Int): Unit = {
      this.setFrame(this.getX - h, this.getY + v, this.getWidth + 2 * h, this.getHeight + 2 * v)
    }
    def translate(dx: Int, dy: Int): Unit = {
      this.setFrame(this.getX + dx, this.getY + dy, this.getWidth, this.getHeight)
    }
  }

  val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
  println("Exercise 1:")
  println(s"Initial point is (${egg.getX}, ${egg.getY}), width = ${egg.getWidth}, height = ${egg.getHeight}")
  egg.translate(10, -10)
  println(s"Point after translate(10, -10) method is (${egg.getX}, ${egg.getY}), width = ${egg.getWidth}, height = ${egg.getHeight}")
  egg.grow(10, 20)
  println(s"Point after grow(10, 20) method is (${egg.getX}, ${egg.getY}), width = ${egg.getWidth}, height = ${egg.getHeight}")
  println("-------------------------------------------------")
}
