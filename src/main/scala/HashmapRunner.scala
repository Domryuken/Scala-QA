import scala.collection.mutable.Map
import scala.io.Source
import scala.collection.mutable.ArrayBuffer

/**
  * Created by Administrator on 15/06/2017.
  */
object HashmapRunner extends App {
  def readFile(string: String): Array[String] = {
    Source.fromFile(string).getLines().toArray
  }
  def sortString(string: String): String = string.toLowerCase.sorted
  val fileContents: Array[String] = readFile("C:\\Users\\Administrator\\Desktop\\wordList.txt")
  var map = scala.collection.mutable.Map.empty[String, ArrayBuffer[String]]
  for (i <- fileContents) {
    val temp = sortString(i)
    if (map.contains(temp)) {
      var list = map(temp)
      list += i
      map += (temp -> list)
    } else {
      map += (temp -> ArrayBuffer(i))
    }
  }
  println(s"${map.maxBy(_._2.length)._1} with ${map.maxBy(_._2.length)._2.length} variations")
}