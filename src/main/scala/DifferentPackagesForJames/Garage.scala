import scala.collection.mutable.ArrayBuffer

class Garage {
  //  { { { { C U R L Y B O Y S } } } }
  private var vehicles = new ArrayBuffer[Vehicle]()
  private var employees = new ArrayBuffer[Employee]()
  private var customer = new ArrayBuffer[Customer]()

  //  { { { { C U R L Y B O Y S } } } }
  def addVehicle(vehicle: Vehicle): Unit = {
    vehicles += vehicle
  }

  //  { { { { C U R L Y B O Y S } } } }
  def removeVehicle(remove:String): Unit = {
    remove match{
      case "Car" =>
        vehicles = vehicles.filter(v => !v.isInstanceOf[Car])
      case "Bike" =>
        vehicles = vehicles.filter(v => !v.isInstanceOf[Bike])
      case _ =>
        vehicles = vehicles.filter(v => v.getid!=remove)
    }
  }

  def getVehicle(id:String): Option[Vehicle] = {
    vehicles.find(v => v.getid == id)
  }

  //  { { { { C U R L Y B O Y S } } } }
  def fixVehicle(id: String, isFixed:Boolean):Boolean = {
    try {
      getVehicle(id).get.setFixed(isFixed)
      true
    }catch{
      case ex: NoSuchElementException => false
    }
  }

  //  { { { { C U R L Y B O Y S } } } }
  def addEmployee(givenName: String, givenid: Int, givenRole: String): Unit = {
    employees += new Employee(givenName, givenid, givenRole)
  }


  //  { { { { C U R L Y B O Y S } } } }
  override def toString: String = {
    var str = ""
    vehicles.toArray.map(a => str += a + "\n")
    str
  }







  //  { { { { C U R L Y B O Y S } } } }
//  def calcCost(id:String): Int = {
//    var cost = 0
//    getVehicle(id).get.
//    10
//  }


}
