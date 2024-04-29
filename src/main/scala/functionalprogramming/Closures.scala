package functionalprogramming

object Closures {

  def makeMultiplier(factor: Int): Int => Int = {
    (x: Int) => x * factor
  }

  def makeCounter(): () => Int = {
    var counter = 0
    () => {
      counter += 1
      counter
    }
  }

}
