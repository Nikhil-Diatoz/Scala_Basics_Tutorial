package ObejectOreineted_Scala

//defining a class
class Creating_a_class {
  def Test(): Unit={//Unit is Similar to void function
    /* A simple function for printing any message */
    println("My Message")
  }
}

//creating an object of the class
object Testing{
//  Creating a main function
  def main(args: Array[String]): Unit = {
    val obj = new Creating_a_class() //creating an instance of the a Object_oriented_Scala class
    obj.Test() // calling an method Test
  }
}
