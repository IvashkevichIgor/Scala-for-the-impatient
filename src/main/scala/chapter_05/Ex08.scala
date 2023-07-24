package ru.ivashkevich
package chapter_05

object Ex08 {
  /** Make a class Car with read-only properties for manufacturer, model name,
   *  and model year, and a read-write property for the license plate. Supply four
   *  constructors. All require the manufacturer and model name. Optionally,
   *  model year and license plate can also be specified in the constructor. If not,
   *  the model year is set to -1 and the license plate to the empty string. Which
   *  constructor are you choosing as the primary constructor? Why? */

  class Car (val manufacturer: String, val modelName: String) {
    private var _year = -1
    var licensePlate = ""

    def this(manufacturer: String, modelName: String, year: Int) {
      this(manufacturer, modelName)
      this._year = year
    }

    def this(manufacturer: String, modelName: String, licensePlate: String) {
      this(manufacturer, modelName)
      this.licensePlate = licensePlate
    }

    def this(manufacturer: String, modelName: String, year: Int, licensePlate: String) {
      this(manufacturer, modelName, year)
      this.licensePlate = licensePlate
    }

    def year: Int = _year


    override def toString = s"Car($manufacturer, $modelName, $year, $licensePlate)"
  }

  def test(car: Car): Unit = {
    println("Exercise 8:")
    println(car)
    println("-------------------------------------------------")
  }

}
