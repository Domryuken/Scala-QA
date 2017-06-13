/**
  * Created by Administrator on 06/06/2017.
  */
//  { { { { JAMES STOP STEALING MY FILES } } } }
class Bike(id: String, colour: String, private val sidecar: Boolean) extends Vehicle(id, colour) {

  //  { { { { JAMES STOP STEALING MY FILES } } } }
  def getSidecar = sidecar

  //  { { { { JAMES STOP STEALING MY FILES } } } }
  override def toString: String = "Type: Bike " + super.toString + s"Sidecar: $sidecar"

}