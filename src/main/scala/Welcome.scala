import functionalprogramming.Closures.{makeCounter, makeMultiplier}
import functionalprogramming.FirstClassFunctions.{addOne, addTwoIntegers, applyFunction, double}
import functionalprogramming.HigherOrderFunctions.{findEvenOrOddNumbersInListByFilter, multiplyListElementsBy2UsingMap, squareOfNumbers}
import functionalprogramming.ImmutableDataStructures.{immutableListOperations, immutableMapOperations}
import functionalprogramming.PatternMatching.{matchingAgainstCaseClasses, patternMatchingWithLists}
import functionalprogramming.TailRecursion.{accumulator, factorial}
import functionalprogramming.User
import objectoriented.{Employee, Person, Teacher}

object Welcome {

  def main(args: Array[String]): Unit = {
    println("<<<<<*****Scala Features*****>>>>>")
    println("Welcome to Scala World, How are you today!")
    val person1 = new Person("sreekanth", 33, "sree@gamil.com")
    println(person1.name, person1.age, person1.email)
    person1.greet()
    val employee = new Employee("Sreekanth", 33, "sree@gmail.com", 700000.0)
    employee.displaySalary()
    val teacher = new Teacher("Sreekanth", 33, "sree@gmail.com")
    teacher.speak()
    println(s"*****FirstClassFunctions*****\nmultiplication of 81984 using first class function: ${applyFunction(double, 81984, 2)}")
    println(s"add one to existing integer 9999: ${addOne(9999, 1)}")
    println(s"*****Anonymous functions (lambdas)*****\nadd two integers 986986 + 9687698 = ${addTwoIntegers(986986, 9687698)}")
    println(s"*****Immutable Operations*****")
    immutableListOperations()
    immutableMapOperations()
    println("*****Higher Order Functions*****")
    multiplyListElementsBy2UsingMap()
    findEvenOrOddNumbersInListByFilter()
    squareOfNumbers()
    println(s"*****Closures*****\nMultiply of 235 with 678 using closures: ${makeMultiplier(235).apply(678)}")
    val counter = makeCounter()
    println(s"Counter 1 using closures:${counter()}")
    println(s"Counter 2 using closures:${counter()}")
    println(s"Counter 3 using closures:${counter()}")
    println("*****Pattern Matching*****")
    matchingAgainstCaseClasses(User("sreekanth", 33))
    matchingAgainstCaseClasses(null)
    patternMatchingWithLists()
    println(s"*****Tail Recursion*****\nFactorial of 15: ${factorial(15)}\nAccumulation of 100: ${accumulator(2000)}")
  }

}
