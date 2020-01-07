package solutions.hackerrank.stats.basic

import solutions.hackerrank.stats.basic.DistributionsCommon._

/**
  * HackerRank prob @ https://www.hackerrank.com/challenges/s10-poisson-distribution-1/problem
  * Tutorial @ https://www.hackerrank.com/challenges/s10-poisson-distribution-1/tutorial
  */
object PoissonDistOne {

  /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution*/
  def main(args: Array[String]) = {

    val stdin = scala.io.StdIn
    val inpLamda = stdin.readDouble()
    val inpK = stdin.readInt()

    println(scaletoDecimalPlaces(poissonDistofX(inpK, inpLamda),3))

  }

}
