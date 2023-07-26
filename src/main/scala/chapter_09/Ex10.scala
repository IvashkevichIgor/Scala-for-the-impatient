package ru.ivashkevich
package chapter_09

import java.io._
import scala.collection.mutable

object Ex10 extends App {
  /** Expand the example in Section 9.8, “Serialization,” on page 113. Construct a
   *  few Person objects, make some of them friends of others, and save an
   *  Array[Person] to a file. Read the array back in and verify that the friend relations
   *  are intact. */

  func(new java.io.File("C:\\Java\\projects\\scala_for_the_impatient\\src\\files\\chapter_09\\ex10.txt"))

  @SerialVersionUID(42L) class Person(val name: String) extends Serializable{
    var friends: mutable.HashSet[Person] = new mutable.HashSet[Person]()

    def addFriend(friend: Person): Unit = {
      this.friends += friend
      friend.friends += this
    }

    override def toString = s"Person(friends = ${friends.map(f => f.name).mkString(", ")}, name = $name)"
  }

  def func(file: File): Unit = {
    val igor = new Person("Igor")
    val dima = new Person("Dima")
    val kirill = new Person("Kirill")

    igor.addFriend(dima)
    dima.addFriend(igor)
    dima.addFriend(kirill)

    println("Before serialization:")
    println(igor)
    println(dima)
    println(kirill)
    println("-------------------------------------------------")

    val out = new ObjectOutputStream(new FileOutputStream(file))
    out.writeObject(List(igor, dima, kirill))
    out.close()

    val in = new ObjectInputStream(new FileInputStream(file))
    val people = in.readObject().asInstanceOf[List[Person]]
    println("After deserialization:")
    for (p <- people) println(p)
  }
}
