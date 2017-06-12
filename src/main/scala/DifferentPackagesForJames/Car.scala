/**
  * Created by Administrator on 06/06/2017.
  */
class Car(id: String, colour: String, private val wheels: Int, givenFixed: Boolean = false) extends Vehicle(id, colour, givenFixed) {

  //  { { { { C U R L Y B O Y S } } } }
  def getWheels = wheels

  //  { { { { C U R L Y B O Y S } } } }
  override def toString: String = "Type: Car " + super.toString + s"Wheels: $wheels"

}