object OccurenceCount {

  // Complete the matchingStrings function below.
  def matchingStrings(strings: Array[String], queries: Array[String]): Array[Int] = {

    val inputMap = mutable.Map[String, Int]()

    for(str <- strings){
      if (inputMap.contains(str)) inputMap(str) += 1 else inputMap += (str -> 1)
    }

    var result = ArrayBuffer[Int]()
    for(query <- queries) if (inputMap.contains(query)) result += inputMap(query) else result += 0

    result.toArray
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(System.out)

    val stringsCount = stdin.readLine.trim.toInt

    val strings = Array.ofDim[String](stringsCount)

    for (i <- 0 until stringsCount) {
      val stringsItem = stdin.readLine
      strings(i) = stringsItem}

    val queriesCount = stdin.readLine.trim.toInt

    val queries = Array.ofDim[String](queriesCount)

    for (i <- 0 until queriesCount) {
      val queriesItem = stdin.readLine
      queries(i) = queriesItem}

    val res = matchingStrings(strings, queries)

    printWriter.println(res.mkString("\n"))

    printWriter.close()
  }
}
