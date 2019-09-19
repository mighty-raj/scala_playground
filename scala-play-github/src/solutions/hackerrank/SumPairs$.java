object SumPairs {

  def main(args : Array[String]): Unit = {

    val stdIn = scala.io.StdIn
    val sum = stdIn.readInt()
    val inp = stdIn.readLine.split(" ").map(_.toInt)

    sumofpairs(inp, sum)

  }

  /**
    *
    * @param a - Input Array
    * @param sum - sum amout a pair in input should equal to
    */
  def sumofpairs(a: Array[Int], sum: Int): Unit = {

    val b= a.sortWith( _ < _)

    println(b.mkString(" "))

    var low = 0
    var high = a.length - 1

    while( low < high){
      val paired = b(low) + b(high)

      if(paired == sum)
        println("("+b(low) + "," + b(high) + ")")

      if(paired > sum) high -= 1
      else low += 1

    }

  }

}
