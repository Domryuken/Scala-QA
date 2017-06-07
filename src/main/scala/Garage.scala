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
  def removeVehicle[T](remove:T): Unit = {
    remove match{
      case remove: Int =>
        vehicles = vehicles.filter(v => v.getid!=remove)
      case "Car" =>
        vehicles = vehicles.filter(v => !v.isInstanceOf[Car])
      case "Bike" =>
        vehicles = vehicles.filter(v => !v.isInstanceOf[Bike])
    }
  }

  //  { { { { C U R L Y B O Y S } } } }
  def fixVehicle(id: Int): Unit = {

//    vehicles.map(vehicle => {
//      if (vehicle.getid==id) {
//        vehicle.fixed = true
//        vehicle
//      }
//    })

    for(i<-0 until vehicles.length){
      if(vehicles(i).getid==id){
        vehicles(i).setFixed(true)
      }
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

}
