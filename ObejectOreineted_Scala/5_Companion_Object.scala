
package ObejectOreineted_Scala
/*
Companion Objects contains both instance Methods and Static Methods
- Hear Both class name and object name should be same
- we can access the object directly within the class
 */
class Companion_Object {
  def test(): Unit={
    Companion_Object.print_msg() //calling an function present in object directly
  }
}
object Companion_Object{
  var instance_count = 0 //keeping the track of how many instances are created
  def print_msg(): Unit={ println("Test Message")}// defining a function
}

object Main{
  def main(args: Array[String]): Unit = {
    val t = new Companion_Object() //creating an instance Using class name
    t.test()
  }
}

//Updated To check how many instances are created
//To test comment the above part and uncomment the below part
// comments are done using /** Start --comments-- End */

/**
package OOP_Scala
/*
Companion Objects contains both instance Methods and Static Methods
- Hear Both class name and object name should be same
- we can access the object directly within the class
 */
class Companion_Object {
    Companion_Object.instance_count += 1
//    Companion_Object.print_msg() //calling an function present in object directly
}
object Companion_Object {
  var instance_count = 0 //keeping the track of how many instances are created
  def print_msg(): Unit={ println("Test Message")}// defining a function
  def print_Instance_count(): Unit={println("Number of instances created are: "+ instance_count)}
}

object Main{
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 5){ //looping 5 times to create 5 suppurate instances of each class
    new Companion_Object() //creating an instance Using class name
    }
    Companion_Object.print_Instance_count()
  }
}
*/