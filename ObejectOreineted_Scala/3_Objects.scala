package ObejectOreineted_Scala
//Till now we are creating a class and creating an instance of class separately.
//using object keyword we can directly create an instance of class on scala (Similar to "static" keyword in Java
//This are also know as Singletons in Scala

object TestClass{
  def test(): Unit ={
    println("Test Message")
  }
}

object Testing_object{
  def main(args: Array[String]): Unit = {
    TestClass.test() //directly calling without creating a new instance
  }
}