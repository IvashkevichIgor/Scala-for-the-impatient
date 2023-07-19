package ru.ivashkevich
package chapter_3

import scala.collection.mutable.ArrayBuffer

object Ex10 {
  /** Make a collection of all time zones returned by java.util.TimeZone.getAvailableIDs
   *  that are in America. Strip off the "America/" prefix and sort the result. */
  def func(): ArrayBuffer[String] = {
    java.util.TimeZone.getAvailableIDs
      .filter(s => s.startsWith("America/"))
      .map(s => s.drop(8))
      .sorted
      .to(ArrayBuffer)
  }

  def test(): Unit = {
    println("Exercise 10:")
    println(s"Collection of all time zones: ${Ex10.func().mkString("ArrayBuffer(", ", ", ")")}")
    println("-------------------------------------------------")
  }

}
