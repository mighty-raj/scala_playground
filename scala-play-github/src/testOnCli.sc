import scala.collection.mutable.ArrayBuffer

var maptest = scala.collection.mutable.Map[Int, Int]()
maptest += (1 -> 10)

maptest(1)
if (maptest.contains(1)) println(maptest(1)) else println("not found")

var inp = new ArrayBuffer[Int]()
inp.size

var narrays = new Array[ArrayBuffer[Int]](3)
