package ru.ivashkevich
package chapter_07

object Ex09 extends App {
  /** Write a program that imports the java.lang.System class, reads the user name
   *  from the user.name system property, reads a password from the StdIn object,
   *  and prints a message to the standard error stream if the password is not
   *  "secret". Otherwise, print a greeting to the standard output stream. Do not
   *  use any other imports, and do not use any qualified names (with dots). */
  func()

  import java.lang.System._
  def func(): Unit = {
    val userName = getProperty("user.name")

    val buffer = new Array[Byte]("secret".length)
    out.print("> ")
    in.read(buffer)
    val password = new String(buffer)

    if (password != "secret") err.println("Password isn't safe")
    else out.println("Hello there")
  }

}