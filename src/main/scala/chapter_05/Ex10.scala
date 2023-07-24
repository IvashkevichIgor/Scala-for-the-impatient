package ru.ivashkevich
package chapter_05

object Ex10 {
  /** Consider the class
   *  class Employee(val name: String, var salary: Double) {
   *    def this() { this("John Q. Public", 0.0) }
   *  }
   *  Rewrite it to use explicit fields and a default primary constructor. Which form
   *  do you prefer? Why? */

  class Employee {
    private var _name: String = "John Q. Public"
    var salary: Double = 0

    def name = _name

    def this(name: String, salary: Double) {
      this()
      this._name = name
      this.salary = salary
    }
  }

}
