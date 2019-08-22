import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

import scala.collection.mutable.ArrayBuffer

/**
  * HackerRank Problem: https://www.hackerrank.com/challenges/counting-valleys/problem
  */
object ValleyCounts {

  /** Complete the countingValleys function below.
    *
    * @param n length of input array Ex: 8
    * @param s String representing path of hike Ex: UDDDUDUU
    * @return Based on the input string, should return no.of valleys from sea level
    */
  def countingValleys(n: Int, s: String): Int = {

    var seaLevel = 0
    var valleys = 0

    val chars = s.toCharArray

    var upsteps, downsteps = 0

    for (i <- 0 until chars.length) {
//      println("Valleys: " + valleys)

      if (chars(i) == 'U') {

        upsteps += 1

        if ( i>0 )
        if(chars(i-1) != 'U') {

          val seaLvlPrev = seaLevel
          seaLevel -= downsteps

//          println("sealevel: " + seaLevel)
          downsteps = 0

          if ((seaLvlPrev >= 0) && (seaLevel < 0)) valleys += 1
        }

      } else { /* Else block to execute when observed D */

        downsteps += 1

        if ( i>0 )
        if (chars(i-1) != 'D') {
          seaLevel += upsteps

//          println("sealevel: " + seaLevel)
          upsteps = 0
        }

      }

    }

    if (downsteps > 0) {
//      println("sealevel: " + seaLevel)

      val seaLvlPrev = seaLevel
      seaLevel -= downsteps

      if ((seaLvlPrev >= 0) && (seaLevel < 0)) valleys += 1
    }


    valleys

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(System.out)

    val n = stdin.readLine.trim.toInt

    val s = stdin.readLine

    val result = countingValleys(n, s)

    printWriter.println(result)

    printWriter.close()
  }
}
