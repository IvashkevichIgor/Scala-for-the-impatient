package ru.ivashkevich
package chapter_11

object Ex07 extends App {
  /** Implement a class BitSequence that stores a sequence of 64 bits packed in a Long
   *  value. Supply apply and update operators to get and set an individual bit. */

  class BitSequence(private var bits: Long = 0) {

    def apply(bitNum: Int): Int = {
      val a: Long = 1 << bitNum
      if ((a ^ bits) > bits) 0 else 1
    }

    def update(bitNum: Int): Unit = {
      val a: Long = 1 << bitNum
      bits = bits ^ a
    }

    override def toString: String = s"BitSequence(${bits.toBinaryString})"
  }

  val seq = new BitSequence(33)
  println(s"Decimal 33 is $seq")
  println(s"Fifth bit is ${seq(5)}")
  println(s"Third bit is ${seq(3)}")
  println("Updating third bit")
  seq.update(3)
  println(s"Now third bit is ${seq(3)}")
  println(s"$seq")
}
