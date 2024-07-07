package allfeatues

/*
Options :- Option is a container which holds some of value or None
 */

object OptionsExample {

  val list: Seq[Int] = List(1, 2, 3, 4)
  val map: Map[Int, String] = Map(1 -> "abc", 2 -> "def", 3 -> "ghi", 4 -> "jkl")
  private val option: Option[Int] = None

  def main(args: Array[String]): Unit = {
    // find non exist number in a list or give default message
    println(list.find(_ > 4).getOrElse(0))
    // find an elements in list
    println(list.find(_ > 1))
    // find an elements in list
    println(list.find(_ > 1).get)
    // find non exist number in a map or give default message
    println(map.getOrElse(5, "No Name Associated"))
    // find an elements in map
    println(map.get(2))
    // find an elements in map
    println(map.get(2).get)
    // find option is empty or not
    println(option.isEmpty)
  }
}
