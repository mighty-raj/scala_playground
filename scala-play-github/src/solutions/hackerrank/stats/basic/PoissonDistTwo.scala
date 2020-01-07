package solutions.hackerrank.stats.basic

import solutions.hackerrank.stats.basic.DistributionsCommon._

/**
  * Hacker Rank Prob @ https://www.hackerrank.com/challenges/s10-poisson-distribution-2/problem
  * Tutorail @ https://www.hackerrank.com/challenges/s10-poisson-distribution-1/tutorial
  */
object PoissonDistTwo {

  def main(args: Array[String]): Unit =  {

    val stdin = scala.io.StdIn
    val inpArray = stdin.readLine().split(" ").map(_.toDouble)

    val lambdaA = inpArray(0)
    val lambdaB = inpArray(1)

    val aSqr = lambdaA + Math.pow(lambdaA, 2)
    val bSqr = lambdaB + Math.pow(lambdaB, 2)

    val expCostA= 160 + 40*aSqr
    val expCostB= 128 + 40*bSqr

    println(scaletoDecimalPlaces(expCostA,3))
    println(scaletoDecimalPlaces(expCostB,3))

  }

}
