import functionalprogramming.Closures.{makeCounter, makeMultiplier}
import functionalprogramming.FirstClassFunctions.{addOne, addTwoIntegers, applyFunction, double}
import functionalprogramming.HigherOrderFunctions.{findEvenOrOddNumbersInListByFilter, multiplyListElementsBy2UsingMap, squareOfNumbers}
import functionalprogramming.ImmutableDataStructures.{immutableListOperations, immutableMapOperations}
import functionalprogramming.OptionAndEither.{divide, optionAndEither}
import functionalprogramming.PatternMatching.{matchingAgainstCaseClasses, patternMatchingWithLists}
import functionalprogramming.TailRecursion.{accumulator, factorial}
import functionalprogramming.TypeInference.typeInference
import functionalprogramming.{Circle, Rectangle, Shape, Triangle, User}
import objectoriented.inheritance.{Dog, Frog}
import objectoriented.{AuthenticationService, Employee, MonardicOperation, Person, Restaurant, Teacher, Vector2D}

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
    println(s"*****Type Inference*****")
    typeInference()
    println(s"*****Algebraic Data Types*****")
    val circle = Circle(radius = 5.0)
    val rectangle = Rectangle(width = 10.0, height = 6.0)
    val triangle = Triangle(base = 8.0, height = 4.0)
    println(s"Circle Area:${calculateArea(circle)}\nRectangle Area:${calculateArea(rectangle)}\nTriangle Area:${calculateArea(triangle)}")
    println("*****Option and Either*****")
    optionAndEither()
    val result1 = divide(10, 2)
    val result2 = divide(10, 0)
    println(s"$result1\n$result2")
    println("*****Inheritance Example*****")
    val dog = new Dog("Puppy")
    dog.makeSound()
    val frog = new Frog("Frog")
    frog.swim()
    frog.jump()
    frog.makeNoise()
    println("*****Class with mixin composition*****")
    val authService = new AuthenticationService()
    authService.login("admin", "1234")
    authService.login("user", "password")
    println("*****Abstract Class and Methods Implementation*****")
    val restaurant = new Restaurant("Indian")
    println(restaurant.prepareFood())
    println("*****Operator overloading and custom operators*****")
    val v1 = new Vector2D(3.0, 4.0)
    val v2 = new Vector2D(1.0, 2.0)
    val sum = v1 + v2
    println("Sum: " + sum)
    val difference = v1 - v2
    println("Difference: " + difference)
    val multiplyAndAdd = v1 * v2
    println("Multiply And Add: " + multiplyAndAdd)
    println("*****For-comprehensions for monadic operations*****")
    val mo = new MonardicOperation()
    mo.monardicOperation()
    mo.monardicListOperation()
//    println("XML literals for writing XML directly in code")
//    val name = "Sreekanth"
//    val age = 33
//    val xml = <person>
//      <name>
//        {name}
//      </name>
//      <age>
//        {age}
//      </age>
//    </person>
//    println(xml)
  }

  private def calculateArea(shape: Shape): Double = shape match {
    case Circle(radius) => Math.PI * radius * radius
    case Rectangle(width, height) => width * height
    case Triangle(base, height) => 0.5 * base * height
  }

}
