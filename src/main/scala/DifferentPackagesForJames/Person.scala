/**
  * Created by Administrator on 06/06/2017.
  */
abstract class Person(val name: String, val id: Int) {

  //  { { { { C U R L Y B O Y S } } } }
  def getName = name
  def getid = id

}

object Person{
  var custId= 0;
  var empId = 0
  def nextCustId(): Int = {
    custId += 1
    custId
  }
  def nextEmpId(): Int = {
    empId += 1
    empId
  }
}
