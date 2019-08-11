import scala.collection.mutable.ListBuffer

object MemorizeMe {

  def main(args: Array[String]): Unit = {

    val stdin = scala.io.StdIn

    val inpLen = stdin.readLine()
    val inp = stdin.readLine().split(" ").map(_.toInt)

    val numQueries = stdin.readLine().toInt
    var queryList = new ListBuffer[Int]

    for (i <- 1 to numQueries) {
      queryList += stdin.readLine().toInt

    }

    queryList.toList

    for(i <- queryList) {
      val result = frequencyCountFromMemory(inp, i)

      if (result == 0) println("NOT PRESENT") else println(result)
    }

  }

  def frequencyCountFromMemory(inpArray: Array[Int], qNum: Int): Int = {

    var freqCtr = 0
    for (i <- inpArray) {
      if (i == qNum) freqCtr += 1
    }

    freqCtr

  }


}
