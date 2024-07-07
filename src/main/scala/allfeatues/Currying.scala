package allfeatues

/*
Currying :-
1. currying is a technique of transforming a function that takes one or more arguments into a function or
which takes single argument into a function.
2. it support partial application.
 */
object Currying {

  private def sumOfTwoNumbers(x:Int, y:Int): Int = x + y
  def sum(x:Int): Int => Int = (y:Int) => x + y
  def sum2(x:Int)(y:Int): Int = x + y

  def main(args: Array[String]): Unit = {
    println(sumOfTwoNumbers(90,10))
    println(sum(20)(30))
    println(sum2(50)(60))
    //partial application
    val s = sum(40)
    val m = s(50)
    println(s"s:$s, m:$m")
    println(sum(30).apply(40))
  }
}
