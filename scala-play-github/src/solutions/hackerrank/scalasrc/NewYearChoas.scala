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

object NewYearChoas {

  // Complete the minimumBribes function below.
  def minimumBribes(q: Array[Int]) {

    var bribes = 0
    var chaotic = false

    for (i <- 0 until q.length) {

      val person = q(i)
      val actualPos = person - 1
      val currentPos = i


      breakable {
        if (actualPos != currentPos) {

          val diff = actualPos - currentPos

          if (diff <= 0) break

          if (diff > 2) chaotic = true

          if (diff <= 2) bribes += diff

        }

      }

    }

    if (chaotic) println("Too chaotic") else println(bribes)

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val t = stdin.readLine.trim.toInt

    for (tItr <- 1 to t) {
      val n = stdin.readLine.trim.toInt

      val q = stdin.readLine.split(" ").map(_.trim.toInt)
      minimumBribes(q)
    }
  }
}
