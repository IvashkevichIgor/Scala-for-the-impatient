package ru.ivashkevich
package chapter_10

import java.awt.Point
import java.beans._

object Ex05 extends App{
  /** The JavaBeans specification has the notion of a property change listener, a
   *  standardized way for beans to communicate changes in their properties. The
   *  PropertyChangeSupport class is provided as a convenience superclass for any bean
   *  that wishes to support property change listeners. Unfortunately, a class that
   *  already has another superclass—such as JComponent—must reimplement
   *  the methods. Reimplement PropertyChangeSupport as a trait, and mix it into the
   *  java.awt.Point class. */

  trait PropertyChangeSupportLike {
    private val support = new PropertyChangeSupport(this)

    def addPropertyChangeListener(listener: PropertyChangeListener): Unit =
      support.addPropertyChangeListener(listener)

    def removePropertyChangeListener(listener: PropertyChangeListener): Unit =
      support.removePropertyChangeListener(listener)

    def getPropertyChangeListeners: Array[PropertyChangeListener] =
      support.getPropertyChangeListeners

    def addPropertyChangeListener(propertyName: String, listener: PropertyChangeListener): Unit =
      support.addPropertyChangeListener(propertyName, listener)

    def removePropertyChangeListener(propertyName: String, listener: PropertyChangeListener): Unit =
      support.removePropertyChangeListener(propertyName, listener)

    def getPropertyChangeListeners(propertyName: String): Array[PropertyChangeListener] =
      support.getPropertyChangeListeners(propertyName)

    def firePropertyChange(propertyName: String, oldValue: Any, newValue: Any): Unit =
      support.firePropertyChange(propertyName, oldValue, newValue)

    def firePropertyChange(propertyName: String, oldValue: Int, newValue: Int): Unit =
      support.firePropertyChange(propertyName, oldValue, newValue)

    def firePropertyChange(propertyName: String, oldValue: Boolean, newValue: Boolean): Unit =
      support.firePropertyChange(propertyName, oldValue, newValue)

    def firePropertyChange(event: PropertyChangeEvent): Unit =
      support.firePropertyChange(event)

    def fireIndexedPropertyChange(propertyName: String, index: Int, oldValue: Any, newValue: Any): Unit =
      support.fireIndexedPropertyChange(propertyName, index, oldValue, newValue)

    def fireIndexedPropertyChange(propertyName: String, index: Int, oldValue: Int, newValue: Int): Unit =
      support.fireIndexedPropertyChange(propertyName, index, oldValue, newValue)

    def fireIndexedPropertyChange(propertyName: String, index: Int, oldValue: Boolean, newValue: Boolean): Unit =
      support.fireIndexedPropertyChange(propertyName, index, oldValue, newValue)

    def hasListeners(propertyName: String): Boolean =
      support.hasListeners(propertyName)
  }

  class PointBean(x: Int = 0, y: Int = 0) extends Point(x, y) with PropertyChangeSupportLike
}
