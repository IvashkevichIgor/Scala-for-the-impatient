package ru.ivashkevich
package chapter_06

object Ex01 {
  /** Write an object Conversions with methods inchesToCentimeters, gallonsToLiters, and
   *  milesToKilometers. */

  object Conversions{
    def inchesToCentimeters(inches: Double): Double = inches * 2.54

    def gallonsToLiters(gallons: Double): Double = gallons * 3.785

    def milesToKilometers(miles: Double): Double = miles * 1.609
  }

  def test(v: Double): Unit = {
    println("Exercise 1:")
    println(s"$v inches equals ${Conversions.inchesToCentimeters(v)} centimeters")
    println(s"$v gallons equals ${Conversions.gallonsToLiters(v)} liters")
    println(s"$v miles equals ${Conversions.milesToKilometers(v)} kilometers")
    println("-------------------------------------------------")
  }
}
