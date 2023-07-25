package ru.ivashkevich
package chapter_08

object Ex07 extends App {
  /** Provide a class Square that extends java.awt.Rectangle and has three constructors:
   *  one that constructs a square with a given corner point and width, one
   *  that constructs a square with corner (0, 0) and a given width, and one that
   *  constructs a square with corner (0, 0) and width 0. */

  test()

  import Ex05.Point

  class Square(val point: Point = new Point(0,0), width: Int) extends java.awt.Rectangle(width, width) {
    def this(w: Int) = this(width = w)
    def this() = this(0)

    override def toString = s"Square(point=$point, width=$width)"
  }

  def test(): Unit = {
    println("Exercise 7:")
    println(new Square())
    println(new Square(3))
    println(new Square(new Point(1, 1), 3))
    println("-------------------------------------------------")
  }

}
