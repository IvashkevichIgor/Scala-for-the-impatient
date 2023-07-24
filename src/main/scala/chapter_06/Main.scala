package ru.ivashkevich
package chapter_06

object Main {
  def main(args: Array[String]): Unit = {
    Ex01.test(100)
    Ex02.test(200)
    Ex04.test(Ex04.Point(3,4))
    Ex06_07.test(Ex06_07.CardSuit.heart)
    Ex06_07.test(Ex06_07.CardSuit.spades)
    Ex08.test(Ex08.RGBCube.red)
  }
}
