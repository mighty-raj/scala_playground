package solutions.hackerrank.stats.basic

import solutions.hackerrank.stats.basic.DistributionsCommon._
/**
  * Hacker Rank prob @ https://www.hackerrank.com/challenges/s10-normal-distribution-1/problem
  * Tutorial @  https://www.hackerrank.com/challenges/s10-normal-distribution-1/tutorial
  */
object NormalDistOne {

  def main(args: Array[String]): Unit = {

    val stdin = scala.io.StdIn
    val inpArray = stdin.readLine().split(" ").map(_.toInt)

    val mean = inpArray(0)
    val sdev = inpArray(1)

    val X = stdin.readDouble()
    val q2Array = stdin.readLine().split(" ").map(_.toInt)

    val (x1, x2) = (q2Array(0), q2Array(1))

    val tmp = normalDistProbOfX(x2, mean, sdev) - normalDistProbOfX(x1, mean, sdev)

    println(scaletoDecimalPlaces(normalDistProbOfX(X, mean, sdev), 3))
    println(scaletoDecimalPlaces(tmp, 3))

    println(integrate(0d, ((X-mean)/(sdev * Math.sqrt(2))), 100000))



  }

}
