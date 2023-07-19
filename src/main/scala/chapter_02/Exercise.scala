package ru.ivashkevich
package chapter_02

import java.time.LocalDate
import scala.annotation.tailrec

object Exercise {
  def main(args: Array[String]): Unit ={
    /** 1. The signum of a number is 1 if the number is positive, –1 if it is negative,
     * and 0 if it is zero. Write a function that computes this value. */
    def signum(i: Int): Int = {
      if (i > 0) 1
      else if (i < 0) -1
      else 0
    }
    println("Exercise 1:")
    println("Signum function with positive argument: " + signum(100))
    println("Signum function with negative argument: " + signum(-100))
    println("Signum function with zero as argument: " + signum(0))
    println("-------------------------------------------------")

    /** 2. What is the value of an empty block expression {}? What is its type? */
    println("Exercise 2:")
    println("Empty block {} class is " + {}.getClass)  // void
    println("-------------------------------------------------")

    /** 3. Come up with one situation where the assignment x = y = 1 is valid in Scala.
     *  (Hint: Pick a suitable type for x.) */
    val x: Unit = {val y = 1}
    println("Exercise 3:")
    println(s"Assigning x = y = 1, x has Unit type: $x")
    println("-------------------------------------------------")

    /** 4. Write a Scala equivalent for the Java loop
     *  for (int i = 10; i >= 0; i--) System.out.println(i); */
    println("Exercise 4:")
    for (i <- (0 to 10).reverse) println(i)
    println("-------------------------------------------------")

    /** 5. Write a procedure countdown(n: Int) that prints the numbers from n to 0. */
    def countDown(n: Int): Unit = {
      for (i <- (0 to n).reverse) println(i)
    }
    println("Exercise 5:")
    countDown(4)
    println("-------------------------------------------------")

    /** 6. Write a for loop for computing the product of the Unicode codes of all letters
     *  in a string. For example, the product of the characters in "Hello" is 9415087488L. */
    def product(s: String): Long = {
      var x: Long = 1
      for (ch <- s) x *= ch.toInt
      x
    }
    println("Exercise 6:")
    val word = "Hello"
    println(s"Product from word \"$word\" is ${product(word)}")
    println("-------------------------------------------------")

    /** 7. Solve the preceding exercise without writing a loop.
     * (Hint: Look at the StringOps Scaladoc.) */
    println("Exercise 7:")
    println(s"Product from word \"$word\" is ${word.map(_.toLong).product}")
    println("-------------------------------------------------")

    /** 8. Write a function product(s : String) that computes the product, as described
     *  in the preceding exercises. */
    // Done in ex. 6

    /** 9. Make the function of the preceding exercise a recursive function. */
    @tailrec
    def recursiveProduct(s: String, acc: Long = 1L): Long = {
      if(s.isEmpty) acc
      else recursiveProduct(s.drop(1), acc * s.charAt(0).toInt)
    }

    println("Exercise 9:")
    println(s"Product from word \"$word\" is ${recursiveProduct(word)} (using recursive function)")
    println("-------------------------------------------------")

    /** 10. Write a function that computes x^n (x to the power of n), where n is an integer.
     * Use the following recursive definition:
     *  • x^n = y * y if n is even and positive, where y = x^(n / 2).
     *  • x^n = x * x^(n – 1) if n is odd and positive.
     *  • x^0 = 1.
     *  • x^n = 1 / x^n if n is negative.
     *  Don’t use a return statement. */

    def power(x: Int, n: Int): BigDecimal ={
      @tailrec
      def loop(base: Int = x, power: Int = n, acc: BigDecimal = 1): BigDecimal = {
        if(power == 0) acc
        else loop(x, power-1, acc * base)
      }

      if (n >= 0) loop()
      else 1 / loop(power = (-1) * n)
    }

    println("Exercise 10:")
    println(s"2^3 = ${power(2, 3)}")
    println(s"2^64 = ${power(2, 64)}")
    println(s"2^0 = ${power(2, 0)}")
    println(s"2^(-1) = ${power(2, -1)}")
    println(s"2^(-32) = ${power(2, -32)}")
    println("-------------------------------------------------")

    println("Exercise 11:")
    val year = 1990
    val month = 2
    val day = 27
    println("input: (date\"$year-$month-$day\")")
    print("Class is: ")
    println((date"$year-$month-$day").getClass)
    println("-------------------------------------------------")
  }

  /** 11. Define a string interpolator date so that you can define a java.time.LocalDate as
   * date"$year-$month-$day". You need to define an “implicit” class with a date method,
   * like this:
   * implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
   * def date(args: Any*): LocalDate = . . .
   * }
   * args(i) is the value of the ith expression. Convert each to a string and then to
   * an integer, and pass them to the LocalDate.of method. If you already know
   * some Scala, add error handling. Throw an exception if there aren’t three
   * arguments, or if they aren’t integers, or if they aren’t separated by dashes.
   * (You get the strings in between the expressions as sc.parts.) */

  implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
    def date(args: Any*): LocalDate = {
      if (args.length != 3) throw new IllegalArgumentException(s"Wrong number of arguments in method, required - 3, got - ${args.length}")
      LocalDate.of(args(0).toString.toInt, args(1).toString.toInt, args(2).toString.toInt)
    }
  }
}
