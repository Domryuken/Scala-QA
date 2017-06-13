
/**
  * Created by Administrator on 06/06/2017.
  */

//  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
object Runner extends App {

  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  val garage = new Garage
  garage.addVehicle(new Car("c1", "blue", 4))
  garage.addVehicle(new Car("c2", "red", 4))
  garage.addVehicle(new Car("c3", "yellow", 4))
  garage.addVehicle(new Car("c4", "green", 4))
  garage.addVehicle(new Car("c5", "purple", 4))
  garage.addVehicle(new Car("c6", "orange", 4))

  garage.addVehicle(new Bike("b1", "blue", false))
  garage.addVehicle(new Bike("b2", "red", false))
  garage.addVehicle(new Bike("b3", "yellow", false))
  garage.addVehicle(new Bike("b4", "green", false))
  garage.addVehicle(new Bike("b5", "purple", false))
  garage.addVehicle(new Bike("b6", "orange", false))

  garage.removeVehicle("Car")

  println(garage.fixVehiclePart("b6", "part1",true))

//  println(garage.calcCost("b6"))
//  println(garage.getVehicle("b6").get.getParts)
//  println(garage.addPartToVehicle("b6","part1",false))
//  println(garage.getVehicle("b6").get.getParts)
//
//  println(garage.getVehicle("b6").get.getParts)
//
//  println(garage.vehiclePartsBroken("b6"))
  println(garage.getVehicle("b").get.setFixedVehicle(true))
//  println(garage.vehiclePartsBroken("b6"))


}