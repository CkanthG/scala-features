package objectoriented.inheritance

trait Swimmer {
  def swim(): Unit = println("Swimming...!")
}

trait Jumping {
  def jump(): Unit = println("Jumping...!")
}

class Frog(name: String) extends Swimmer with Jumping {
  def makeNoise(): Unit = println(s"$name is Making Noise...!")
}