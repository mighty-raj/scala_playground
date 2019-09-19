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

object SockMerchant {

  def main(args: Array[String]): Unit = {

    val stdin = scala.io.StdIn
//    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt
    val inpArray = stdin.readLine.split(" ").map(_.trim.toInt)

    val pairs = sockMerchant(n, inpArray )

    println(s"Num of socks pairs: $pairs")


  }

  def sockMerchant(n: Int, ar: Array[Int]): Int = {
    var sockMap: collection.mutable.HashMap[Int, Int] = collection.mutable.HashMap.empty[Int, Int]
    var pairCount = 0

    for(i <- ar)
      if (sockMap.contains(i)) {
        sockMap(i) += 1

        if (sockMap(i) % 2 == 0) pairCount += 1
      }
      else sockMap += (i -> 1)

    pairCount

  }

}
