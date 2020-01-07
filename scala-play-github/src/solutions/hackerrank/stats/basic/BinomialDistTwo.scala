package solutions.hackerrank.stats.basic

import solutions.hackerrank.stats.basic.DistributionsCommon._

object BinomialDistTwo {

  /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution*/
  def main(args: Array[String]): Unit = {

    val stdin = scala.io.StdIn
    val inpArray = stdin.readLine().split(" ").map(_.toInt)

    val (prob, trials) = (inpArray(0).toDouble/100, inpArray(1))

//    println(prob, trials)

    val loeq2 = 0 to 2
    val goeq2 = 2 to 10

    val leq2rej = (loeq2.map(binProbOfX(_, trials, prob)).sum)
    val geq2rej = (goeq2.map(binProbOfX(_, trials, prob)).sum)

    println(scaletoDecimalPlaces(leq2rej,3))
    println(scaletoDecimalPlaces(geq2rej,3))

  }

}
