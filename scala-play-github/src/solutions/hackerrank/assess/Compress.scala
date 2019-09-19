package solutions.hackerrank.assess

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
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

import scala.util.control.Breaks._

/**
  * compress word: HackerRank problem
  */
object Compress {
  /**
    * This function uses regex expression to compress given input string
    *
    * @param word - input word
    * @param K - specifies K num of consecutive chars
    * @return returns string after compressing consecutive chars
    */
  def compressWord(word: String, K: Int): String = {
    // Write your code here

//    val regx = "(c)\\1{3,}"
//    val regx = "(.)\\1+"
    val regx = "(.)\\1{" + (K-1) + ",}"

    var curWord = word
    var prevWord = word

    breakable {

      while(true){

        curWord = prevWord.replaceAll(regx, "")

        if(curWord == prevWord) break()
        prevWord = curWord

      }

    }

    curWord

  }

}

object TestCompress {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(System.out)

    val word = StdIn.readLine

    val K = StdIn.readLine.trim.toInt

    val result = Compress.compressWord(word, K)

    printWriter.println(result)

    printWriter.close()
  }
}
