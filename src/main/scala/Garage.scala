import scala.collection.mutable.ArrayBuffer

class Garage {
  private var vehicles = new ArrayBuffer[Vehicle]()

  def addVehicle(vehicle: Vehicle): Unit = {
    vehicles += vehicle
  }

  def removeVehicle(id:Int): Unit = {
    vehicles.re
  }

  override def toString: String = {
    var str = ""
    vehicles.toArray.map(a => str += a)
    str
  }

}
