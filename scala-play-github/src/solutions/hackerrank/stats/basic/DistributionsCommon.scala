package solutions.hackerrank.stats.basic


/**
  * Tutorial @ https://www.hackerrank.com/challenges/s10-geometric-distribution-1/tutorial
  */
object DistributionsCommon {


  /**
    * returns factorial of a number
    * @param n
    * @return
    */
  def factorial(n: Int):Int = n match {
    case 0 => 1
    case _ => n * factorial(n-1)
  }

  /**
    * Scales given double value to X places
    * @param inp input double value
    * @param places expected no.of decimal places after point
    * @return
    */
  def scaletoDecimalPlaces(inp: Double, places: Int) = (inp * Math.pow(10, places)).round / Math.pow(10, places).toDouble


  /**
    * Assumes the question in Data follows Binomial Distribution, https://www.hackerrank.com/challenges/s10-binomial-distribution-1/tutorial
    * @param x no.of successes
    * @param n no.of bernouli trials
    * @param p probability of observing success for a single trial
    * @return returns probability of observing X successes from 'n' bernouli trials
    */
  def binProbOfX(x: Int, n: Int, p: Double) = ((factorial(n)/(factorial(x)*factorial(n-x))) * Math.pow(p, x) * Math.pow((1-p), (n-x)))

  /**
    * Assumes the question in Data follows Geometric Distribution, https://www.hackerrank.com/challenges/s10-geometric-distribution-1/tutorial
    * Retruns prob of observing a success after a successive failures from bernouli trials
    * @param trials no.of bernouli trials
    * @param prob probability of success
    * @return probability of observing a success after failures
    */
  def geoDistProb(trials: Int, prob: Double) =  (Math.pow((1-prob), (trials-1)) * (prob))


  /**
    * Assumes the question in Data follows Negative Binomial Distribution, https://www.hackerrank.com/challenges/s10-geometric-distribution-1/tutorial
    * @param x no.of successes
    * @param n no.of bernouli trials
    * @param p probability of observing success for a single trial
    * @return returns probability of observing X successes from 'n' bernouli trials
    */
  def negbinProbOfX(x: Int, n: Int, p: Double) = ((factorial(n-1)/(factorial(x-1)*factorial((n-1)-(x-1)))) * Math.pow(p, x) * Math.pow((1-p), (n-x)))


  /**
    * Assumes data follows poission distribution
    * Tutorial @ https://www.hackerrank.com/challenges/s10-poisson-distribution-1/tutorial
    * @param k is the actual number of successes that occur in a specified region.
    * @param lambda is the average number of successes that occur in a specified region
    */
  def poissonDistofX(k: Int, lambda: Double) = ((Math.pow(lambda, k) * Math.pow(Math.E,-lambda))/(factorial(k)))


  def normalDistProbOfX(x: Double, mean: Double, sDev: Double) = {
    val z: Double = ((x-mean)/(sDev * Math.sqrt(2)))
    val temp = erf(z) + 1d
//    println("erf+1 ==> ", temp)

    (1/2d) * temp

  }

  def f_of_x(x: Double)  = {
    import Math._
    val out = pow(Math.E,pow(-x, 2))

//    println("fofx ==> ", out)
    out
  }

  def erf(z: Double): Double = {
    import Math._
    val a=0
    val b=z
    val erf = (2/PI) * ((b - a) * f_of_x((a+b)/2))

//    println("erf ==> ", erf)

    erf

  }

  def f(x: Double) = Math.exp(-x * x/2) / Math.sqrt(2 * Math.PI)

  def integrate(a: Double, b:Double, N: Int) = {
    val h = (b-a)/N   //Step Size
    var sum = 0.5 * (f(a) + f(b))  //Area

      for( i <- 1 to N) {
        var x = a+h * i
        sum += f(x)

    }

    sum * h

  }

}
