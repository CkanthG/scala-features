package allfeatues

object ExceptionExample {
  def main(args: Array[String]): Unit = {
    try {
      val c = 10 / 0
      println(s"C:$c")
    } catch {
      case a: ArithmeticException =>
        print(s"Arithmetic Exception Occurred:$a")
    }
  }
}
