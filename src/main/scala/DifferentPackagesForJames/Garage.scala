import scala.collection.mutable.ArrayBuffer
import DifferentPackagesForJames.Part

class Garage {
  //  { { { { JAMES STOP STEALING MY FILES } } } }
  private var vehicles = new ArrayBuffer[Vehicle]()
  private var employees = new ArrayBuffer[Employee]()
  private var customer = new ArrayBuffer[Customer]()

  //  { { { { JAMES STOP STEALING MY FILES } } } }
  def addVehicle(vehicle: Vehicle): Unit = {
    vehicles += vehicle
  }

  //  { { { { JAMES STOP STEALING MY FILES } } } }
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

  //  { { { { JAMES STOP STEALING MY FILES } } } }
  def fixVehiclePart(id: String, part:String,isFixed:Boolean):Boolean = {
    try {
      getVehicle(id).get.setFixedPart(part,isFixed)
      true
    }catch{
      case ex: NoSuchElementException => false
    }
  }

  //  { { { { JAMES STOP STEALING MY FILES } } } }
  def addEmployee(givenName: String, givenid: Int, givenRole: String): Unit = {
    employees += new Employee(givenName, givenid, givenRole)
  }

  def addPartToVehicle(id:String, name:String, isFixed:Boolean): Boolean ={
    try{
      getVehicle(id).get.addPart(Part.create(name,isFixed))
      true
    }catch{
      case e: IllegalArgumentException => false
    }
  }
  //  { { { { JAMES STOP STEALING MY FILES } } } }
  override def toString: String = {
    var str = ""
    vehicles.toArray.map(a => str += a + "\n")
    str
  }

  //  { { { { JAMES STOP STEALING MY FILES } } } }
  def calcCost(id:String): Double = {
    getVehicle(id).get.getParts.filter(p => !p.isFixed).map(p => p.cost).sum
  }




}
