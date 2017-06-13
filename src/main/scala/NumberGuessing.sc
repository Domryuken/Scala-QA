import scala.io.StdIn

val test = true

def guess(number:Int, highest:Int, lowest:Int): Int = {

  var correct = Console.readInt == 1
  if(correct){
    number
  }else{
    var isHigher = Console.readInt == 1
    if(isHigher)
        guess( ((number+highest)/2), highest, number+1 )
    else
        guess( ((number+lowest)/2), number-1, lowest )
  }

}
guess(50, 100,1)


