package ru.ivashkevich
package chapter_05

object Main {
  def main(args: Array[String]): Unit = {
    new Ex01.Counter().test(Int.MaxValue)
    new Ex02.BankAccount().test(123456)
  }
}
