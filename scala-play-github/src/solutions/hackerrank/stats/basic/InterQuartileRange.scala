package solutions.hackerrank.stats.basic

import scala.io.StdIn

/**
  * HackerRank @ https://www.hackerrank.com/challenges/s10-interquartile-range/problem
  */
object InterQuartileRange {

  def main(args: Array[String]) = {

    val stdIn = scala.io.StdIn
    val len = stdIn.readLine.trim.toInt
    val inpArray = stdIn.readLine().split(" ").map(_.toInt)
    val freqArray = stdIn.readLine().split(" ").map(_.toInt)

    var cnctInpArray = List[Int]()

    for ( i <- 0 until len){
      cnctInpArray = cnctInpArray ++ List.fill(freqArray(i))(inpArray(i))
    }

    val sortedInpArray = cnctInpArray.sortWith(_ < _).toArray

//    println(cnctInpArray.mkString(" "))
//    println(sortedInpArray.mkString(" "))

    val n = sortedInpArray.length
    var Q1eIdx = 0
    var Q3stIdx = 0

    if(n%2 != 0) {
      Q1eIdx = (n/2)-1
      Q3stIdx = (n/2)+1
    } else {
      Q1eIdx = ((n-1)/2)
      Q3stIdx = (n/2)
    }

    val q1 = median(sortedInpArray, 0, Q1eIdx)
    val q3 = median(sortedInpArray, Q3stIdx, n-1)

    println(q3 - q1)

  }

  def median(inpArr: Array[Int], stIdx: Int, eIdx: Int) = {


    val len = eIdx - stIdx + 1

    //    println(stIdx, eIdx, len, len%2, len/2)

    if (len%2 != 0) (inpArr(stIdx + len/2).toDouble * 10).round / 10.toDouble
    else
      (((inpArr(stIdx + ((len-1)/2)) + inpArr(stIdx + ((len)/2))) / 2.0) * 10).round / 10.toDouble

  }

}
