package functionalprogramming

object HigherOrderFunctions {

  def multiplyListElementsBy2UsingMap(): Unit = {
    val list = List(1,2,3,4)
    val doublesMap = list.map(i => i * 2)
    val doubleMap2 = list.map(_ * 2)
    println(s"list : $list")
    println(s"list multiplied by 2: $doublesMap")
    println(s"list multiplied by 2 using underscore: $doubleMap2")
  }

  def findEvenOrOddNumbersInListByFilter(): Unit = {
    val list = List(1,2,3,4,5,6)
    val evenNumbers = list.filter(_ % 2 == 0)
    val oddNumbers = list.filter(i => i % 2 != 0 )
    println(s"Even Numbers in List: $evenNumbers\nOdd Numbers in List: $oddNumbers")
  }

  def squareOfNumbers(): Unit = {
    val list = List(1,2,3,4,5,6,7,8,9)
    val squares = list.map(i => i * i)
    println(s"List: $list")
    println(s"Square of List Elements $squares")
  }
}
