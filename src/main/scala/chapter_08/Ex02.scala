package ru.ivashkevich
package chapter_08

object Ex02 extends App {
  /** Extend the BankAccount class of the preceding exercise into a class SavingsAccount
   *  that earns interest every month (when a method earnMonthlyInterest is called)
   *  and has three free deposits or withdrawals every month. Reset the transaction
   *  count in the earnMonthlyInterest method. */

  test()

  class SavingsAccount(initialBalance: Double, val interest: Double, val charge: Int) extends Ex01.BankAccount(initialBalance){
    if (interest < 0 || interest > 100) throw new IllegalArgumentException("Interest must be between 0 and 100%")
    if (charge < 0) throw new IllegalArgumentException("Charge can't be negative")

    private var transactionCount: Int = 0
    private val maxFreeTransactions: Int = 3

    override def deposit(amount: Double): Double = {
      transactionCount += 1
      super.deposit(amount -
        (if (transactionCount > maxFreeTransactions) charge
        else 0))
    }

    override def withdraw(amount: Double): Double = {
      transactionCount += 1
      super.withdraw(amount +
        (if (transactionCount > maxFreeTransactions) charge
        else 0))
    }

    def earnMonthlyInterest(): Double = {
      super.deposit(currentBalance * (interest / 100 / 12))
      transactionCount = 0
      currentBalance
    }
  }

  def test(): Unit = {
    println("Exercise 2:")
    val acc = new SavingsAccount(1000, 12, 5)
    println(s"Initial balance is ${acc.currentBalance}, interest is ${acc.interest} %, charge after third transaction is ${acc.charge}")
    println(s"Deposit 500, balance is ${acc.deposit(500)}")
    println(s"Deposit 700, balance is ${acc.deposit(700)}")
    println(s"Withdraw 500, balance is ${acc.withdraw(500)}")
    println(s"Withdraw 200, balance is ${acc.withdraw(200)}")
    println(s"Withdraw 100, balance is ${acc.withdraw(100)}")
    println(acc.currentBalance)
    println(s"Earning month interest, balance is ${acc.earnMonthlyInterest()}")
    println("-------------------------------------------------")
  }
}
