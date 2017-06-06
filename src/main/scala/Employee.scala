/**
  * Created by Administrator on 06/06/2017.
  */
class Employee(givenName: String, givenid: Int, givenRole: String) extends Person(givenName, givenid) {
  private var role = givenRole

  def getRole = role

  def setRole(givenRole: String): Unit = {
    role = givenRole
  }

  override def toString: String = {
    var str = ""
    str += id + name + role
    str
  }
}
