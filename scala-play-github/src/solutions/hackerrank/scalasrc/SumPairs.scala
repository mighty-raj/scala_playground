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

object SumPairs {

  def main(args : Array[String]): Unit = {

    val stdIn = scala.io.StdIn
    val sum = stdIn.readInt()
    val inp = stdIn.readLine.split(" ").map(_.toInt)

    sumofpairs(inp, sum)

  }

  /**
    *
    * @param a - Input Array
    * @param sum - sum amout a pair in input should equal to
    */
  def sumofpairs(a: Array[Int], sum: Int): Unit = {

    val b= a.sortWith( _ < _)

    println(b.mkString(" "))

    var low = 0
    var high = a.length - 1

    while( low < high){
      val paired = b(low) + b(high)

      if(paired == sum)
        println("("+b(low) + "," + b(high) + ")")

      if(paired > sum) high -= 1
      else low += 1

    }

  }

}
