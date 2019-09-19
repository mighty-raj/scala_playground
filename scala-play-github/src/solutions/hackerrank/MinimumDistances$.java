/**
  *
  */
object MinimumDistances {

  // Complete the minimumDistances function below.
  def minimumDistances(a: Array[Int]): Int = {

    val arrSize = a.length
    var localMap = Map[Int, ArrayBuffer[Int]]()

    var minDist = Int.MaxValue

    for( i <- 0 until arrSize ) if (localMap.contains(a(i))) localMap(a(i)) += i else localMap += (a(i) -> ArrayBuffer(i))

    localMap.values.foreach(x => if(x.length ==2) minDist = Math.min(Math.abs(x(0) - x(1)), minDist))

    if (minDist != Int.MaxValue) minDist else -1

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(System.out)

    val n = stdin.readLine.trim.toInt

    val a = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = minimumDistances(a)

    printWriter.println(result)
    printWriter.close()

  }
}
