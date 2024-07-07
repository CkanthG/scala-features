package allfeatues

import scala.Array._
// array is data structure which can store fixed size sequential elements of same data type.
object ArrayExample {
  val array: Array[Int] = new Array[Int](5)
  val array2 = new Array[Int](5)
  val array3 = Array(1,2,3,4,5,6,7,8,9,10)
  def main(args: Array[String]): Unit = {
    array(0) = 11
    array(1) = 12
    array(2) = 13
    array(3) = 14
    array(4) = 15
    println(s"Array Length : ${array.length}")
    for (i <- array) {
      println(i)
    }
    for (i <- array2) {
      println(i)
    }
    val out = concat(array, array3)
    for (i <- out) {
      println(i)
    }
  }
}
