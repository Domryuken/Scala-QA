
//{{{{{ C U R L Y B O Y S }}}}}
def calculate (n1:Int,n2:Int,n3:Int): Any = {
  if(n2+n3==n1)println(s"$n2 + $n3 = $n1")
  if(n2-n3==n1)println(s"$n2 - $n3 = $n1")
  if(n3-n2==n1)println(s"$n3 - $n2 = $n1")
  if(n2*n3==n1)println(s"$n2 * $n3 = $n1")
  if(n2/n3==n1)println(s"$n2 / $n3 = $n1")
  if(n3/n2==n1)println(s"$n3 / $n2 = $n1")
}

//{{{{{ C U R L Y B O Y S }}}}}
def runner (n1:Int,n2:Int,n3:Int): Any = {
  calculate(n1,n2,n3)
  calculate(n2,n1,n3)
  calculate(n3,n2,n1)
}

//{{{{{ C U R L Y B O Y S }}}}}
runner(9,12,108)
