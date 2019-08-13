import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

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
