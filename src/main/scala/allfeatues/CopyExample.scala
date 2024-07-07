package allfeatues

case class Person1(name: String, age: Int)

object CopyExample {
  def main(args: Array[String]): Unit = {
    val person = Person1("Sreekanth", 32)
    println(s"Person name:${person.name} & age:${person.age}")
    val copy = person.copy(name= "sowmya", age = 27)
    println(s"Copied Person name:${copy.name} & age:${copy.age}")
  }
}
