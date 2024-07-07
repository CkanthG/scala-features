package allfeatues

/*
Higher Order Function :- Higher order function is takes function as an argument or written function as a result.
 */
object HigherOrderFunction {

  private def math(x: Int, y: Int, f:(Int, Int) => Int): Int = f(x, y)
  private def calc(x: Int, y: Int, z:Int, f:(Int, Int) => Int): Int = f(f(x, y), z)

  def main(args: Array[String]): Unit = {
    //addition
    println("addition :"+math(10, 30, (a, b) => a + b))
    //multiplication
    println("multiplication :"+math(10, 30, (a, b) => a * b))
    //find minimum
    println("minimum :"+math(10, 30, (a, b) => a min b))
    //find max
    println("max :"+math(10, 30, (a, b) => a max b))
    //find max from x,y,z
    println("max from x,y,z:"+calc(20, 40, 60, (a, b) => a max b))
    //addition from x,y,z
    println("addition from x,y,z:"+calc(20, 40, 60, (a, b) => a + b))
    //addition from x,y,z using _
    println("addition from x,y,z using _ :"+calc(20, 40, 60, _ + _))
  }

}
