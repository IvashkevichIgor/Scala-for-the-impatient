package ru.ivashkevich
package chapter_05

object Ex04 {
  /** Reimplement the Time class from the preceding exercise so that the internal
   *  representation is the number of minutes since midnight (between 0 and 24 ×
   *  60 – 1). Do not change the public interface. That is, client code should be
   *  unaffected by your change. */

  class Time {
    private var _min: Int = 0

    def hrs: Int = _min / 60

    def min: Int = _min % 60

    def this(hrs: Int, min: Int) {
      this()
      if (min >= 0 && min <= 24 * 60 -1) this._min = hrs * 60 + min
    }

    def before(other: Time): Boolean = {
      this._min < other._min
    }
  }

  def test(t1: Time, t2: Time): Unit = {
    println("Exercise 4:")
    println(s"Is ${t1.hrs}:${t1.min} before ${t2.hrs}:${t2.min}? - ${t1.before(t2)}")
    println("-------------------------------------------------")
  }

}
