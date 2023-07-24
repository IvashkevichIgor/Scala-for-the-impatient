package ru.ivashkevich
package chapter_06

object Ex03 {
  /** Define an Origin object that extends java.awt.Point. Why is this not actually a
   *  good idea? (Have a close look at the methods of the Point class.) */

  object Origin extends java.awt.Point // Point class hasn't static methods

}
