package ru.ivashkevich
package chapter_05

object Ex03 {
  /** Write a class Time with read-only properties hours and minutes and a method
   *  before(other: Time): Boolean that checks whether this time comes before the
   *  other. A Time object should be constructed as new Time(hrs, min), where hrs is in
   *  military time format (between 0 and 23). */

  class Time {
    private var _hrs: Int = 0
    private var _min: Int = 0

    def hrs: Int = _hrs
    def min: Int = _min

    def this(hrs: Int, min: Int) {
      this()
      if (hrs >= 0 && hrs <= 23) this._hrs = hrs
      if (min >= 0 && min <= 59) this._min = min
    }

    def before(other: Time): Boolean = {
      if (this.hrs != other.hrs) this.hrs < other.hrs
      else this.min < other.min
    }
  }

  def test(t1: Time, t2: Time): Unit = {
    println("Exercise 3:")
    println(s"Is ${t1.hrs}:${t1.min} before ${t2.hrs}:${t2.min}? - ${t1.before(t2)}")
    println("-------------------------------------------------")
  }

}
