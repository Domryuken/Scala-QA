package DifferentPackagesForJames

import scala.collection.mutable.ArrayBuffer

//  { { { { JAMES STOP STEALING MY FILES } } } }
case class Part(name: String, cost:Double, var isFixed:Boolean){
  def setFixed(state:Boolean): Unit ={
    isFixed = state
  }
}

//  { { { { JAMES STOP STEALING MY FILES } } } }
object Part {

  //  { { { { JAMES STOP STEALING MY FILES } } } }
  @throws(classOf[IllegalArgumentException])
  def create(name: String, isFixed:Boolean): Part = name match{
    case "part1" => Part("Part1",11.00,isFixed)
    case "part2" => Part("Part2",12.00,isFixed)
    case "part3" => Part("Part3",13.00,isFixed)
    case "part4" => Part("Part4",14.00,isFixed)
    case "part5" => Part("Part5",15.00,isFixed)
    case "part6" => Part("Part6",16.00,isFixed)
    case "part7" => Part("Part7",17.00,isFixed)
    case "part8" => Part("Part8",18.00,isFixed)
    case "part9" => Part("Part9",19.00,isFixed)
    case "part10" => Part("Part10",20.00,isFixed)
    case "part11" => Part("Part11",21.00,isFixed)
    case "part12" => Part("Part12",22.00,isFixed)
    case "part13" => Part("Part13",23.00,isFixed)
    case "part14" => Part("Part14",24.00,isFixed)
    case "part15" => Part("Part15",25.00,isFixed)
    case _ => throw new IllegalArgumentException
  }

  //  { { { { JAMES STOP STEALING MY FILES } } } }
  def createSet(): ArrayBuffer[Part] = {
    var parts = new ArrayBuffer[Part]
    parts += create("part1",math.random() > 0.25)
    parts += create("part2",math.random() > 0.25)
    parts += create("part3",math.random() > 0.25)
    parts += create("part4",math.random() > 0.25)
    parts += create("part5",math.random() > 0.25)
    parts += create("part6",math.random() > 0.25)
    parts += create("part7",math.random() > 0.25)
    parts += create("part8",math.random() > 0.25)
    parts += create("part9",math.random() > 0.25)
    parts += create("part10",math.random() > 0.25)
    parts += create("part11",math.random() > 0.25)
    parts += create("part12",math.random() > 0.25)
    parts += create("part13",math.random() > 0.25)
    parts += create("part14",math.random() > 0.25)
    parts += create("part15",math.random() > 0.25)
  }
}
