/**
  * Created by Administrator on 06/06/2017.
  */

//  { { { { C U R L Y B O Y S } } } }
object Runner extends App {

  val garage = new Garage
  garage.addVehicle(new Car("c1", "blue", 4, false))
  garage.addVehicle(new Car("c2", "red", 4, false))
  garage.addVehicle(new Car("c3", "yellow", 4, false))
  garage.addVehicle(new Car("c4", "green", 4, false))
  garage.addVehicle(new Car("c5", "purple", 4, false))
  garage.addVehicle(new Car("c6", "orange", 4, false))

  garage.addVehicle(new Bike("b1", "blue", false, false))
  garage.addVehicle(new Bike("b2", "red", false, false))
  garage.addVehicle(new Bike("b3", "yellow", false, false))
  garage.addVehicle(new Bike("b4", "green", false, false))
  garage.addVehicle(new Bike("b5", "purple", false, false))
  garage.addVehicle(new Bike("b6", "orange", false, false))

  garage.removeVehicle("Car")

  println(garage)
  println(garage.fixVehicle("c1", true))
  println(garage.fixVehicle("b6", true))
  println(garage)

}