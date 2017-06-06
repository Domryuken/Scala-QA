/**
  * Created by Administrator on 06/06/2017.
  */
class Employee (givenName: String, givenid: Int, givenRole: String) extends Person(givenName, givenid){

  var role = givenRole

  def getRole = role
  def setRole(givenRole: String): Unit = {
    role = givenRole
  }

}
