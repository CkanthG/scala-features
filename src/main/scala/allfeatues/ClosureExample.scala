package allfeatues

/*
  Closure :-
  1. closure is a function which uses one or more variables which is declared outside of a function.
  2. closure will accept the latest state of variable to perform the operation.
  */

object ClosureExample {
  private var variable1 = 10;
  private var variable2 = 20;
  val sum = (a: Int) => a + variable1 + variable2

  def main(args:Array[String]): Unit = {
    variable1 = 1000 // variable1 state got changed, means we can change these values in dynamically.
    variable2 = 2000 // variable2 state got changed, means we can change these values in dynamically.
    println(sum(1000))
  }
}
