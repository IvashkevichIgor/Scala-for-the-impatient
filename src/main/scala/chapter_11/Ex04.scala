package ru.ivashkevich
package chapter_11

import scala.math.abs

object Ex04 extends App {
  /** Implement a class Money with fields for dollars and cents. Supply +, - operators
   *  as well as comparison operators == and <. For example, Money(1, 75) + Money(0,
   *  50) == Money(2, 25) should be true. Should you also supply * and / operators?
   *  Why or why not? */

  class Money(d: Int, c: Int) {
    private val dollar: Int = {
      if ((c > 0) || ((c < 0) && (d <= 0))) d + c / 100
      else d - 1 + c / 100
    }

    private val cent: Int = {
      if ((c > 0) || ((c < 0) && (d <= 0)))  abs(c % 100)
      else 100 + c
    }

    override def toString = s"$dollar.$cent"

    def +(other: Money): Money = new Money(this.dollar + other.dollar, this.cent + other.cent)
    def -(other: Money): Money = {
      val d = this.dollar - other.dollar
      val c = if (this.dollar >= 0) this.cent - other.cent else (this.cent + other.cent) * (-1)
      new Money(d, c)
    }

    def ==(other: Money): Boolean = {
      if (this.dollar != other.dollar) false
      else this.cent == other.cent
    }

    def >(other: Money): Boolean = {
      if (this.dollar != other.dollar) this.dollar > other.dollar
      else this.cent > other.cent
    }
  }

  println("Exercise 4:")
  val m1: Money = new Money(1, 75)
  val m2: Money = new Money(0, 50)
  val m3: Money = new Money(1, 25)
  val m4: Money = new Money(1, 25)
  val m5: Money = new Money(-1, 25)
  println(s"$m1 + $m2 = ${m1 + m2}")
  println(s"$m1 - $m2 = ${m1 - m2}")
  println(s"$m3 - $m2 = ${m3 - m2}")
  println(s"$m2 - $m1 = ${m2 - m1}")
  println(s"$m5 - $m1 = ${m5 - m1}")
  println(s"${m3 > m2}")
  println(s"${m2 > m3}")
  println(s"${m3 == m2}")
  println(s"${m3 == m4}")
  println(new Money(1, 75) + new Money(0, 50) == new Money(2, 25))
  println("-------------------------------------------------")
}
