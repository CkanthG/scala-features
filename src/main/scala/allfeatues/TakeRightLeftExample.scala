package allfeatues

// if the given 2 values are same take sum and multiply it otherwise just sum of two values.
// takeRight() - will fetch the last 'N' elements from a given list
object TakeRightLeftExample {
  def mathexpression (x: Int, y: Int) : Int = {
    if (x == y) (x + y) * 2 else x + y
  }
  val list = List(1,2,3,4,5,6,7,8,9)
  def main(args: Array[String]): Unit = {
    println(s"output:${mathexpression(5, 5)}")
    println(s"output:${mathexpression(5, 4)}")
    println(s"takeRight 3 from list of 9:${list.takeRight(3)}")
    println(s"take 3 from list of 9:${list.take(3)}")
    println(s"takeWhile 3 from list of 9:${list.takeWhile(i => i % 1 == 0)}")
  }
}
