package functionalprogramming

object FirstClassFunctions {

  def applyFunction(f: (Int, Int) => Int, x: Int, y: Int): Int = f(x, y)

  def double(x: Int, y: Int): Int = x * y

  val addOne: (Int, Int) => Int = (x: Int, y: Int) => x + y

  val addTwoIntegers: (Int, Int) => Int = (a: Int, b: Int) => a + b
}
