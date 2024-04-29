package functionalprogramming

object TypeInference {

  def typeInference(): Unit = {
    val number = 42
    val message = "Sreekanth How Are You Today!"
    println(s"message: $message, number: $number")
    println(s"Addition using Inference: ${add(4, 5)}")
  }

  val add = (a: Int, b: Int) => a + b
}
