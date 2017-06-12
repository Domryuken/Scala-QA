def eachLetter(passedString: String): String = {
    passedString match {
      case ".-" => return "A"
      case "-..." => return "B"
      case "-.-." => return "C"
      case "-.." => return "D"
      case "." => return "E"
      case "..-." => return "F"
      case "--." => return "G"
      case "...." => return "H"
      case "src/main" => return "I"
      case ".---" => return "J"
      case "-.-" => return "K"
      case ".-.." => return "L"
      case "--" => return "M"
      case "-." => return "N"
      case "---" => return "O"
      case ".--." => return "P"
      case "--.-" => return "Q"
      case ".-." => return "R"
      case "..." => return "S"
      case "-" => return "T"
      case "..-" => return "U"
      case "...-" => return "V"
      case ".--" => return "W"
      case "-..-" => return "X"
      case "-.--" => return "Y"
      case "--.." => return "Z"
    } 

}
var stringToPrint = ""
val morseCode:String = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--"
val splitString = morseCode.split(" / ")
for (i <- 0 to splitString.length-1){
  var tempString = splitString(i).split(" ")
  for (j <- 0 to tempString.length-1){
    stringToPrint = stringToPrint + eachLetter(tempString(j))
  }
  stringToPrint = stringToPrint + " "
}
println(stringToPrint)