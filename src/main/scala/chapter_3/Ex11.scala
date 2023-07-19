package ru.ivashkevich
package chapter_3

import java.awt.datatransfer._
import scala.collection.mutable

object Ex11 {
  /** Import java.awt.datatransfer._ and make an object of type SystemFlavorMap with
   * the call
   * val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
   * Then call the getNativesForFlavor method with parameter DataFlavor.imageFlavor
   * and get the return value as a Scala buffer. (Why this obscure class? It’s hard
   * to find uses of java.util.List in the standard Java library.) */
  def func(): mutable.Buffer[AnyRef] = {
    SystemFlavorMap
      .getDefaultFlavorMap
      .asInstanceOf[SystemFlavorMap]
      .getNativesForFlavor(DataFlavor.imageFlavor)
      .toArray()
      .toBuffer
  }

  def test(): Unit = {
    println("Exercise 11:")
    println(s"${Ex11.func().mkString("Buffer(", ", ", ")")}")
    println("-------------------------------------------------")
  }
}
