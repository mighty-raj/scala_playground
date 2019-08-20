import java.io._

import scala.collection.mutable
import util._


object SockMerchant {

  def main(args: Array[String]): Unit = {

    val stdin = scala.io.StdIn
//    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt
    val inpArray = stdin.readLine.split(" ").map(_.trim.toInt)

    val pairs = sockMerchant(n, inpArray )

    println(s"Num of socks pairs: $pairs")


  }


  def sockMerchant(n: Int, ar: Array[Int]): Int = {
    var sockMap: mutable.HashMap[Int, Int] = mutable.HashMap.empty[Int, Int]
    var pairCount = 0

    for(i <- ar)
      if (sockMap.contains(i)) {
        sockMap(i) += 1

        if (sockMap(i) % 2 == 0) pairCount += 1
      }
      else sockMap += (i -> 1)

    pairCount

  }

}
