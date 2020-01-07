package solutions.hackerrank.stats.basic

object StdDev {

  def main(args: Array[String]): Unit = {

    val stdIn = scala.io.StdIn
    val n = stdIn.readLine().toInt
    val inpArray = stdIn.readLine().split(" ").map(_.toInt)

    val mean = inpArray.sum.toDouble/n
    println(mean)

    val meanDev = inpArray.map(_-mean).map(Math.pow(_, 2)).sum
    val stdDev = (Math.sqrt(meanDev/n)*10).round / 10.toDouble

    print(stdDev)

  }

}
