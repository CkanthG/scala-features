package allfeatues

object ForLoopExample {
  def main(args: Array[String]): Unit = {
    println("i is 1 to 5")
    for (i <- 1 to 5) {
      println(s"i:$i")
    }
    println("i is 1 until 5")
    for (i <- 1 until 5) {
      println(s"i:$i")
    }
    println("for loop execution with collection")
    val numbers = List(1,2,3,4,5,6,7,8,9)
    for (i <- numbers) {
      println(i)
    }
    println("for loop execution with filter")
    for (i <- numbers if i!=2;if i<6) {
      println(i)
    }
    println("for loop execution with yield")
    val hold = for {i <- numbers if i!=3;if i<8} yield i
    for (a <- hold) {
      println(s"a:$a")
    }
  }
}
