/**
  * Created by Administrator on 06/06/2017.
  */
class Customer(name: String, var address: String) extends Person(name, Person.nextCustId()) {

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

