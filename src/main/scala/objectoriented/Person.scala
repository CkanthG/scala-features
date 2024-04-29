package objectoriented

class Person(var name: String, var age: Int, var email:String) {
  def greet(): Unit = {
    println(s"My name is $name and my age is $age, my email is $email")
  }
}
