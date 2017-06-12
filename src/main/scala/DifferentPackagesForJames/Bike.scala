/**
  * Created by Administrator on 06/06/2017.
  */
class Bike(id: String, colour: String, private val sidecar: Boolean, givenFixed: Boolean = false) extends Vehicle(id, colour, givenFixed) {

  //  { { { { C U R L Y B O Y S } } } }
  def getSidecar = sidecar

  //  { { { { C U R L Y B O Y S } } } }
  override def toString: String = "Type: Bike " + super.toString + s"Sidecar: $sidecar"

}