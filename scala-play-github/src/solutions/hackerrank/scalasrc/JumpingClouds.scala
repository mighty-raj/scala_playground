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

/**
  * HackerRank Problem @ https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
  */
object JumpingClouds {

  /** Complete the jumpingOnClouds function below.
    *
    * @param c: binary array representing 0 for cumulus clouds & 1 for thunderheads
    * @return returns, minimum no.of jumps required to reach destnation
    */
  def jumpingOnClouds(c: Array[Int]): Int = {

    var jumps, zeros, ones = 0

    for (cloud <- c)
      if (cloud == 0) zeros += 1 else {
//        ones += 1
        jumps += 1 + Math.floor(zeros/2).toInt
        zeros = 0
      }

    jumps += Math.floor(zeros/2).toInt

    jumps.toInt

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(System.out)

    val n = stdin.readLine.trim.toInt

    val c = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = jumpingOnClouds(c)

    printWriter.println(result)

    printWriter.close()
  }
}
