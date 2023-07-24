package ru.ivashkevich
package chapter_05

object Ex06 {
  /** In the Person class of Section 5.1, “Simple Classes and Parameterless Methods,”
   *  on page 55, provide a primary constructor that turns negative ages to 0. */

  class Person(var name: String = "", var age: Int = 0) {
    if (age < 0) age = 0
  }

  def test(person: Person): Unit = {
    println("Exercise 6:")
    println(s"Person's age is ${person.age}")
    println("-------------------------------------------------")
  }
}
