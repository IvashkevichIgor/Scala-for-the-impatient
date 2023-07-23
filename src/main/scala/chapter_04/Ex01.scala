package ru.ivashkevich
package chapter_04

import chapter_03.Ex01


object Ex01 {
  /** Set up a map of prices for a number of gizmos that you covet. Then produce a second map with
   * the same keys and the prices at a 10 percent discount. */

  def func(map: Map[String, Double]): Map[String, Double] = {
    for ((k, v) <- map) yield (k, v * 0.9)
  }

  def test(map: Map[String, Double]): Unit = {
    println("Exercise 1:")
    println(s"Initial map: ${map.mkString("Map(", ", ", ")")}")
    println(s"Map with 10% discount prices: ${Ex01.func(map).mkString("Map(", ", ", ")")}")
    println("-------------------------------------------------")
  }
}
