
//  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }


/*
                        l}L             b}
                         l}             b}
 c}CCCC u}   UU  r}RRR   l}  y}   YY    b}BBBB   o}OOO  y}   YY
c}      u}   UU r}   RR  l}  y}   YY    b}   BB o}   OO y}   YY
c}      u}   UU r}       l}  y}   YY    b}   BB o}   OO y}   YY
 c}CCCC  u}UUU  r}      l}LL  y}YYYY    b}BBBB   o}OOO   y}YYYY
                                  y}                         y}
                             y}YYYY                     y}YYYY
*/

//  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
object Runner extends App {
  val garage = new Garage

  garage.addEmployee("Abe Abeman","Some role")
  garage.addEmployee("Babe Babeman","Another Role")
  garage.addEmployee("Abe Abeman","Some role")
  println(garage.getEmployee(1))
  println(garage.getEmployee(2))
  println(garage.getEmployee(3))
  println(garage.getEmployee(0))

  println()

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

//  println(garage)
//  garage.setIsOpen(false)
  garage.removeVehicle("Car")
  println(garage)

  println(garage.fixVehiclePart("b6", "part1", true))
  println(garage.calcCost("b6"))
  println(garage.getVehicle("b6"))
  println(garage.addPartToVehicle("b6", "part1", false))
  println(garage.getVehicle("b6"))
  println(garage.getVehicle("b6"))

  println(garage.vehicleBroken("b6"))
  println(garage)
  println(garage.getVehicle("b6").get.setFixedVehicle(true))
  println(garage)
  println(garage.vehicleBroken("b6"))
  println(garage.getVehicle("b6"))
  println(garage.getVehicle("b6").get.setFixedVehicle(true))
  println(garage.getVehicle("b6").get)


}