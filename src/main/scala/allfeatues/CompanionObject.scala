package allfeatues

/*
Companion Object :-
1. When object and class name as same, its called as companion object, and class will be called as companion class.
2. A companion object is defined in the same source file in which the class is defined.
3. A companion object is allowed to access private methods and private fields of a class.
 */

class CompanionObject {
  // variables
  var str = "scala is an object programming langauge"
  var str1 = "scala is a functional programming as well"
  private def show(): Unit = {
    println(str)
    println(str1)
  }
}

object CompanionObject {
  def main(args: Array[String]): Unit = {
    val obj = new CompanionObject()
    obj.show()
    // Usage
    val john = Person.fromString("John Doe,30")
    Person.displayInfo(john)  // Prints: Name: John Doe, Age: 30
  }
}

// Define a class `Person`
class Person(val name: String, val age: Int) {
  // Private method accessible by the companion object
  private def printInfo(): Unit = {
    println(s"Name: $name, Age: $age")
  }
}

// Companion object for `Person` class
object Person {
  // A method to create a Person instance from a string
  def fromString(str: String): Person = {
    val parts = str.split(",")
    new Person(parts(0), parts(1).toInt)
  }

  // Accessing private method of `Person` class
  def displayInfo(person: Person): Unit = {
    person.printInfo()  // Calling the private method
  }
}