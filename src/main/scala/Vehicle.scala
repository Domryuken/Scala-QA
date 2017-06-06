/**
  * Created by Administrator on 06/06/2017.
  */
abstract class Vehicle (givenid: Int, givenColour: String){

  protected val id = givenid
  protected val colour = givenColour

  def getid = id
  def getColour = colour

}
