package solutions.hackerrank.stats.basic

/**
  * https://www.hackerrank.com/challenges/s10-weighted-mean/problem
  */
object WeightedMean {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    val stdin = scala.io.StdIn
    val n = stdin.readLine.trim.toInt
    val inpArray = stdin.readLine.split(" ").map(_.trim.toInt)
    val weightArray = stdin.readLine.split(" ").map(_.trim.toInt)

    println(weightedMean(inpArray, weightArray, n))
  }

  def weightedMean(inpArr: Array[Int], wtArr: Array[Int], len: Int) = {

    val sumOfWeights = wtArr.sum
    var wDotX = 0

    for( i <- 0 until len){
      wDotX += wtArr(i)*inpArr(i)
    }

    ((wDotX.toDouble/sumOfWeights) * 10).round / 10.toDouble

  }
}

