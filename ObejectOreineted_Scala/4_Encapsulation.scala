package ObejectOreineted_Scala

//Encapsulation Hides the data by making variables private

class Encapsulation(val name:String, val age:Int, private val marks:Int)/*primary constructor */ {
  //arguments are present in public if we want to make it private we can use private keyword before val
  def Test(): Unit = {
    /* a simple function That prints name and age
    parms:
      Input: Name:String,  age: Int
      Output: None
     */
    println(name +" "+ age + " " + marks)
  }
}

object Test2{
  def main (args: Array[String] ): Unit = {
//  Creating an instance of the class with arguments
    val obj = new Encapsulation("Nikhil",20, 60)
//    println(obj.name +" "+ obj.age)// public parameters are accessible outside the class
//    println(obj.marks) // private parameters are not accessible outside the class. this will throw an Error
    obj.Test() //Calling Test function of the defined class
}
}
