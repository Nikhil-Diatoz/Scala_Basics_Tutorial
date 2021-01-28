
//Example of opening a Compressed a file and saving in a compressed format. Using Inheritance
package ObejectOreineted_Scala

abstract class File_InheritanceExample {//creating an abstract base class
  /* parent class*/
  def open(filename:String):Unit //Abstract Method for opening a file
  def save(filename:String):Unit //Abstract Method for Saving a file
}

class MyFile extends File_InheritanceExample{ //Extending the Base Abstract class
  /* child class*/
  override def open(filename: String): Unit = { //overriding the base class function open
    println("MyFile.open method is called")
  }

  override def save(filename: String): Unit = { //overriding the base class function save
    println("MyFile.save method is called")
  }
}

class MyCompressedFile extends MyFile{ //Extending the Base Abstract class to implement Compression logic
  //overriding the base class function save to implement Compression logic
  override def save(filename: String): Unit ={
    println("MyCompressedFile.save method is called")
    println(">>> Implementing Compression logic")
    println(">>> Calling the immediate base save method now....")
    //calling super class by super keyword to resolve ambiguity between Base Class and Sub class
    super.save(filename)
  }
}
object TestInheritanceDriver{
  def main(args: Array[String]): Unit = {//Main Function
    var f : File_InheritanceExample = new MyFile() //creating a new instance of MyFile

    println("*** Testing MyFile ***")

    f.open(null) //calling a open method of MyFile class
    f.save(null) //calling a save method of MyFile class

    println("*** Testing a Compressed file ***")

    f= new MyCompressedFile() //creating a new instance of MyCompressedFile
    f.open(null) //calling a open method of MyCompressedFile class
    f.save(null) //calling a save method of MyCompressedFile class

  }
}
