/**
  * HackerRank Problem @ https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
  */
object JumpingClouds {

  /** Complete the jumpingOnClouds function below.
    *
    * @param c: binary array representing 0 for cumulus clouds & 1 for thunderheads
    * @return returns, minimum no.of jumps required to reach destnation
    */
  def jumpingOnClouds(c: Array[Int]): Int = {

    var jumps, zeros, ones = 0

    for (cloud <- c)
      if (cloud == 0) zeros += 1 else {
//        ones += 1
        jumps += 1 + Math.floor(zeros/2).toInt
        zeros = 0
      }

    jumps += Math.floor(zeros/2).toInt

    jumps.toInt

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(System.out)

    val n = stdin.readLine.trim.toInt

    val c = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = jumpingOnClouds(c)

    printWriter.println(result)

    printWriter.close()
  }
}
