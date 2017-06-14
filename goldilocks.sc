def goldilocks(string: String): Unit = {
  val head = string.split("\n").head
  val tail = string.split("\n").tail
  for (i <- 0 until tail.length) {
    if ((tail(i).split(" ")(0).toInt >= head.split(" ")(0).toInt)
      && (tail(i).split(" ")(1).toInt <= head.split(" ")(1).toInt)) {
      println(i + 1)
    }
  }
  println("  _,-\"\"`\"\"-~`)\n(`~_,=========\\\n |---,___.-.__,\\\n |   {    o     \\ ___  _,,,,_     _.--.\n  \\      `^`    /`_.-\"~   {  `~-;`     \\\n   \\_      _  .'                 `,     |\n     |`-      {             {      \\'__/ \n    /     {        {       ,_       \\  `'-. \n   /    .-\"\"~~--.            `\"-,   ;_    /\n  |  {   {       \\     {   {     \\  | `\"\"`\n   \\__.--'`\"-.   /_       {     { |'\n              `\"`  `~~~---..,     |\n CURLYBEAR                   \\ _.-'`-.\n                              \\       \\\n                               '.     /\n                                 `\"~\"`")
}
goldilocks("100 120\n297 90\n66 110\n257 113\n276 191\n280 129\n219 163\n254 193\n86 153\n206 147\n71 137\n104 40\n238 127\n52 146\n129 197\n144 59\n157 124\n210 59\n11 54\n268 119\n261 121\n12 189\n186 108\n174 21\n77 18\n54 90\n174 52\n16 129\n59 181\n290 123\n248 132")