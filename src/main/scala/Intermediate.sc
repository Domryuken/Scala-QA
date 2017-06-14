
def blackjack(a:Int,b:Int): Int = {
  0
}

def uniqueSum(a: Int, b:Int, c:Int): Int = {
  if(a==b&&a==c)0
  else if(a==b)c
  else if(a==c)b
  else if(b==c)a
  else a+b+c
}
uniqueSum(5,2,5)


def tooHot(temp:Int, isSummer:Boolean): Boolean = isSummer match{
  case true => temp>=60&&temp<=100
  case false => temp>=60&&temp<=90
}
tooHot(100,false)

