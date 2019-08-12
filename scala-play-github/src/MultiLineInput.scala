import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

object MultiLineInput {

  def main(args: Array[String]) = {

    val x: Int = readInt()
    println(x)

    for( i <- 1 to x) {
      val y = readInt()
      println(y)

    }

  }

}
