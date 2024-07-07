package allfeatues

object MapExample {
  val map: Map[Int, String] = Map(1 -> "abc", 2 -> "def", 3 -> "ghi", 4 -> "jkl")
  val map1 = Map(5 -> "mnp")
  def main(args: Array[String]): Unit = {
    println(s"map:${map}")
    println(s"first map value:${map(1)}")
    println(s"map keys:${map.keys}")
    println(s"map values:${map.values}")
    println(s"map empty check:${map.isEmpty}")

    map.keys.foreach(
      key => {
        println(key + " , "+ map(key))
      }
    )
    println(s"map conatins 5th value or not :"+{map.contains(5)})
    println(s"map conatins 4th value or not :"+{map.contains(4)})
    println(s"concat 2 maps:${map ++ map1}")
    println(s"map size:${map.size}")
  }
}
