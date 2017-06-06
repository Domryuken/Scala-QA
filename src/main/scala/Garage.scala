import scala.collection.mutable.ArrayBuffer

/**
  * Created by Administrator on 06/06/2017.
  */
class Garage{

  var vehicles = new ArrayBuffer[Vehicle]()

  def addVehicle(vehicle: Vehicle): Unit = {
    vehicles += vehicle
  }

  override def toString: String = {
    vehicles.toString()
  }
}
