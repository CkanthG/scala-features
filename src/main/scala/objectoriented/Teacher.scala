package objectoriented

class Teacher(name: String, age: Int, email: String) extends Person(name, age, email) with Speaker {
  def speak(): Unit = {
    println(s"Teacher name $name")
  }
}
