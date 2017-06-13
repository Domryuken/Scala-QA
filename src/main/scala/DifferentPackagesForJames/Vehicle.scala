import DifferentPackagesForJames.Part
import scala.collection.mutable.ArrayBuffer

/**
  * Created by Administrator on 06/06/2017.
  */
//  { { { { JAMES STOP STEALING MY FILES } } } }
abstract class Vehicle(protected val id: String, protected val colour: String) {

  var parts = Part.createSet()

  //  { { { { JAMES STOP STEALING MY FILES } } } }
  def getid:String = id
  def getColour:String = colour
//  def getFixed:Boolean = fixed

  def getParts:ArrayBuffer[Part] = parts

  def isFixed:Boolean = {
    !parts.exists(p => !p.isFixed)
  }

  //  { { { { JAMES STOP STEALING MY FILES } } } }
  def setFixedPart(part:String,state: Boolean): Unit ={
    parts.find(p => p.name==part).get.setFixed(state)
  }

  //  { { { { JAMES STOP STEALING MY FILES } } } }
  def setFixedVehicle(state:Boolean): Unit ={
    parts.foreach(p => p.setFixed(state))
  }

  //  { { { { JAMES STOP STEALING MY FILES } } } }
  def addPart(part:Part): Unit ={
    parts += part
  }


  //  { { { { JAMES STOP STEALING MY FILES } } } }
  override def toString: String =  s"ID: $id Fixed: $isFixed Colour: $colour "

}


