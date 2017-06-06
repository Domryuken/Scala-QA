/**
  * Created by Administrator on 06/06/2017.
  */
class Car(givenid: Int, givenColour: String, givenWheels: Int) extends Vehicle(givenid, givenColour) {
  private val wheels = givenWheels

  def getWheels = wheels

  override def toString: String = {
    var str = ""
    str += id + colour + wheels
    str
  }
}