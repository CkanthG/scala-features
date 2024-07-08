package allfeatues

/*
StringBuilder is used when we want to mutable of a String.
The Instance of StringBuilder is used like a String
 */
object StringBuilderExample {
  def main(args: Array[String]): Unit = {
    var str = new StringBuilder("Sreekanth")
    println(s"String Buffer:$str")
    // append element to StringBuffer
    println(s"SB after single character append :${str += 'G'}")
    val stringBuilder = new StringBuilder("Author")
    println(s"SB after words append:${stringBuilder ++= " Of Geetha"}")
    val x = new StringBuilder("No of Books:")
    println(s"Append Book Count Using append() method:${x.append(5)}")
    val t = new StringBuilder("biotechnology")
    println(s"delete some characters from SB:${t.delete(1,3)}")
    println(s"Convert SB: ${t.getClass} to String:${t.toString().getClass}")
  }
}
