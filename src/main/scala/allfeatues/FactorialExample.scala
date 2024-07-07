package allfeatues

object FactorialExample {

  private def fact(n: Int): Int = {
    var f = 1
    for (m <- 1 to n) {
      f = f * m
    }
    f
  }
  def main(args: Array[String]): Unit = {
    println(fact(4))
  }
}
