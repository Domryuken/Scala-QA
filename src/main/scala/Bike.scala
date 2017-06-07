/**
  * Created by Administrator on 06/06/2017.
  */
class Bike(id: Int, colour: String, private val sidecar: Boolean, var fixed2: Boolean = false) extends Vehicle(id, colour, fixed2) {

  //  { { { { C U R L Y B O Y S } } } }
  def getSidecar = sidecar

  //  { { { { C U R L Y B O Y S } } } }
  override def toString: String = {
    var str = ""
    str += fixed
//    str += id + colour + sidecar + fixed
    str
  }

}