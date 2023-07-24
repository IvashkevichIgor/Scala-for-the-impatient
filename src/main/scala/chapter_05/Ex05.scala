package ru.ivashkevich
package chapter_05

import scala.beans.BeanProperty

object Ex05 {
  /** Make a class Student with read-write JavaBeans properties name (of type String)
   *  and id (of type Long). What methods are generated? (Use javap to check.) Can
   *  you call the JavaBeans getters and setters in Scala? Should you? */

  class Student(@BeanProperty var name: String,
               @BeanProperty var id: Long){

  }

  def test(student: Student): Unit = {
    println("Exercise 5:")
    println(s"${student.getName()} has id ${student.getId()}")
    println("-------------------------------------------------")
  }
}
