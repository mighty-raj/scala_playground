package solutions.hackerrank.stats.basic

import scala.collection.immutable.ListMap
import scala.util.Sorting._;

/**
  * HackerRank Problem @ https://www.hackerrank.com/challenges/s10-basic-statistics/problem
  */
object MeanMedianMode {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    val stdin = scala.io.StdIn
    val n = stdin.readLine.trim.toInt
    val inpArray = stdin.readLine.split(" ").map(_.trim.toInt)

    println(mean(inpArray, n))
    println(median(inpArray, n))
    print(mode(inpArray))

  }

  def mean(inpArr: Array[Int], len: Int): Double = {
    var sum = 0
    for (i <- inpArr){
      sum += i
    }

    (((sum.toDouble/len)) * 10).round / 10.toDouble
//    (sum.toDouble/len)

  }

  def median(inpArr: Array[Int], len: Int) = {
    quickSort(inpArr)

    if ((len % 2) != 0) inpArr(len/2).toDouble
    else {
      ((((inpArr((len-1)/2) + inpArr(len/2)) / 2.0).toDouble) * 10).round / 10.toDouble
    }

  }

  def mode(inpArr: Array[Int]) = {
    // create mutable map
    // iterete over map, and update value counts of array

    val countMap = inpArr.groupBy(identity).mapValues(_.size)
    val sortedMap = ListMap(countMap.toSeq.sortWith(_._2 > _._2):_*)
    val invertedMap = sortedMap.groupBy(_._2).mapValues(_.keys)
    invertedMap.head._2.min

  }

}

