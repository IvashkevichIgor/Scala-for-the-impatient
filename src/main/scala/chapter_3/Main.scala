package ru.ivashkevich
package chapter_3

object Main {
  def main(args: Array[String]): Unit = {
    Exercise1.test(10)
    Exercise2.test(Array(1, 2, 3, 4, 5, 8, 9))
    Exercise3.test(Array(1, 2, 3, 4, 5, 8, 9))
    Exercise4.test(Array(1, -2, -3, 4, -5, 8, 0, 9, 11, -11, 69))
    Exercise5.test(Array(1, -2, -3, 4, -5, 8, 0, 9, 11, -11, 69))
    Exercise6.test(Array(1, -2, -3, 4, -5, 8, 0, 9, 11, -11, 69))
    Exercise7.test(Array(1, 1, -3, 4, -5, -3, 0, 9, 11, 11, 69))

  }
}
