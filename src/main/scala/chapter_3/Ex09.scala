package ru.ivashkevich
package chapter_3

import scala.collection.mutable.ArrayBuffer

object Ex09 {
  /** Improve the solution of the preceding exercise by collecting the positions
   *  that should be moved and their target positions. Make those moves and
   *  truncate the buffer. Don’t copy any elements before the first unwanted
   *  element. */
  def func(a: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    val positionsToBeMove = new ArrayBuffer[Int]()
    val targetPositions = new ArrayBuffer[Int]()
    var isFirstNegative = true
    var negativeCount = 0
    for (i <- a.indices) {
      if (a(i) < 0) {
        if (isFirstNegative) isFirstNegative = false
        else negativeCount += 1
      }
      else if(negativeCount > 0){
        positionsToBeMove += i
        targetPositions += i - negativeCount
      }
    }
    for (i <- positionsToBeMove.indices){
      a(targetPositions(i)) = a(positionsToBeMove(i))
    }
    a.dropRight(negativeCount)
  }

  def test(a: ArrayBuffer[Int]): Unit = {
    println("Exercise 9:")
    println(s"Initial array buffer: ${a.mkString("ArrayBuffer(", ", ", ")")}")
    println(s"After using function: ${Ex09.func(a).mkString("ArrayBuffer(", ", ", ")")}")
    println("-------------------------------------------------")
  }
}
