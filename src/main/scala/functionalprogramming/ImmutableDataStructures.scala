package functionalprogramming

object ImmutableDataStructures {

  def immutableListOperations(): Unit = {
    val list = List(1, 2, 3, 4)
    val updatedList = list :+ 5
    println(s"immutable list: $list")
    println(s"updated list: $updatedList")
  }

  def immutableMapOperations(): Unit = {
    val map = Map("a" -> 1, "b" -> 2)
    val updateMap = map + ("c" -> 3)
    println(s"Immutable Map: $map")
    println(s"Update Map: $updateMap")
  }

}
