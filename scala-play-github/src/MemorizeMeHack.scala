import java.util.concurrent.TimeUnit
import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn.{readInt, readLine}

object MemorizeMeHack {

  def main(args: Array[String]): Unit = {

    var inpLen = readInt()
    var inp = readLine().split(" ").map(_.toInt)

    val numQueries = readInt()
    var queryList = new ArrayBuffer[Int]

    var numsMap = scala.collection.mutable.Map[Int, Int]()
    for (i <- inp) if (numsMap.contains(i)) numsMap(i) = numsMap(i) + 1 else numsMap += (i -> 1)

    for (x <- io.Source.stdin.getLines) {
      val i = x.toInt
      if (numsMap.contains(i)) println(numsMap(i)) else println("NOT PRESENT")
    }

  }

}
