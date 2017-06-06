/**
  * Created by Administrator on 06/06/2017.
  */
class Bike(givenid: Int, givenColour: String,givenSidecar:Boolean)extends Vehicle(givenid,givenColour) {

  val sidecar = givenSidecar

  def getSidecar = sidecar
}
