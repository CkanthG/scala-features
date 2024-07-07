package allfeatues

/*
Tuple :- tuple is a collection of heterogeneous data.
 */
object TupleExample {

  private val tuple = (100)
  private val tuple2 = (1, "abcd")
  private val tuple3 = (1, "abcd", 100.0)

  def main(args: Array[String]): Unit = {
    println(tuple)
    println(s"first element: ${tuple2._1}, second element: ${tuple2._2}")
    println("Tuple3 elements:")
    tuple3.productIterator.foreach(
      it => println(it)
    )
  }
}
