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

object ArrayManipulation {

  // Complete the arrayManipulation function below.
  def arrayManipulation(n: Int, queries: Array[Array[Int]]): Long = {

    val arr = Array.fill(n)(0)
    var max = Int.MinValue

    var cum_sum_intrsction = 0

    for(i <- 0 until queries.length) {

      val st = queries(i)(0) - 1
      val end = queries(i)(1)

      for (j <- st until end) {
        arr(j) += queries(i)(2)
        if (arr(j) > max) max = arr(j)
      }
      println(arr.mkString(" "))
    }

    max

  }

  def arrayManipulation_optimal(n: Int, queries: Array[Array[Int]]): Long = {

    val diffArr = Array.fill(n+1)(0)

    for(query <- queries){
      val lower = query(0)
      val upper = query(1)
      val sum = query(2)

      diffArr(lower-1) += sum
      if (upper < diffArr.length ) diffArr(upper) -= sum
      //      diffArr(upper+1) -= sum
    }

    var max = Int.MinValue
    var sum = 0
    for(i <- 0 until diffArr.length) {
      sum += diffArr(i)

      max = Math.max(max, sum)
    }

    max

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(System.out)

    val nm = stdin.readLine.split(" ")

    val n = nm(0).trim.toInt

    val m = nm(1).trim.toInt

    val queries = Array.ofDim[Int](m, 3)

    for (i <- 0 until m) {
      queries(i) = stdin.readLine.split(" ").map(_.trim.toInt)
    }

    //    val result = arrayManipulation(n, queries)
    val result = arrayManipulation_optimal(n, queries)

    printWriter.println(result)
    printWriter.close()
  }
}

