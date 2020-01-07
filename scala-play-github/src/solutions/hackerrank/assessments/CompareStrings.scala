package solutions.hackerrank.assessments

object CompareStrings {

  def main(args: Array[String]): Unit = {

    val s1= "hello world"
    val s2= "thank you"

    val s3 = "hi"
    val s4 = "word"


    if (compare(s1, s2) > 0) println(true) else println(false)
    if (compare(s3, s4) > 0) println(true) else println(false)

  }

  def compare(s1: String, s2: String) ={

    val s1CharArray = s1.toCharArray
    val s2CharArray = s2.toCharArray

    (s1CharArray.intersect(s2CharArray).mkString(" ")).length
  }

  def comparewoapi(s1: String, s2:String) = {



  }

}
