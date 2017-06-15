import scala.io.Source
import scala.collection.mutable.Map
import scala.collection.mutable.ArrayBuffer


def readFile(string: String): Array[String] ={
  Source.fromFile(string).getLines().toArray
}

def sortString(string: String): String = string.toLowerCase.sorted

val fileContents = readFile("C:\\Users\\Administrator\\Desktop\\wordList.txt")
val sorted = fileContents.map(w => w.sorted)
var map = Map.empty[String,Int]
for(i <- 0 until fileContents.length){
  map += (fileContents(i) -> sorted.filter(s => s == fileContents(i).sorted).length)
}

println(map.maxBy(_._2))



