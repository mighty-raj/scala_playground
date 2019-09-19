object MultiLineInput {

  def main(args: Array[String]) = {

    io.Source.stdin.getLines().take(2).map(_.toInt).foreach(println)

//    io.Source.stdin.getLines().

  }

}
