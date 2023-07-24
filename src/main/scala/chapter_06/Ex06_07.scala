package ru.ivashkevich
package chapter_06

object Ex06_07 {
  /** 6. Write an enumeration describing the four playing card suits so that the toString
   *  method returns ♠, ♥, ♣, or ♦. */

  /** 7. Implement a function that checks whether a card suit value from the preceding
   *  exercise is red. */

  object CardSuit extends Enumeration {
    val spades = Value("♠")
    val heart = Value("♥")
    val clubs = Value("♣")
    val diamond = Value("♦")

    def isRed(v: CardSuit.Value): Boolean = v == heart || v == diamond
  }

  def test(v: CardSuit.Value): Unit = {
    println("Exercise 6:")
    println(v)
    println("-------------------------------------------------")
    println("Exercise 7:")
    println(CardSuit.isRed(v))
    println("-------------------------------------------------")
  }
}
