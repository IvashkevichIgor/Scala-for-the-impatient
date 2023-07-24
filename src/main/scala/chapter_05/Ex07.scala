package ru.ivashkevich
package chapter_05

object Ex07 {
  /** Write a class Person with a primary constructor that accepts a string containing
   *  a first name, a space, and a last name, such as new Person("Fred Smith"). Supply
   *  read-only properties firstName and lastName. Should the primary constructor
   *  parameter be a var, a val, or a plain parameter? Why? */

  class Person(fullName: String){
    val firstName = fullName.split(" ")(0)
    val lastName = fullName.split(" ")(1)
  }

  def test(person: Person): Unit = {
    println("Exercise 7:")
    println(s"Person's first name is ${person.firstName}, last name is ${person.lastName}")
    println("-------------------------------------------------")
  }
}
