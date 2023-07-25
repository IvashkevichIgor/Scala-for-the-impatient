package ru.ivashkevich
package chapter_08

object Ex06 {
  /** Define an abstract class Shape with an abstract method centerPoint and subclasses
   *  Rectangle and Circle. Provide appropriate constructors for the subclasses and
   *  override the centerPoint method in each subclass. */

  import Ex05.Point

  abstract class Shape {
    def centerPoint: Point
  }

  class Rectangle(val a: Point = new Point(0,0), val length: Double, val width: Double) extends Shape {
    override def centerPoint: Point = new Point(a.x + length / 2,  a.y + width / 2)
  }

  class Circle(override val centerPoint: Point = new Point(0, 0), val radius: Double) extends Shape {
  }

}
