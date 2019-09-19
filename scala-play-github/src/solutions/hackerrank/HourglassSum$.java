object HourglassSum {

  // Complete the hourglassSum function below.
  def hourglassSum(arr: Array[Array[Int]]): Int = {

    var max = Int.MinValue
    for(i <- 0 to 3){
      for (j <- 0 to 3) {
        val x =
          arr(i)(j) + arr(i)(j+1) + arr(i)(j+2) +
          arr(i+1)(j+1) +
          arr(i+2)(j) + arr(i+2)(j+1) + arr(i+2)(j+2)

        if (x>max) max = x
      }

    }

    max

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(System.out)

    val arr = Array.ofDim[Int](6, 6)

    for (i <- 0 until 6) {
      arr(i) = stdin.readLine.split(" ").map(_.trim.toInt)
    }

    val result = hourglassSum(arr)

    printWriter.println(result)

    printWriter.close()
  }
}
