/**
  * Created by Administrator on 06/06/2017.
  */
abstract class Vehicle(protected val id: Int, protected val colour: String, protected var fixed: Boolean) {

  //  { { { { C U R L Y B O Y S } } } }
  def getid:Int = id
  def getColour:String = colour
  def getFixed:Boolean = fixed

  //  { { { { C U R L Y B O Y S } } } }
  def setFixed(state: Boolean): Unit ={
    fixed = state
    println(s"$fixed $state $getFixed")

  }

}
