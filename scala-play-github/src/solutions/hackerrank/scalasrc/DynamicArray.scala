package solutions.hackerrank.scalasrc

import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.collection.parallel.immutable._
import scala.collection.parallel.mutable._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

import scala.util.control.Breaks._

object DynamicArray {

  /*
   * Complete the 'dynamicArray' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts following parameters:
   *  1. INTEGER n
   *  2. 2D_INTEGER_ARRAY queries
   */

  def dynamicArray(n: Int, queries: Array[Array[Int]]): Array[Int] = {
    // Write your code here
    var finalLastAnswers = new ArrayBuffer[Int]()
    var lastAnswer = 0

    var narrays = new Array[ArrayBuffer[Int]](n)

    for (i <- 0 until narrays.length){
      narrays(i) = new ArrayBuffer[Int]()
    }

    for (i <- 0 until queries.length) {

      if (queries(i)(0) == 1) {

        val seq = (((queries(i)(1)) ^ lastAnswer) % n)
        var tempArr = narrays(seq)
        tempArr.append(queries(i)(2))

        narrays(((queries(i)(1)) ^ lastAnswer) % n) = tempArr
      }

      if (queries(i)(0) == 2) {
        val seq = (((queries(i)(1)) ^ lastAnswer) % n)
        val idx = (queries(i)(2)) % narrays(seq).size

        lastAnswer = narrays(seq)(idx)
        finalLastAnswers += lastAnswer
      }

    }

    finalLastAnswers.toArray
  }

}

object Dyna {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(System.out)

    val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val n = firstMultipleInput(0).toInt

    val q = firstMultipleInput(1).toInt

    val queries = Array.ofDim[Int](q, 3)

    for (i <- 0 until q) {
      queries(i) = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    }

    val result = DynamicArray.dynamicArray(n, queries)

    printWriter.println(result.mkString("\n"))

    printWriter.close()
  }
}
