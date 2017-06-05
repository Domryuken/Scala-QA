import java.util.TimeZone.getAvailableIDs

//task 1
println("Hello World!")

//task 2
val hello = "Hello World!"
println(hello)

//task 3
def printThis(string: String): Unit = {
  println(string)
}
printThis(hello)

//task 4
def returnString: String = {
  val string = "Hello World!"
  string
}
println(returnString)

//task 5
def returnThis(a:Any) = {
  a
}
val string = "A String"
val double = 1.22
val int = 12
val boolean = true
println(s"task 5",returnThis(string),returnThis(double),returnThis(int),returnThis(boolean))

//task 6
def endChars(string: String, n:Int): String = {
  string.takeRight(n)
}
println(endChars("Hello World!",8))

//task 7
def combineStrings(stringOne: String, stringTwo: String, charOne: Char, charTwo: Char): String = {
  val combined = stringOne + stringTwo
  combined.replace(charOne, charTwo)
}
println(combineStrings("Hellu", "Wurld", 'u', 'o'))

//task 8
def sumInts(a:Int, b:Int): Int = {
  a + b
}
println(sumInts(15,13))

//task 9
def sumInts2(a:Int, b:Int, toSum:Boolean): Int = {
  if(toSum)
    a + b
  else
    a * b
}
println(sumInts2(15,13,false))

//task 10
def sumInts3(a:Int, b:Int, toSum:Boolean): Int = {
  if(a==0)
    b
  else if(b==0)
    a
  else if(toSum)
    a + b
  else
    a * b
}
println(sumInts3(0,0,false))

//task 11
def printString(string: String, n:Int): Unit = {
  for(i<-1 to n)
    println(string)
}
printString("Hello World!", 5)

//task 12
def printSquare(string: String, n:Int): Unit = {
//cheating method
  for(i<-1 to n)
    println(string*n)
//  for(i<-1 to n){
//    for(j<-1 to n)
//      {
//        print(string)
//      }
//    println()
//  }
}
printSquare("Hello World!", 5)

//task 13
def fizzBuzz(one:String,two:String,n:Int): Unit ={
  for(i<-1 to n){
    if(i%3==0&&i%5==0)
      println(one + two)
    else if(i%3==0)
      println(one)
    else if(i%5==0)
      println(two)
    else
      println(i)
  }
}
fizzBuzz("Fizz","Buzz",15)

//task 14
def printStringRecursion(string: String, n:Int): String = {
  if(n==1)
    string + "\n"
  else {
    string + "\n" + printStringRecursion(string, n - 1)
  }
}
print(printStringRecursion("Hello World!", 5))

//task 15
//def printSquareRecursion(string: String, n:Int): String = {
//  if(n==1){
//    string + "\n"
//  }
//  else {
//    string + printSquareRecursion(string, n-1)
//  }
//}
//print(printSquareRecursion("Hello World! ", 5))

//task 16
def patternMatching(a:Int, b:Int, toSum:Boolean): Int = a match{
  case 0 => b
  case _ => b match{
    case 0 => a
    case _ => toSum match{
      case true => a + b
      case false => a *b
    }
  }
  //  case true => a + b
  //  case false => a * b
}
println(patternMatching(15,13,true))


//task 17
def patternMatching2(any: Any): Any = any match{
  case Array(a,b) => (b,a)
  case List(a,b) => (b,a)
  case (a,b) => (b,a)
}
val numbers = (4,80)
patternMatching2(numbers)

//task 18
val something = getAvailableIDs

