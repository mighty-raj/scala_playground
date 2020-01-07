package solutions.hackerrank.stats.basic

import solutions.hackerrank.stats.basic.DistributionsCommon._

/**
  * HackerRank Prob @ https://www.hackerrank.com/challenges/s10-geometric-distribution-2/problem
  * Tutorial @ https://www.hackerrank.com/challenges/s10-geometric-distribution-1/tutorial
  */
object GeoDistTwo {

  def main(args: Array[String]): Unit = {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution*/
    val stdin = scala.io.StdIn
    val probArray = stdin.readLine().split(" ").map(_.toInt)
    val n = stdin.readInt()
    val prob = probArray(0)/probArray(1).toDouble
    val inpRange = 1 to n
    val geoDistProbMap = inpRange.map(geoDistProb(_, prob)).map(scaletoDecimalPlaces(_,3))

    println(scaletoDecimalPlaces(geoDistProbMap.sum,3))

  }

}
