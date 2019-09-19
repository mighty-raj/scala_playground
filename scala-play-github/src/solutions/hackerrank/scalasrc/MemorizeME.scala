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


object MemorizeME {

  def main(args: Array[String]): Unit = {

    var inpLen = readInt()
    var inp = readLine().split(" ").map(_.toInt)

    val numQueries = readInt()
    val queryList = Array.fill(numQueries)(readInt())
//    var queryList = new Array[Int](numQueries)

    var numsMap = collection.mutable.Map[Int, Int]()
    time {for (i <- inp) if (numsMap.contains(i)) numsMap(i) = numsMap(i) + 1 else numsMap += (i -> 1)}

//    val queryList = Array.fill(numQueries)(readInt())
//    val queryList = io.Source.stdin.getLines().take(numQueries).map(_.toInt)
//    time {for (i <- 1 to numQueries) queryList(i-1) = readInt()}
    time {for(i <- queryList) if (numsMap.contains(i)) println(numsMap(i)) else println("NOT PRESENT")}

  }

  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block    // call-by-name
    val t1 = System.nanoTime()
    println(TimeUnit.SECONDS.convert((t1 - t0), TimeUnit.NANOSECONDS) + "secs")
    result
  }

}
