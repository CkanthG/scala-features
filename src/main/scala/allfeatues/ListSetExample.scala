package allfeatues

import scala.collection.immutable.ListSet
/*
ListSet has below methods
filterNot - this utilized to select all elements of list which does not satisfy predicate
filter - this utilized to select all elements of list which satisfy predicate
exist - used to check is the elements are there in a listset or not
size - size of a listset
max - max element is going to find large element in the listset
count - count the no of elements in listset based on predicate
sum - sum of given listset elements
find - find the first element of listset that satisfy the predicate
 */
object ListSetExample {
  def main(args: Array[String]): Unit = {
    val listSet = ListSet(1,2,3,4,5,6,7,8,19, -100)
    println(s"filternot in listset:${listSet.filterNot(_ > 5)}")
    println(s"filter in listset:${listSet.filter(_ > 5)}")
    println(s"exist:${listSet.exists(_ > 1)}")
    println(s"size of listset : ${listSet.size}")
    println(s"max element in listset : ${listSet.max}")
    println(s"min element in listset : ${listSet.min}")
    println(s"count elements in listset:${listSet.count(_ >= 5)}")
    println(s"sum elements in listset:${listSet.sum}")
    println(s"find elements in listset:${listSet.find(_ > 1)}")
  }
}
