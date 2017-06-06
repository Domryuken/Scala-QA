/**
  * Created by Administrator on 06/06/2017.
  */
class Customer (givenName: String, givenid: Int, givenAddress: String){
  var address = givenAddress

  def getAddress = address
  def setAddress(givenAddress: String): Unit = {
    address = givenAddress
  }
}
