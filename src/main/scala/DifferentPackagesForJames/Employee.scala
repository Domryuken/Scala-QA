/**
  * Created by Administrator on 06/06/2017.
  */
class Employee(name: String, var role: String) extends Person(name, Person.nextEmpId()) {

  //  { { { { C U R L Y B O Y S } } } }
  def getRole = role

  //  { { { { C U R L Y B O Y S } } } }
  def setRole(givenRole: String): Unit = {
    role = givenRole
  }

  //  { { { { C U R L Y B O Y S } } } }
  override def toString: String = {
    var str = ""
    str += id + name + role
    str
  }

}
