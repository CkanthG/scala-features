package allfeatues

/*
Notes:
1. Classes and Case Classes have different syntax for declaration.
  a. Case Classes will declare in single line with parameters
  b. Classes will declare in multi lines with parameters and methods.
2. While creating objects new keyword needed for classes and not needed for case classes.
3. Regular classes do not support pattern matching, case classes will support.
4. Regular classes can inherited by other classes and case classes will not support.
5. Regular classes do not have any pre-defined method, whereas case classes have toString and hashcode methods.
 */

class Student(val rollNo:Int, val name:String, val gender:String, val percentage:Double) {
  def printStudentDetails(): Unit = {
    print(s"rollNo:$rollNo\t")
    print(s"name:$name\t")
    print(s"gender:$gender\t")
    print(s"percentage:$percentage\t")
    if (percentage < 40) {
      println(s"$name failed")
    } else {
      println(s"$name passed")
    }
  }
}

case class Company(name:String, location: String)

object ClassAndCaseClass {
  def main(args: Array[String]): Unit = {
    println("Class Example")
    val student = new Student(1, "sreekanth", "male", 70.00)
    println(s"Student -> ${student.name} details")
    student.printStudentDetails()
    val student1 = new Student(2, "sowmya", "female", 80.00)
    println(s"Student -> ${student1.name} details")
    student1.printStudentDetails()
    val student2 = new Student(3, "devansh", "male", 30.00)
    println(s"Student -> ${student2.name} details")
    student2.printStudentDetails()
    println("---------------------------------------")
    println("Case Class Example")
    patternMatch(Company("MSX", "Berlin"))
    patternMatch(Company("MITS", "Banjarahills"))
    patternMatch(Company("MSINFO", "Ameerpet"))
    patternMatch( Company("YAMINI", "SRNagar"))
  }

  private def patternMatch(company: Company): Unit = {
    company match {
      case Company("MSX", "Berlin") => println(s"company name:${company.name} located in ${company.location}")
      case Company("MITS", "Banjarahills") => println(s"company name:${company.name} located in ${company.location}")
      case Company("MSINFO", "Ameerpet") => println(s"company name:${company.name} located in ${company.location}")
      case Company("YAMINI", "SRNagar") => println(s"company name:${company.name} located in ${company.location}")
    }
  }
}
