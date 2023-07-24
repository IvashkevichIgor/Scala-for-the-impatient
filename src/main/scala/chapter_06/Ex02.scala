package ru.ivashkevich
package chapter_06

object Ex02 {
  /** The preceding problem wasn’t very object-oriented. Provide a general superclass
   *  UnitConversion and define objects InchesToCentimeters, GallonsToLiters, and
   *  MilesToKilometers that extend it. */

  class UnitConversion(val factor: Double) {
     def apply(value: Double): Double = value * factor
  }

  object InchesToCentimeters extends UnitConversion(2.54)

  object GallonsToLiters extends UnitConversion(3.785)

  object MilesToKilometers extends UnitConversion(1.609)

  def test(v: Double): Unit = {
    println("Exercise 2:")
    println(s"$v inches equals ${InchesToCentimeters(v)} centimeters")
    println(s"$v gallons equals ${GallonsToLiters(v)} liters")
    println(s"$v miles equals ${MilesToKilometers(v)} kilometers")
    println("-------------------------------------------------")
  }
}
