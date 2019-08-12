import java.util.concurrent.TimeUnit

import scala.collection.mutable.{ArrayBuffer, Map}
import scala.io.StdIn.{readInt, readLine}

import scala.io.Source.stdin

object MemorizeMe {

  def main(args: Array[String]): Unit = {

    var inpLen = readInt()
    var inp = readLine().split(" ").map(_.toInt)

    val numQueries = readInt()
    var queryList = new ArrayBuffer[Int]

    var numsMap = Map[Int, Int]()
    time {for (i <- inp) if (numsMap.contains(i)) numsMap(i) = numsMap(i) + 1 else numsMap += (i -> 1)}

    time{for (i <- 1 to numQueries) queryList += readInt()}
    time{for(i <- queryList) if (numsMap.contains(i)) println(numsMap(i)) else println("NOT PRESENT")}

  }

  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block    // call-by-name
    val t1 = System.nanoTime()
    println(TimeUnit.SECONDS.convert((t1 - t0), TimeUnit.NANOSECONDS) + "secs")
    result
  }

}
