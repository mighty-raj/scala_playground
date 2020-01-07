package solutions.hackerrank.assessments

import scala.collection.mutable.PriorityQueue


object ArrayTrip {

  def main(args: Array[String]): Unit = {

    println(arrayTrip(Array(3,4,-2,1,2), 2))
//    println(arrayTrip(Array(0,-3,-2,-5,-7,1), 3))

//    (1 until 2).foreach(println)

  }

  def arrayTrip(arr: Array[Int], k: Int): Long = {

    val arrLen = arr.length
    var prevSum = arr(0)

    var i = 1
    while (i < arrLen){
//      val pq = PriorityQueue[(Int, Int)]()(Ordering.by(ascendingOrder))
      val pq = PriorityQueue[(Int, Int)]()

      println("Queue size Before loop: " + pq.size)

      for( j <- 1 to k){
        if ((i+j) < arrLen){
          val curSum = prevSum + arr(i+j)
          println("cursum: " + curSum)
          pq += Tuple2(curSum, i+j)
        }

      }

      println("Queue size After loop: " + pq.size)

      val minEl = pq.dequeue()

      println(minEl)

      i = i + minEl._2

      println("i: " + i)
      prevSum = minEl._1
      println("prevSum: " + prevSum)

     }

    prevSum

  }

}
