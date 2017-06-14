
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
  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  val garage = new Garage
  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  garage.addVehicle(new Car("c1", "blue", 4))
  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  garage.addVehicle(new Car("c2", "red", 4))
  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  garage.addVehicle(new Car("c3", "yellow", 4))
  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  garage.addVehicle(new Car("c4", "green", 4))
  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  garage.addVehicle(new Car("c5", "purple", 4))
  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  garage.addVehicle(new Car("c6", "orange", 4))

  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  garage.addVehicle(new Bike("b1", "blue", false))
  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  garage.addVehicle(new Bike("b2", "red", false))
  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  garage.addVehicle(new Bike("b3", "yellow", false))
  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  garage.addVehicle(new Bike("b4", "green", false))
  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  garage.addVehicle(new Bike("b5", "purple", false))
  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  garage.addVehicle(new Bike("b6", "orange", false))

  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  garage.removeVehicle("Car")

  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  println(garage.fixVehiclePart("b6", "part1", true))
  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  println(garage.calcCost("b6"))
  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  println(garage.getVehicle("b6"))
  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  println(garage.addPartToVehicle("b6", "part1", false))
  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  println(garage.getVehicle("b6"))
  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  println(garage.getVehicle("b6"))

  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  println(garage.vehicleBroken("b6"))
  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  println(garage)
  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  println(garage.getVehicle("b6").get.setFixedVehicle(true))
  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  println(garage)
  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  println(garage.vehicleBroken("b6"))

  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  println(garage.getVehicle("b6"))
  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  println(garage.getVehicle("b6").get.setFixedVehicle(true))
  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  println(garage.getVehicle("b6").get)


}