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
