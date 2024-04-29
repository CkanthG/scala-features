package functionalprogramming

object PatternMatching {

  def matchingAgainstCaseClasses(user: User): Unit = user match {
    case user: User => println(s"user name: ${user.name} and user age: ${user.age}")
    case _ => println("Unknown User")
  }

  def patternMatchingWithLists(): Unit = {
    val list = List(1,2,3,4)
    println(s"patternMatchingWithLists")
    val description = list match {
      case Nil => "Empty List"
      case head :: tail => s"Head $head and Tail $tail"
    }
    println(description)
  }
}

case class User(name: String, age: Int)