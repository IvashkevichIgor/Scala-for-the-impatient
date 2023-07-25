package ru.ivashkevich
package chapter_08

object Ex05 extends App {
  /** Design a class Point whose x and y coordinate values can be provided in a
   *  constructor. Provide a subclass LabeledPoint whose constructor takes a label
   *  value and x and y coordinates, such as
   *  new LabeledPoint("Black Thursday", 1929, 230.07) */

  test()

  class Point(val x: Double, val y: Double){
    override def toString = s"Point(x=$x, y=$y)"
  }

  class LabeledPoint(val label: String, x: Double, y: Double) extends Point(x, y){

  }

  def test(): Unit = {
    println(new LabeledPoint("Black Thursday", 1929, 230.07))
  }
}
