package functionalprogramming

object FunctionalProgramming {

  def main(args: Array[String]): Unit = {
    println("*****FunctionalProgramming In SCALA*****")
    listOperation()
    filterNumbers()
    reduceNumbers()
    println(s"patternMatching : ${patternMatching(2)}")
    immutableCollection()
  }

  private def listOperation(): Unit = {
    val numbers = List(1,2,3,4,5)
    val doubledNumbers = numbers.map(num => num * 2)
    println(s"doubled numbers in given list: $doubledNumbers")
  }

  private def filterNumbers(): Unit = {
    val numbers = List(1,2,3,4,5)
    val evenNumbers = numbers.filter(num => num % 2 == 0)
    println(s"even numbers in given list $evenNumbers")
    val oddNumbers = numbers.filter(num => num % 2 != 0)
    println(s"odd numbers in given list $oddNumbers")
  }

  private def reduceNumbers(): Unit = {
    val numbers = List(1,2,3,4,5)
    val sumOfAllNumbers = numbers.reduce((a, b) => a+b)
    val sum = numbers.sum // direct method to sum a list of numbers
    println(s"Using reduce sum of all numbers in a given list $sumOfAllNumbers & sum $sum")
  }

  private def patternMatching(x: Int): String = x match {
    case 1 => "One"
    case 2 => "Two"
    case _ => "Other"
  }

  private def immutableCollection(): Unit = {
    val fruits = List("Apples", "Bananas", "Kiwis", "Avacados")
    val updatedFruits = fruits :+ "Oranges"
    println(s"Fruits $updatedFruits")
    val lengthOfFruites = updatedFruits.map(_.length)
    println(s"Length of fruit name $lengthOfFruites")
  }
}
