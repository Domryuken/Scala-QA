/**
  * Created by Administrator on 06/06/2017.
  */
class Customer(name: String, id: Int, var address: String) extends Person(name, id) {

  //  { { { { C U R L Y B O Y S } } } }
  def getAddress = address

  //  { { { { C U R L Y B O Y S } } } }
  def setAddress(givenAddress: String): Unit = {
    address = givenAddress
  }

  //  { { { { C U R L Y B O Y S } } } }
  override def toString: String = {
    var str = ""
    str += id + name + address
    str
  }
}
