package functionalprogramming

object TailRecursion {

  def factorial(x: Int, acc: Int = 1): BigInt = {
    if (x <= 1) acc
    else factorial(x - 1, acc * x)
  }

  def accumulator(a: Int, acc: Int = 0): BigInt = {
    if (a <= 0) acc
    else accumulator(a - 1, acc + a)
  }

}
