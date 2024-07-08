package allfeatues

import scala.collection.mutable.ListBuffer
/*
List - List is an Immutable data structure it contains duplicate elements and maintain the order of it's elements.
ListBuffer - ListBuffer is a mutable implementation of List.
ListBuffer is convenient when we want to build a list from front to back. It supports prepend and append operations.
once we created our list, call the toList method to convert ListBuffer to List.
InOrder to use ListBuffer scala.collection.mutable.ListBuffer class need to import.
Ex: var name = new ListBuffer[Datatype]()//empty buffer
 */
object ListAndListBufferExample {
  def main(args: Array[String]): Unit = {
    val names = ListBuffer[String]()
    names += "abc"
    names += "def"
    names += "ghi"
    names += "jkl"
    //append sequence of elements
    names ++= Seq("mno", "pqr", "stu", "vwx")
    //insert a specific element in specific position
    names.insert(2, "gih")
    //remove element from ListBuffer
    names -= "gih"
    //update a element in specific position
    names.update(1, "a")
    //convert ListBuffer to list
    val nameList = names.toList
    println(s"names : $names")
    println(s"name list : $nameList")
    val integers = ListBuffer[Int]()
    integers += 1
    integers += 2
    integers += 3
    //append sequence of elements
    integers ++= Seq(4,5,6)
    //insert a specific element in specific position
    integers.insert(1, 22)
    //remove element from ListBuffer
    integers -= 22
    //update a element in specific position
    integers.update(1, 10)
    //convert ListBuffer to list
    val integerList = integers.toList
    println(s"Integers :$integers")
    println(s"Integer List :$integerList")
    val list = List(10,20,30,40,50,60)
    val buff = ListBuffer[Int]()
    for (i <- list) buff += i + 1
    println(s"Converted List to ListBuffer:$buff")
  }
}
