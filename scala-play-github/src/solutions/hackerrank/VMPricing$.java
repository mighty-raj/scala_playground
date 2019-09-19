object VMPricing {

  // Complete the interpolate function below.
  def interpolate(n: Int, quantity: Array[Int], price: Array[Float], qtyCount: Int): Float = {

    var instancePriceMap = Map[Int, Float]()
    for(i <- 0 until qtyCount) {
      instancePriceMap += (quantity(i) -> price(i))
    }

    if (instancePriceMap.contains(n)) instancePriceMap(n) else {

      val sortedMap = TreeMap(instancePriceMap.toSeq:_*)

      val sortedQtyList = sortedMap.keysIterator.toList
      val sortedPrcList = sortedMap.valuesIterator.toList

      val qtyChange: Float = sortedQtyList(qtyCount-1) - sortedQtyList(qtyCount-2)
      val prcChange = sortedPrcList(qtyCount-1) - sortedPrcList(qtyCount-2)

      val jump: Float = (n - sortedQtyList(qtyCount-1)) / qtyChange

      val fnl = jump * prcChange + sortedPrcList(qtyCount-1)

      (fnl)%1.2f

    }

  }

  def main(args: Array[String]) {
    val printWriter = new PrintWriter(System.out)

    val n = StdIn.readLine.trim.toInt

    val quantityCount = StdIn.readLine.trim.toInt

    val quantity = Array.ofDim[Int](quantityCount)

    for (i <- 0 until quantityCount) {
      val quantityItem = StdIn.readLine.trim.toInt
      quantity(i) = quantityItem
    }

    val priceCount = StdIn.readLine.trim.toInt

    val price = Array.ofDim[Float](priceCount)

    for (i <- 0 until priceCount) {
      val priceItem = StdIn.readLine.trim.toFloat
      price(i) = priceItem
    }

    val res = interpolate(n, quantity, price, quantityCount)

    printWriter.println(res)

    printWriter.close()
  }
}
