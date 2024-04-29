package objectoriented

class Vector2D(val x: Double, val y: Double) {
  // Overloading the + operator to add two Vector2D instances
  def +(other: Vector2D): Vector2D = new Vector2D(x + other.x, y + other.y)

  // Overloading the - operator to subtract two Vector2D instances
  def -(other: Vector2D): Vector2D = new Vector2D(x - other.x, y - other.y)

  // Custom operator * to compute the dot product of two Vector2D instances
  def *(other: Vector2D): Double = x * other.x + y * other.y

  // Overriding the toString method to provide a custom string representation
  override def toString: String = s"($x, $y)"
}
