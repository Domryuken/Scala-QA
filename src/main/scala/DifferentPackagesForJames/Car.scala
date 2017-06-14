/**
  * Created by Administrator on 06/06/2017.
  */
class Car(id: String, colour: String, private val wheels: Int) extends Vehicle(id, colour) {

  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  def getWheels = wheels

  //  { { { { JAMES STOP STEALING MY FILES AND LEARN TO SCALA } } } }
  override def toString: String = {
    var string = "Type: Car " + super.toString + s"Wheels: $wheels \n Parts:\n Name\t|Cost\t|\tFixed\n"
    for(p <- parts) string += p.toString
    string
  }

}