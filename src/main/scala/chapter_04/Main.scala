package ru.ivashkevich
package chapter_04

object Main {
    def main(args: Array[String]): Unit = {
      Ex01.test(Map("watch" -> 1000, "IPad" -> 2000, "gum" -> 1.50))
      Ex02.test(new java.io.File("C:\\Java\\projects\\scala-for-the-impatient\\src\\files\\chapter_04\\ex02.txt"))
      Ex03.test(new java.io.File("C:\\Java\\projects\\scala-for-the-impatient\\src\\files\\chapter_04\\ex02.txt"))
      Ex04.test(new java.io.File("C:\\Java\\projects\\scala-for-the-impatient\\src\\files\\chapter_04\\ex02.txt"))
      Ex05.test(new java.io.File("C:\\Java\\projects\\scala-for-the-impatient\\src\\files\\chapter_04\\ex02.txt"))
      Ex06.test()
      Ex07.test()
      Ex08.test(Array(11, 69, 420, -54, 18, 23, 32))
      Ex09.test(Array(11, 69, 69, 420, -54, 18, 69, 23, 332, 77), 69)
    }
}
