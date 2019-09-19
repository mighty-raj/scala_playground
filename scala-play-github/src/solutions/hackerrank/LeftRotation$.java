object LeftRotation {

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val nd = stdin.readLine.split(" ")

    val n = nd(0).trim.toInt

    val d = nd(1).trim.toInt

    val a = stdin.readLine.split(" ").map(_.trim.toInt)

//    println(rotated(a,d).mkString(" "))
    println(rotate_fast(a,d).mkString(" "))

  }

  def rotate_fast(a: Array[Int], d: Int): Array[Int] = {

    val len = a.length

    var newArr = new Array[Int](len)

    for( i <- (len - 1) to 0 by -1){
      val diff = i - d

      if (diff >= 0) newArr(diff) = a(i) else newArr(diff + len) = a(i)

    }

    newArr

  }

  def rotated(inpArr: Array[Int], noOfRotations: Int): Array[Int] = {

    val len: Int = inpArr.length -1

    var inp = inpArr

    for(i <- 1 to noOfRotations){

      var newArr = new Array[Int](len+1)
      val ptrFrStart = len

//      println(inp.mkString(" "))

      for ( j <- len to 0 by -1 ){

        if (j == 0)
          newArr(ptrFrStart) = inp(j)
        else{
          newArr(j-1) = inp(j)
        }

      }

      inp = newArr

    }

    inp

  }

}
