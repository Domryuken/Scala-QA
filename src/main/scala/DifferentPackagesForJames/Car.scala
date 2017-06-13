/**
  * Created by Administrator on 06/06/2017.
  */
class Car(id: String, colour: String, private val wheels: Int) extends Vehicle(id, colour) {

  //  { { { { JAMES STOP STEALING MY FILES } } } }
  def getWheels = wheels

  //  { { { { JAMES STOP STEALING MY FILES } } } }
  override def toString: String = "Type: Car " + super.toString + s"Wheels: $wheels"

}