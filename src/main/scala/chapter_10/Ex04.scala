package ru.ivashkevich
package chapter_10

object Ex04 extends App {
  /** Provide a CryptoLogger trait that encrypts the log messages with the Caesar cipher.
   *  The key should be 3 by default, but it should be overridable by the user.
   *  Provide usage examples with the default key and a key of –3. */

  trait CryptoLogger {
    var key = 3
    def encrypt(msg: String): String = {
      msg.toUpperCase
        .toCharArray
        .map(c => if (c != 32) c + key else c)
        .map(c => (if (c > 90) c - 90 + 64 else c).toChar)
        .mkString
    }
  }

  class SomeLogger extends CryptoLogger

  val logger = new SomeLogger
  logger.key = 6

  println("Exercise 4:")
  println(s"Encrypting \"zorro zero\" with key = ${logger.key}: ${logger.encrypt("Zorro zero")}")
  println("-------------------------------------------------")
}
