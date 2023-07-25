package ru.ivashkevich
package chapter_08

import scala.collection.mutable.ArrayBuffer

object Ex04 extends App {
  /** Define an abstract class Item with methods price and description. A SimpleItem is
   *  an item whose price and description are specified in the constructor. Take
   *  advantage of the fact that a val can override a def. A Bundle is an item that
   *  contains other items. Its price is the sum of the prices in the bundle. Also
   *  provide a mechanism for adding items to the bundle and a suitable description
   *  method. */

  test()

  abstract class Item {
    def price: Double
    def description: String
  }

  class SimpleItem(override val price: Double, override val description: String) extends Item {

  }

  class Bundle(val items: ArrayBuffer[Item]) extends Item {
    override def price: Double = items.map(x => x.price).sum

    override def description: String = items.map(x => x.description).mkString(", ")

    def add(item: Item): Unit = items += item
  }

  def test(): Unit = {
    println("Exercise 4:")
    val i1 = new SimpleItem(1.5, "gum")
    val i2 = new SimpleItem(750, "gun")
    val i3 = new SimpleItem(7.5, "fish")
    val bundle = new Bundle(ArrayBuffer(i1, i2, i3))
    println(s"Price is ${bundle.price}")
    println(s"Description is ${bundle.description}")
    println("-------------------------------------------------")
  }
}
