package ru.ivashkevich
package chapter_06

object Ex08 {
  /** Write an enumeration describing the eight corners of the RGB color cube. As
   *  IDs, use the color values (for example, 0xff0000 for Red). */

  object RGBCube extends Enumeration {
    val black = Value(0x000000, "Black")
    val red = Value(0xff0000, "Red")
    val green = Value(0x00ff00, "Green")
    val yellow = Value(0xffff00, "Yellow")
    val blue = Value(0x0000ff, "Blue")
    val cyan = Value(0x00ffff, "Cyan")
    val magenta = Value(0xff00ff, "Magenta")
    val white = Value(0xffffff, "White")
  }

  def test(v: RGBCube.Value): Unit = {
    println("Exercise 8:")
    println(v)
    println("-------------------------------------------------")
  }
}
