package ru.ivashkevich
package chapter_3

import scala.collection.mutable.ArrayBuffer

object Main {
  def main(args: Array[String]): Unit = {
    Ex01.test(10)
    Ex02.test(Array(1, 2, 3, 4, 5, 8, 9))
    Ex03.test(Array(1, 2, 3, 4, 5, 8, 9))
    Ex04.test(Array(1, -2, -3, 4, -5, 8, 0, 9, 11, -11, 69))
    Ex05.test(Array(1, -2, -3, 4, -5, 8, 0, 9, 11, -11, 69))
    Ex06.test(Array(1, -2, -3, 4, -5, 8, 0, 9, 11, -11, 69))
    Ex07.test(Array(1, 1, -3, 4, -5, -3, 0, 9, 11, 11, 69))
    Ex08.test(ArrayBuffer(1, -2, -3, 4, -5, 8, 0, 9, 11, -11, 69))
    Ex09.test(ArrayBuffer(1, -2, -3, 4, -5, 8, 0, 9, 11, -11, 69))
    Ex09.test(ArrayBuffer(-1, -2, -3, -4, -5, -8, -10, -9, -11, -11, -69))
  }
}
