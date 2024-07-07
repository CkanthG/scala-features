package allfeatues
// List - where we can store homogeneous data types in it.
object LIstExample {

  val integers = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  val strings = List("def","a","z", "ghi", "jkl", "mnp", "abc")

  def main(args: Array[String]): Unit = {
    println(s"Integers List:$integers")
    println(s"Strings List:$strings")
    println(s"Append 0 at first position:${0 :: integers.appended(10)}")
    println(s"Original Integers List:$integers")
    println(s"Append mnp at first position:${"abc" :: strings}")
    println(s"Empty List: $Nil")
    println(s"Add elements to Empty List: ${1 :: 2 :: 3 :: Nil}")
    println(s"integers head:${integers.head}")
    println(s"integers tail:${integers.tail}")
    println(s"strings head:${strings.head}")
    println(s"strings tail:${strings.tail}")
    println(s"Empty Check: ${integers.isEmpty}")
    println(s"List Reverse: ${integers.reverse}")
    println(s"fill empty list with specified object in it:${List.fill(5)(5)}")
    println(s"find max in list:${integers.max}")
    println(s"find max in list:${strings.max}")
    println(s"find min in list:${integers.min}")
    println(s"find min in list:${strings.min}")
    integers.foreach(println)
    strings.foreach(println)

  }
}
