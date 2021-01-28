package ObejectOreineted_Scala

/** Polymorphism -> Polymorphism is the ability of an object to take on many forms.
 * Note: instead of primary constructor we can use auxillary constructor for Polymorphism
 * we will use this keyword to achieve this
 */

class Polymorphism(val name:String, val age:Int) {
//  when we call function with only name parameter "this" function will assign default values to other params
  def this(name:String)/* auxillary constructor*/{
    this(name,100) //assigning default value of age as 100 // Primary constructor
  }

  def Test(): Unit={
    println(name +": "+ age)
  }
}

object Testing1{
  //  Creating a main function
  def main(args: Array[String]): Unit = {
    val obj = new Polymorphism("san",16) //creating object of class with 2 parms.
    obj.Test()
    val obj1 = new  Polymorphism("niki") //creating object of class with 1 parms.
    obj1.Test()
  }
}