package solutions.hackerrank.stats.basic

import scala.io.StdIn

/**
  * HackerRank @ https://www.hackerrank.com/challenges/s10-quartiles/problem
  */
object Quartiles {

  def main(args: Array[String]): Unit = {

    val n = StdIn.readLine().toInt
    val inpArray = StdIn.readLine().split(" ").map(_.toInt)
    val sortedArr = inpArray.sortWith(_ < _)
//    println(sortedArr.mkString(" "))

    var Q1eIdx = 0
    var Q3stIdx = 0

    if(n%2 != 0) {
       Q1eIdx = (n/2)-1
       Q3stIdx = (n/2)+1
    } else {
       Q1eIdx = ((n-1)/2)
       Q3stIdx = (n/2)
    }

    println(median(sortedArr, 0, Q1eIdx))
    println(median(sortedArr, 0, n-1))
    println(median(sortedArr, Q3stIdx, n-1))

  }

  def median(inpArr: Array[Int], stIdx: Int, eIdx: Int) = {


    val len = eIdx - stIdx + 1

//    println(stIdx, eIdx, len, len%2, len/2)

    if (len%2 != 0) inpArr(stIdx + len/2)
    else
      (((inpArr(stIdx + ((len-1)/2)) + inpArr(stIdx + ((len)/2))) / 2))

  }

}
