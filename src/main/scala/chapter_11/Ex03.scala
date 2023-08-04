package ru.ivashkevich
package chapter_11

import scala.math.abs

object Ex03 extends App {
  /** Implement the Fraction class with operations + - * /. Normalize fractions, for
   *  example, turning 15/–6 into –5/2. Divide by the greatest common divisor,
   *  like this:
   *  class Fraction(n: Int, d: Int) {
   *    private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d);
   *    private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d);
   *    override def toString = s"$num/$den"
   *    def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
   *    def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a % b)
   *  ...
   *  } */

  class Fraction(n: Int, d: Int) {
    private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d);
    private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d);

    override def toString = s"$num/$den"


    def sign(a: Int): Int = if (a > 0) 1 else if (a < 0) -1 else 0

    def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a % b)

    def +(other: Fraction): Fraction = {
      val n = this.num * other.den + other.num * this.den
      val d = this.den * other.den
      new Fraction(n, d)
    }

    def -(other: Fraction): Fraction = {
      val n = this.num * other.den - other.num * this.den
      val d = this.den * other.den
      new Fraction(n, d)
    }

    def *(other: Fraction): Fraction = {
      val n = this.num * other.num
      val d = this.den * other.den
      new Fraction(n, d)
    }

    def /(other: Fraction): Fraction = {
      val n = this.num * other.den
      val d = this.den * other.num
      new Fraction(n, d)
    }
  }

  println("Exercise 3:")
  val f1: Fraction = new Fraction(1, 4)
  val f2: Fraction = new Fraction(3, 8)
  println(s"$f1 + $f2 = ${f1 + f2}")
  println(s"$f1 - $f2 = ${f1 - f2}")
  println(s"$f1 * $f2 = ${f1 * f2}")
  println(s"$f1 / $f2 = ${f1 / f2}")
  println("-------------------------------------------------")
}
