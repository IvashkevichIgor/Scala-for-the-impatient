package ru.ivashkevich
package chapter_08

object Ex01 extends App {
  /** Extend the following BankAccount class to a CheckingAccount class that charges $1
   *  for every deposit and withdrawal. */

  test()

  class BankAccount(initialBalance: Double) {
    private var balance = initialBalance

    def currentBalance = balance

    def deposit(amount: Double) = {
      balance += amount; balance
    }

    def withdraw(amount: Double) = {
      balance -= amount; balance
    }
  }

  class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
    var balance: Double = initialBalance
    override def deposit(amount: Double): Double = super.deposit(amount - 1)

    override def withdraw(amount: Double): Double = super.withdraw(amount + 1)
  }

  def test():Unit = {
    println("Exercise 1:")
    val acc = new CheckingAccount(1000)
    println(s"Initial balance is ${acc.currentBalance}")
    println(s"Deposit 500, balance is ${acc.deposit(500)}")
    println(s"Withdraw 500, balance is ${acc.withdraw(500)}")
    println("-------------------------------------------------")
  }
}
