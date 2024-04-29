package objectoriented

abstract class Food {
  def prepareFood(): String
}

class Restaurant(order: String) extends Food {
  override def prepareFood(): String = s"Prepare $order Food"
}