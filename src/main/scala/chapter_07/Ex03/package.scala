package ru.ivashkevich
package chapter_07

package object Ex03 {
  /** Write a package random with functions nextInt(): Int, nextDouble(): Double,
   * and setSeed(seed: Int): Unit. To generate random numbers, use the linear
   * congruential generator
   * next = (previous × a + b) mod 2^n,
   * where a = 1664525, b = 1013904223, n = 32, and the initial value of previous
   * is seed. */

  var seed: Double = 0
  val a = 1664525
  val b = 1013904223
  val n = 32

  def setSeed(seed: Int): Unit = this.seed = seed

  def nextInt(): Int = {
    val next = ((seed * a + b) % math.pow(2, n)).toInt
    seed = next
    next
  }

  def nextDouble(): Double = {
    val next = (seed * a + b) % math.pow(2, n)
    seed = next
    next
  }
}
