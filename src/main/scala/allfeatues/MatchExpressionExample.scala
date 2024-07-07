package allfeatues

object MatchExpressionExample {
  def main(args: Array[String]): Unit = {
    val salary = 2000
    salary match {
      case 1000 => println(s"salary is :$salary")
      case 2000 => println(s"salary is :$salary")
      case 3000 => println(s"salary is :$salary")
      case 4000 => println(s"salary is :$salary")
      case _ => println(s"$salary is not matched")
    }

    val sal = salary match {
      case 1000 => salary
      case 2000 => salary
      case 3000 => salary
      case 4000 => salary
      case _ => println(s"$salary is not matched")
    }
    println(s"result salary:$sal")

    val i = 2
    i match {
      case 2 | 4 | 6 | 8 | 10 => println(s"$i is even number")
      case 1 | 3 | 5 | 7 | 9 => println(s"$i is odd number")
      case _ => println(s"provide correct $i number")
    }
  }
}
