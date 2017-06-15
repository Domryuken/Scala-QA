import scala.collection.mutable.ArrayBuffer
import DifferentPackagesForJames.Part

class Garage {
  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  private var vehicles = new ArrayBuffer[Vehicle]()
  private var employees = new ArrayBuffer[Employee]()
  private var customer = new ArrayBuffer[Customer]()
  private var isOpen = false

  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  def addVehicle(vehicle: Vehicle): Unit = {
    vehicles += vehicle
  }

  def setIsOpen(state: Boolean): Unit ={
    isOpen = state
  }

  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  def removeVehicle(remove:String): Unit = if(isOpen){
    remove match{
      case "Car" =>
        vehicles = vehicles.filter(v => !v.isInstanceOf[Car])
      case "Bike" =>
        vehicles = vehicles.filter(v => !v.isInstanceOf[Bike])
      case _ =>
        vehicles = vehicles.filter(v => v.getid!=remove)
    }
  }

  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  def getVehicle(id:String): Option[Vehicle] = {
    vehicles.find(v => v.getid == id)
  }

  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  def fixVehiclePart(id: String, part:String,isFixed:Boolean):Boolean = {
    if(getVehicle(id).isEmpty) {
      getVehicle(id).get.setFixedPart(part, isFixed)
      true
    }else{
      false
    }
  }

  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  def addEmployee(givenName: String, givenid: Int, givenRole: String): Unit = {
    employees += new Employee(givenName, givenid, givenRole)
  }

  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  def addPartToVehicle(id:String, name:String, isFixed:Boolean): Boolean ={
    try{
      getVehicle(id).get.addPart(Part.create(name,isFixed))
      true
    }catch{
      case e: IllegalArgumentException => false
    }
  }

  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  def calcCost(id:String): Double = {
    getVehicle(id).get.getParts.filter(p => !p.isFixed).map(p => p.cost).sum
  }

  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  def vehicleBroken(id:String):Boolean = {
    try{
      if(getVehicle(id).get.partsBroken==0){
        false
      }else{
        true
      }

    }catch{
      case e: NoSuchElementException => false
    }
  }

  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  def vehicleToString(id:String): String = vehicles.find(v => v.getid == id).get.toString

  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  override def toString: String = {
    var str = ""
    vehicles.toArray.map(a => str += a + "\n\n")
    str
  }



}
