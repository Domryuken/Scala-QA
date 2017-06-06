/**
  * Created by Administrator on 06/06/2017.
  */
class Car(givenid:Int, givenColour:String, givenWheels:Int) extends Vehicle(givenid, givenColour){

  val wheels = givenWheels

  def getWheels = wheels

}
