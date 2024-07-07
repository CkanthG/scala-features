package allfeatues

/*
Singleton object :-
1. Singleton object is an object which defines a single object of a class,a singleton object provides an entry point
to our program execution, if we not created a singleton object the code will compile but not execute.
2. singleton object is mandate inorder to get an outcome of a scala program, this can be create by an object keyword.
3. The methods in the singleton object is globally accessible.
4. We are not allowed to create an instance for a singleton object.
5. A singleton object can extend a class and trait.
6. The method inside the singleton object is accessible by its name.
7. Main method should be created for execution of the singleton object.
8. We are not allowed to pass constructor arguments to a singleton class.
 */

class AreaOfTriangle(a: Int) {
  // variables
  val x: Int = 10
  val y: Int = 20
  val z: Int = 30
  // method which gives area of triangle
  def area(): Unit = {
    val ar = x * y * z
    println(s"x:$x")
    println(s"y:$y")
    println(s"z:$z")
    println(s"area of triangle:$ar, a:$a")
  }
}

// singleton object
object SingletonObject {
  def main(args: Array[String]): Unit = {
    // create an object for a AreaOfTriangle class
    val obj = new AreaOfTriangle(10)
    obj.area()
  }
}
