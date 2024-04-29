package objectoriented.inheritance

class Animal(val name: String) {
  def makeSound(): Unit = println("Animal make sound, can't talk like humans")
}

class Dog(name: String) extends Animal(name) {
  override def makeSound(): Unit = println(s"${name} makes sound like: Bow Bow!")
}