package ru.ivashkevich
package chapter_04

import scala.collection.mutable
import scala.jdk.CollectionConverters._

object Ex07 {
  /** Print a table of all Java properties reported by the getProperties method of the
   * java.lang.System class, like this:
   * java.runtime.name     | Java(TM) SE Runtime Environment
   * sun.boot.library.path | /home/apps/jdk1.6.0_21/jre/lib/i386
   * java.vm.version       | 17.0-b16
   * java.vm.vendor        | Sun Microsystems Inc.
   * java.vendor.url       | http://java.sun.com/
   * path.separator        | :
   * java.vm.name          | Java HotSpot(TM) Server VM
   * You need to find the length of the longest key before you can print the table. */

  def func(): mutable.Map[String, String] = {
    val properties = java.lang.System.getProperties.asScala
    var maxLength = 0
    for ((k, _) <- properties) {
      if (k.length > maxLength) maxLength = k.length
    }
    for ((k, v) <- properties) yield (k + " " * (maxLength - k.length), v)
  }

  def test(): Unit = {
    println("Exercise 7:")
    for ((k, v) <- func()){
      println(s"$k| $v")
    }
    println("-------------------------------------------------")
  }

}
