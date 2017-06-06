/**
  * Created by Administrator on 06/06/2017.
  */
object Runner {
  def main(args: Array[String]): Unit = {
    val garage = new Garage
    garage.addVehicle(new Car(1, "blue", 4))
    println(garage)
  }
}