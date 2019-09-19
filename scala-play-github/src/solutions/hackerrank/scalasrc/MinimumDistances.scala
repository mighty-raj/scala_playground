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
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

import scala.util.control.Breaks._

/**
  *
  */
object MinimumDistances {

  // Complete the minimumDistances function below.
  def minimumDistances(a: Array[Int]): Int = {

    val arrSize = a.length
    var localMap = collection.mutable.Map[Int, ArrayBuffer[Int]]()

    var minDist = Int.MaxValue

    for( i <- 0 until arrSize ) if (localMap.contains(a(i))) localMap(a(i)) += i else localMap += (a(i) -> ArrayBuffer(i))

    localMap.values.foreach(x => if(x.length ==2) minDist = Math.min(Math.abs(x(0) - x(1)), minDist))

    if (minDist != Int.MaxValue) minDist else -1

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(System.out)

    val n = stdin.readLine.trim.toInt

    val a = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = minimumDistances(a)

    printWriter.println(result)
    printWriter.close()

  }
}
