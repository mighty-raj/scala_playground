import java.util.concurrent.TimeUnit

import scala.collection.mutable.{ArrayBuffer, Map}
import scala.io.StdIn.{readInt, readLine}

import scala.io.Source.stdin

object MemorizeMeHack {

  def main(args: Array[String]): Unit = {

    var inpLen = readInt()
    var inp = readLine().split(" ").map(_.toInt)

    val numQueries = readInt()
    val queryList = Array.fill(numQueries)(readInt())

    var numsMap = Map[Int, Int]()
    for (i <- inp) if (numsMap.contains(i)) numsMap(i) = numsMap(i) + 1 else numsMap += (i -> 1)

    for(i <- queryList) if (numsMap.contains(i)) println(numsMap(i)) else println("NOT PRESENT")

  }


}
