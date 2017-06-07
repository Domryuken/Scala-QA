/**
  * Created by Administrator on 06/06/2017.
  */
class Car(id: Int, colour: String, private val wheels: Int, fixed: Boolean = false) extends Vehicle(id, colour, fixed) {

  //  { { { { C U R L Y B O Y S } } } }
  def getWheels = wheels

  //  { { { { C U R L Y B O Y S } } } }
  override def toString: String = {
    var str = ""
    str += id + colour + wheels + fixed
    str
  }
}