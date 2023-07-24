package ru.ivashkevich
package chapter_05

object Ex01 {
  /** Improve the Counter class in Section 5.1, “Simple Classes and Parameterless
   *  Methods,” on page 55 so that it doesn’t turn negative at Int.MaxValue. */

  class Counter {
    private var value: BigInt = 0 // You must initialize the field

    def increment() = {
      value += 1
    } // Methods are public by default

    def current() = value

    def test(v: BigInt): Unit = {
      value = v
      increment()
      println("Exercise 1:")
      println(s"Value after increment: ${current()}")
      println("-------------------------------------------------")
    }
  }

}
