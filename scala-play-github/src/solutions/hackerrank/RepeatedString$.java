/**
  * HackerRank problem @ https://www.hackerrank.com/challenges/repeated-string/problem
  */
object RepeatedString {

  /** Complete the repeatedString function below.
    *
    * @param s: a string to repeat - assumed to be repeated infinite times
    * @param n: the number of characters to consider
    * @return
    */
  def repeatedString(s: String, n: Long): Long = {

    val inpLen = s.length

    val mod = (n % inpLen)
    val div = Math.floor(n/inpLen).toLong

    val aCount = s.count(_ == 'a')

    var finalACount: Long = 0L

    finalACount = div * aCount

    if ( mod>0 )  finalACount += s.substring(0, mod.toInt).toCharArray.count(_ == 'a')

    finalACount

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(System.out)

    val s = stdin.readLine

    val n = stdin.readLine.trim.toLong

    val result = repeatedString(s, n)

    printWriter.println(result)

    printWriter.close()
  }
}
