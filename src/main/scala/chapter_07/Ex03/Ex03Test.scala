package ru.ivashkevich
package chapter_07.Ex03

object Ex03Test extends App {
  println("Exercise 3:")
  setSeed(42)
  println(s"The seed is $seed")
  println(s"Next Int value is ${nextInt()}")
  println(s"Next Double value is ${nextDouble()}")
  println(s"Next Int value is ${nextInt()}")
  println("-------------------------------------------------")
}
