package ru.ivashkevich
package chapter_07

object Ex06_07 extends App {
  /** 6. Write a program that copies all elements from a Java hash map into a Scala
   *  hash map. Use imports to rename both classes. */

  /** 7. In the preceding exercise, move all imports into the innermost scope possible. */

  import java.util.{HashMap => JavaHashMap}
  import scala.collection.mutable.{HashMap => ScalaHashMap}

  test()

  def func[K, V](jMap: JavaHashMap[K, V]): ScalaHashMap[K, V] = {
    val sMap = new ScalaHashMap[K, V]
    jMap.forEach((k, v) => sMap.put(k, v))
    sMap
  }

  def test(): Unit = {
    val jMap = new JavaHashMap[String, String]()
    jMap.put("Russia", "Moscow")
    jMap.put("Ukraine", "Kiev")
    jMap.put("Belarus", "Minsk")
    jMap.put("Spain", "Madrid")
    val sMap = func[String, String](jMap)

    println("Exercise 6:")
    println(s"${sMap.mkString("Map(", ", ", ")")}")
    println("-------------------------------------------------")
  }

}
