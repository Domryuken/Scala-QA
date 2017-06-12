import scala.io.Source

val filename = "C:\\Users\\Administrator\\Desktop\\test.txt"
val fileContents = Source.fromFile(filename).getLines()

def sortString(string: String): String = string.sorted
fileContents.foreach(w => println(sortString(w)))