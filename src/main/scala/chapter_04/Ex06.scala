package ru.ivashkevich
package chapter_04

import java.util.Calendar._
import scala.collection.mutable

object Ex06 {
  /** Define a linked hash map that maps "Monday" to java.util.Calendar.MONDAY, and
   * similarly for the other weekdays. Demonstrate that the elements are visited
   * in insertion order. */

  def func(): mutable.Map[String, Int] = {
    val daysOfWeek = mutable.LinkedHashMap[String, Int]()
    daysOfWeek += ("Monday" -> MONDAY)
    daysOfWeek += ("Tuesday" -> TUESDAY)
    daysOfWeek += ("Wednesday" -> WEDNESDAY)
    daysOfWeek += ("Thursday" -> THURSDAY)
    daysOfWeek += ("Friday" -> FRIDAY)
    daysOfWeek += ("Saturday" -> SATURDAY)
    daysOfWeek += ("Sunday" -> SUNDAY)
    daysOfWeek
  }

  def test(): Unit = {
    println("Exercise 6:")
    println(s"${func().mkString("\n", "\n", "")}")
    println("-------------------------------------------------")
  }

}
