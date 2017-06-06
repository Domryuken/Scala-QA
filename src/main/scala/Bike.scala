/**
  * Created by Administrator on 06/06/2017.
  */
class Bike(givenid: Int, givenColour: String, givenSidecar: Boolean) extends Vehicle(givenid, givenColour) {
  private val sidecar = givenSidecar

  def getSidecar = sidecar

  override def toString: String = {
    var str = ""
    str += id + colour + sidecar
    str
  }
}