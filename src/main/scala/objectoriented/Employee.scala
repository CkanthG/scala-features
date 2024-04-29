package objectoriented

class Employee(name: String, age: Int, email: String, var salary: Double) extends Person(name, age, email) {
  def displaySalary(): Unit = {
    println(s"Employee name $name and salary $salary")
  }
}
