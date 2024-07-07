package allfeatues

// by using :: operator we can add a new item in front of a list and we cannot add at last.
object ConsExample {
  def main(args: Array[String]): Unit = {
    val list = List("abc", "def", "ghi")
    println(s"add a to list : ${"a" :: list}")
    val snacks = List("mirchi", "bajji", "kachori")
    val flowers = List("lilli", "jasmin", "rose")
    val combine = list ::: snacks ::: flowers
    println(s"two lists :$combine")
  }
}
