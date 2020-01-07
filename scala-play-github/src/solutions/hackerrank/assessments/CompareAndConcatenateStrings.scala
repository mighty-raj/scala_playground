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
//import scala.collection.mutable._
import scala.collection.concurrent._
import scala.collection.parallel.immutable._
import scala.collection.parallel.mutable._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._
import scala.collection.immutable.ListMap

object Result {

  /*
   * Complete the 'compareStrings' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts following parameters:
   *  1. STRING firstString
   *  2. STRING secondString
   *  3. STRING thirdString
   */

  def compareStrings(firstString: String, secondString: String, thirdString: String): String = {


    // Write your code here

    val mapSort = scala.collection.immutable.Map(firstString -> 1, secondString -> 1, thirdString -> 1)
    var ot = new StringBuilder("")
    for (x <- ListMap(mapSort.toSeq.sortBy(_._1):_*).keys){

      print(x)
    }

//    print(mapSort)
    ot.toString()

  }

}

object CompareAndConcatenateStrings {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(System.out)

    val firstString = StdIn.readLine

    val secondString = StdIn.readLine

    val thirdString = StdIn.readLine

    val result = Result.compareStrings(firstString, secondString, thirdString)

    printWriter.println(result)

    printWriter.close()
  }
}

