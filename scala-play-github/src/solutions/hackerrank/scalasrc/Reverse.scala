package solutions.hackerrank.scalasrc

import java.io.PrintWriter
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

object Reverse {

  // Complete the reverseArray function below.
  def reverseArray(a: Array[Int]): Array[Int] = {
    a.reverseIterator.toArray
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(System.out)

    val arrCount = stdin.readLine.trim.toInt

    val arr = stdin.readLine.split(" ").map(_.trim.toInt)
    val res = reverseArray(arr)

    printWriter.println(res.mkString(" "))

    printWriter.close()
  }
}
