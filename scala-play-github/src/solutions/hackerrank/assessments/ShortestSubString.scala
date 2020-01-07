package solutions.hackerrank.assessments

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

object ShortestSubString {

  /*
   * Complete the 'shortestSubstring' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts STRING s as parameter.
   */

  def shortestSubstring(s: String): Int = {
    // Write your code here

    val inpStrLen = s.length
    val inpSet = s.toSet
    val size = inpSet.size

    var best = 0

    for(i <- 0 until (inpStrLen-size)){

      val substr = s.substring(i, i+size)
      val subStrSet = substr.toSet

      val intersectSet = inpSet.intersect(subStrSet)

      if(intersectSet.size == size){
        if (best < substr.length) best = substr.length
      }

    }

    best

  }

}

object TestSubString {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(System.out)

    val s = StdIn.readLine

    val result = ShortestSubString.shortestSubstring(s)

    printWriter.println(result)

    printWriter.close()
  }
}
