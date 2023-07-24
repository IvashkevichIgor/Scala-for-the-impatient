package ru.ivashkevich
package chapter_05

object Main {
  def main(args: Array[String]): Unit = {
    new Ex01.Counter().test(Int.MaxValue)
    new Ex02.BankAccount().test(123456)
    Ex03.test(new Ex03.Time(11, 23), new Ex03.Time(11, 48))
    Ex03.test(new Ex03.Time(4, 20), new Ex03.Time(0, 12))
    Ex04.test(new Ex04.Time(5, 32), new Ex04.Time(11, 48))
    Ex05.test(new Ex05.Student("Igor", 123))
    Ex06.test(new Ex06.Person("Igor", -42))
    Ex07.test(new Ex07.Person("Igor Ivashkevich"))
  }
}
