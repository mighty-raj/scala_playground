import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object LeftRotation {

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val nd = stdin.readLine.split(" ")

    val n = nd(0).trim.toInt

    val d = nd(1).trim.toInt

    val a = stdin.readLine.split(" ").map(_.trim.toInt)

    println(a.mkString(" "))
  }
}
