package functionalprogramming

object OptionAndEither {

  def optionAndEither(): Unit = {
    val maybeValue: Option[Int] = Some(42)
    val absentValue: Option[Int] = None

    val result = maybeValue.getOrElse(0)
    val defaultValue = absentValue.getOrElse(0)

    println(s"Option Value : $result")
    println(s"Default Value : $defaultValue")
  }

  def divide(dividend: Int, divisor: Int): Either[String, Int] = {
    if (divisor == 0) Left("Cannot divide by zero")
    else Right(dividend / divisor)
  }

}
