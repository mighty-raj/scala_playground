package solutions.hackerrank.stats.basic

import solutions.hackerrank.stats.basic.DistributionsCommon._

object BinomialDistOne {

  def main(args : Array[String]): Unit = {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution*/

    val stdIn = scala.io.StdIn

    val inpArr = stdIn.readLine().split(" ").map(_.toDouble)
    val (boy, girl) = (inpArr(0), inpArr(1))

    val probOfBoy = boy/(boy+girl)

//    println(probOfBoy)

    val n = 6

    val atleastThree = binProbOfX(3, n, probOfBoy) + binProbOfX(4, n, probOfBoy) + binProbOfX(5, n, probOfBoy) + binProbOfX(6, n, probOfBoy)

    println(scaletoDecimalPlaces(atleastThree,3))


  }

/*
  def binProbOfX(x: Int, n: Int, p: Double) = {

//    (n x) p pow x and (1-p) pow (n-x)

    ((factorial(n)/(factorial(x)*factorial(n-x))) * Math.pow(p, x) * Math.pow((1-p), (n-x)) * 1000).round / 1000.toDouble

  }

  def factorial(n: Int):Int = n match {
    case 0 => 1
    case _ => n * factorial(n-1)
  }
*/

}
