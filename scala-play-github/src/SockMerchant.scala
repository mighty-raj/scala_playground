import java.io._

import scala.collection.mutable
import util._


object SockMerchant {

  def main(args: Array[String]): Unit = {

    val stdin = scala.io.StdIn
//    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt
    val inpArray = stdin.readLine.split(" ").map(_.trim.toInt)

    val pairs = sockPairs(n, inpArray )

    println(s"Num of socks pairs: $pairs")


  }

  def sockPairs(len: Int, inp: Array[Int]): Int = {

    var sockMap: mutable.HashMap[Int, Int] = mutable.HashMap.empty[Int, Int]

//    inp.foreach(_)

    0

  }

}
