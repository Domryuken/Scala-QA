def doubleChar(string:String): String = {
  var string2 = ""
  string.foreach(c => string2 += c.toString + c.toString)
  string2
}
println(doubleChar("string"))


def getSandwich(string:String): String = {
  if(string.split("bread").length==2||string.split("bread").length==3)
    string.split("bread")(1)
  else
    ""
}
println(getSandwich("xxbreadsomebreadxx"))


def evenlySpaced(a:Int,b:Int,c:Int): Boolean ={
  val list = List(a,b,c).sorted
  val difference = list(1) - list(0)
  if(list(2)-list(1)!= difference)
    false
  else true
}
evenlySpaced(500,450,400)


def fibonacci(n:Int): Int = {
  if (n == 0) {
    0
  }else if(n==1){
    1
  }else{
    fibonacci(n-1) + fibonacci(n-2)
  }
}
fibonacci(8)

def bunnyEars(n:Int): Int ={
  if(n==1)
    2
  else
    bunnyEars(n-1) + 2
}
bunnyEars(30)

def nTwice(string:String, n:Int):String = {
  string.substring(0,n) + string.substring(string.length-n)
}
nTwice("sotring",3)


def endLy(string:String): Boolean = {
  if(string.substring(string.length-2)=="ly")
    true
  else false
}
endLy("somethingly")


def stringClean(string:String): String = {
  var result = string.charAt(0).toString
  for(i <- string){
    if(result.last != i){
      result += i
    }
  }
  result
}
stringClean("sssooooooommmmmmmeeeeeeeeetttttthhiiiinnng")


def diamond(n:Int): Unit ={
  var white = (n-1)/2
  var black = 1
  while(black<n-1){
    println((" "*white) + ("+"*black)+ (" "*white))
    white -=1
    black +=2
  }
  while(black>0){
    println((" "*white) + ("+"*black)+ (" "*white))
    white +=1
    black -=2
  }
}
diamond(20)


def diamond2(n:Int): Unit ={
  var white = (n-1)/2
  var black = 1
  println(" "*white + "+" + " "*white)
  white -=1
  black +=2
  while(black<n-1){
    print(" "*white)
    print("+"+" "*(black-2)+"+")
    print(" "*white)
    println()
    white -=1
    black +=2
  }
  while(black>2){
    print(" "*white)
    print("+"+" "*(black-2)+"+")
    print(" "*white)
    println()
    white +=1
    black -=2
  }
  println(" "*white + "+" + " "*white)
}
diamond2(20)



































