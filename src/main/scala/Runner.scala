/**
  * Created by Administrator on 06/06/2017.
  */

//  { { { { C U R L Y B O Y S } } } }
object Runner {
  def main(args: Array[String]): Unit = {
    val garage = new Garage
    garage.addVehicle(new Car(1, "blue", 4, false))
    garage.addVehicle(new Car(2, "red", 4, false))
    garage.addVehicle(new Car(3, "yellow", 4, false))
    garage.addVehicle(new Car(4, "green", 4, false))
    garage.addVehicle(new Car(5, "purple", 4, false))
    garage.addVehicle(new Car(6, "orange", 4, false))

    garage.addVehicle(new Bike(1, "blue", false, false))
    garage.addVehicle(new Bike(2, "red", false, false))
    garage.addVehicle(new Bike(3, "yellow", false, false))
    garage.addVehicle(new Bike(4, "green", false, false))
    garage.addVehicle(new Bike(5, "purple", false, false))
    garage.addVehicle(new Bike(6, "orange", false, false))

    garage.removeVehicle("Car")
    println(garage)

    garage.fixVehicle(1)
    println(garage)
  }
}