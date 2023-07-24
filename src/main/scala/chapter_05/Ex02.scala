package ru.ivashkevich
package chapter_05

object Ex02 {
  /** Write a class BankAccount with methods deposit and withdraw, and a read-only
   *  property balance. */

  class BankAccount(){
    private var privateBalance: BigInt = 0

    def balance: BigInt = privateBalance

    def deposit(v: BigInt): Unit = {
      privateBalance += v
    }

    def withdraw(v: BigInt): Unit = {
      privateBalance -= v
    }

    def test(v: BigInt): Unit = {
      println("Exercise 2:")
      deposit(v)
      println(s"Value after deposit: $balance")
      withdraw(v)
      println(s"Value after withdraw: $balance")
      println("-------------------------------------------------")
    }
  }
}
