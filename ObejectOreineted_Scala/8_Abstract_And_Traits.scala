package com.sundogsoftware.spark

/**Traits are used to define object types by specifying the
 signature of the supported methods. Scala also allows traits to be partially
 implemented but traits may not have constructor parameters. A trait definition
 looks just like a class definition except that it uses the keyword trait.
*/
//Traits are similar to interfaces in java
//traits are similar to abstract class but it can have both abstract method and implementations
//traits must contain one abstract method

trait Speedometer {//defining a trait class
  protected var speed:Float //creating a protected variable named speed
  def showSpeed:Float // creating an abstract method showSpeed
  def accelerate(rate:Float) // creating an abstract method accelerate
  def decelerate(rate:Float) // creating an abstract method decelerate
}
abstract class Print_Hello{ def print_name(name:String):Unit=println("Hello") } //creating an abstract base class

//creating a child class which Extends the base class Speedometer
class Dashboard(var speed:Float) extends Print_Hello with Speedometer{ //constructor contains the member variable speed

   override def print_name(name: String): Unit = println(f"Hello $name") // override an abstract method print_name

   def showSpeed: Float = speed  // override an trait method showSpeed

   def accelerate(rate: Float): Unit = println(f"accelerating at speed of $speed") // override an trait method accelerate

   def decelerate(rate: Float): Unit = println(f"decelerating at speed of $speed") // override an trait method decelerate
}

//creating an main method
object TestSpeedometer{
  def main(args: Array[String]): Unit = {
    val obj1 = new Dashboard(5) // creating an instance of the class Dashboard
    obj1.print_name("Nikhil")
    println(f"Initial speed : ${obj1.showSpeed}") //printing the showspeed method of Dashboard class
    obj1.accelerate(6) //calling the accelerate method of Dashboard class
    obj1.decelerate(9) //calling the decelerate method of Dashboard class
  }
}
