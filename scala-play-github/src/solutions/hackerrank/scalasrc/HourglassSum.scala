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

object HourglassSum {

  // Complete the hourglassSum function below.
  def hourglassSum(arr: Array[Array[Int]]): Int = {

    var max = Int.MinValue
    for(i <- 0 to 3){
      for (j <- 0 to 3) {
        val x =
          arr(i)(j) + arr(i)(j+1) + arr(i)(j+2) +
            arr(i+1)(j+1) +
            arr(i+2)(j) + arr(i+2)(j+1) + arr(i+2)(j+2)

        if (x>max) max = x
      }

    }

    max

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(System.out)

    val arr = Array.ofDim[Int](6, 6)

    for (i <- 0 until 6) {
      arr(i) = stdin.readLine.split(" ").map(_.trim.toInt)
    }

    val result = hourglassSum(arr)

    printWriter.println(result)

    printWriter.close()
  }
}
