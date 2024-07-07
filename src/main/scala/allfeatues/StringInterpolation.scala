package allfeatues
/*
1. String is must be declared at starting with s/f/raw
2. variables must be prefix with $
3. expression must be with curly braces {} and pefix with $
 */
object StringInterpolation {
  def main(args: Array[String]): Unit = {
    val name = "Sreekanth"
    val age = 33.3
    println(s"Name:$name and age:$age")
    println(f"Name:$name%s and age:$age%.2f")
    println(raw"Hello \nProgrammer")
    println("Hello \nProgrammer")
  }
}
