package allfeatues

class Parent {
  val name: String = "Sreekanth"
}
class Child extends Parent {
  val age: Int = 33
}
class SubClass extends Child {
  def details(): Unit = {
    println(s"name of the employee:$name and age:$age")
  }
}
object InheritenceExample {
  def main(args: Array[String]): Unit = {
    val subClass = new SubClass()
    subClass.details()
  }
}
