/**
  * Created by Administrator on 06/06/2017.
  */
class Customer(givenName: String, givenid: Int, givenAddress: String) extends Person(givenName, givenid) {
  private var address = givenAddress

  def getAddress = address

  def setAddress(givenAddress: String): Unit = {
    address = givenAddress
  }

  override def toString: String = {
    var str = ""
    str += id + name + address
    str
  }
}
