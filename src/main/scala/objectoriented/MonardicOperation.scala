package objectoriented

class MonardicOperation {

  def monardicOperation(): Unit = {
    val tempName: Option[String] = Some("MSX")
    val tempLocation: Option[String] = Some("Berlin")

    val company: Option[Company] = for {
      name <- tempName
      location <- tempLocation
    } yield Company(name, location)

    println(company)
  }

  def monardicListOperation(): Unit = {
    val numbers = List(1, 2, 3, 4, 5)
    val doubledNumbers: List[Int] = for {
      number <- numbers
    } yield number * 2

    println(doubledNumbers)
  }

}
