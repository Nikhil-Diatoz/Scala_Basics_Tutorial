package ObejectOreineted_Scala

case class CaseClass(empId:Int, empName:String, empAddr:String)

//case class gives so much extra functionality like equal method, copy method,
// Hashcode method and toString method
//They are very useful for data transfer objects
object Test {
  def main(args: Array[String]): Unit = {
    val obj1 = new CaseClass(100, "Nikhil", "Tiptur......")
    val obj2 = new CaseClass(101, "San", "Chennaraya Patana......")

    println(obj1 == obj2) //checking obj1 is equal to obj2 using case class function

    val obj3 = obj1.copy() //we can copy one object to other variable using case class function
    println(obj1 == obj3)

    val obj4 = obj1.copy(108)// we can use copy function with different params values
    println(obj4)

    println(obj1) //This will print all the attributes by using toString method of case class function

    println(obj1.hashCode()) //which gives the unique id for the method
  }
}
