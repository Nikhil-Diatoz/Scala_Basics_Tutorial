//basic Data types supported by scala are int,char,float,Double, Long..etc
//defining a String
val Hello:String = "hii"

//defining a Int
val Hello:Int = 13

//defining a Double value
val pi:Double = 3.142

// Boolean Conditions
val isGreater = 1>2
val isLesser = 1<2
val is_Equal = 1==2
val is_true = true && true //singe & will do bitwise AND operations
val is_true = true || false //single | will do bitwise OR operations

//basic operations supported by scala are +,-,/,% ...etc
var addition: Int = 1+2 //Addition
var addition: Int = 1-2 //Subtraction
var addition: Int = 1*2 //Multiplication

/**
//taking user input and type conversation
var num = scala.io.StdIn.readLine("What's your age? ").toInt //reading line then converting to int
var num1 = scala.io.StdIn.readInt() //reading line with int
*/

//printing 3 Floating points Example
val pi:Double = 3.142
val doubled: Double = pi*pi
println(f"pi value is $doubled%.3f")

// if else conditions

//without bracket
if(1==2)
  print("Equal")
else
  println("not equal")

//with bracket
if ("Nik"=="Nik"){
  println("both are equal")
}else{
  println("not equal")
}

//In Single line
if("me"=="you") println("love") else println("hate")


//switch and case statements
val num:Int = 5

num match{
  case 1 => println("one") //If given value is 1 then this will get executed
  case 2 => println("Two") //If given value is 2 then this will get executed
  case 3 => println("Three") //If given value is 3 then this will get executed
  case 4 => println("four") //If given value is 4 then this will get executed
  case 5 => println("five") //If given value is 5 then this will get executed
  case _ => println("some other number") //If any other value given accept above cases then default will get executed
}


//For Loop
for(i <- 1 to 3){ println(i) } //using to

for(x <- 1 until 5){ println(x) } //using until

val num = 1 to 5 //this will create a range function from 1 to 5
for(i <- num) {
  val nn = {i * i}//squaring number
  println(f"$i --- $nn") //printed using Format printing
}


//while loops
var i:Int = 5 //declaring a variable
while (i<8){
  println(i)
  i +=1 //incrementing by 1
}


//do while loops
var n:Int = 3 //declaring a variable
// Multiline
do{
  println(n)
  n +=1 //incrementing by 1
}while(n<6)

//Single line
var x = 0
do { println(x); x+=1}while(x<=5)


//expressions
{val x:Int   = 5; x + 20}


// Regex operations on scala
import scala.util.matching.Regex //importing Regex library

val some_str:String = "hi my age is 24" //creating a string
val regex_exp:Regex = """.* ([\d]+).*""".r //creating an regex expression
val regex_exp(answer) = some_str //parsing string through regex
println(answer) //printing final answer


//Exercise: fibonacci sequence
def fibonacci( n : Int ) : Int = {
  /*
 This function calculates the fibonacci number of the given input
 parms:
      Input:> n : Integer
      Output:> Fibonacci number
   */
  var a = 0
  var b = 1
  var i = 0

  while( i < n ) {
    val c = a + b
    a = b
    b = c
    i = i + 1
  }
  return a
}
val result = fibonacci(8)
println(f"Fibonacci series: $result")

def square(num:Int):Unit={
  /*
  Simple Function to square the input number
   */
  println(num*num)
}

square(5)

def multiply(n1:Int,n2:Int):Unit={
  /*
  Simple Function to multiply the input number
   */
  println(n1*n2)
}
multiply(5,6)

//in multi lines
def cubic(n1:Int):Unit={
  /*
  Simple Function to get cube of the input number
   */
  val res:Int = n1*n1*n1
  println(f"cubic of $n1 is : "+res )
}
cubic(5)

//in single line
def cubic_(X:Int): Int={X*X*X}
println(cubic_(3))

//function inside other function
def transformationInt(x:Int, fun: Int =>Int): Int = {
  /*
  This Function Takes other Function as an argument
   */
  fun(x)
}
val result = transformationInt(3,cubic_)
println(result)

//lambda Function/Function Literal : in scala we won't use lambda keyword like Python

println("Lambda output : "+transformationInt(2, x => x*x*x))
println(transformationInt(5, x => x/2))

transformationInt(2, x => { val y = x*2; y*y })
transformationInt(5, x=> {val n= x+3; n+10})
transformationInt(1, x=> {val temp1= x*7; val temp2 = n/2; temp2+3})

// Exercise using Function
def captilize(str:String):String={
  /* This function capitalizes the input String"
   */
  str.toUpperCase
}
captilize("Nikhil")

def Lowerize(str:String):String={
  /* This function converts the input String to Lowercase"
   */
  str.toLowerCase
}
Lowerize("NIKHIL")


//Exercise using Function Literal or Lambda Function
val captilize = (x:String) => x.toUpperCase
println(captilize("Nikhil"))

val Lowerize = (x:String) => x.toLowerCase
Lowerize("NIKHIL")

//we can store expression output in variables
val add = (a:Int, b:Int) => a + b
add(1, 2)

//tuples and Immutable Lists

//Tuples
val some_tup = ("kj", "jsjs", "hjd")
println(some_tup)
//indexing
println(some_tup._1)
println(some_tup._2)
println(some_tup._3)

//Key value pair creation using Arrow operator
val var_name = "Nikhil" -> "Hii"
println(var_name._2)

//Tuple with different data types
val some_tuple = ("string", "Nikhil", 10,5, true, false)
println(some_tuple)

//Lists
/**
Lists Similar to Singly Linked list. List can't hold different types of datasets Like tuple,
But it gives more functionality than Tuple.
List values must be of same type.
 */

print("operations on Lists")
var some_list = List("sjsj", "ab", "bc")
println(some_list)

//Accessing elements is completely different from normal tuple there we will use "._" notation
//but hear we will use indexing
//List indexing starts from 0 where tuple starts with 1
println(some_list(0)) //some_list.head() works as the same.
println(some_list(1))
println(some_list(2))

//in list we have head and tail operations
// head gives starting element/tail given remaining elements accept head
println(some_list.head)
println(some_list.tail)

//Let's print the values
for(some <- some_list){
  println(some)
}

//map is all-most similar to python map
val any_ = some_list.map((x:String) => x.toUpperCase)

val mar = some_list.map( (string:String) => {string.reverse})
for(temp <- mar){ println(temp)}

//reduce() used to combine all the items in a collection using some function
val num_list = List(1,2,3,4,5)
val sum = num_list.reduce((x:Int, y:Int) => x+y) //Sum function performs the similar task

//filter() used to remove false data
val iHateFives = num_list.filter((x:Int) => x!=5)
val dummy  = num_list.filter((i:Int) => i==3)
println(dummy.head)

//short-form for filter
val iHateThrees = num_list.filter(_ != 3)

//Note: scala has it's own map reduce and Spark has its own map reduce
// both works differently. but syntax would be almost similar
// Hint: (spark for parallelizing across all the machines in the cluster)

//Concatenating list using "++" operator
val moreNumbers = List(6,7,8)
val concatenated = moreNumbers ++ num_list

val reversed = concatenated.reverse
val sorted = concatenated.sorted

//unique values
val duplicated = num_list ++ num_list
val distinct_val = duplicated.distinct

//Math operations
val maximum = duplicated.max //finding a maximum number from the list.
val total = distinct_val.sum //previously we used reduce to do same operation.
val has_three = duplicated.contains(3) //to check the value is present inside the List or not.

//Maps similar to Dictionaries
// Note: we use "Map" for dictionary creation, not "map".

val Dictionary = Map("Nikhil" -> "my_name", "sanchu" -> "my_friend_name")

println(Dictionary("Nikhil"))//accessing value by key
println(Dictionary.contains("ram"))//to check key is present or not

//println(Dictionary("ram")) //ram is not exists in the Dictionary variable it will throw an error.

//Exception Handling
val is_present = util.Try(Dictionary("ram")) getOrElse "Key is not present"
println(is_present)

//Exercise
val list_of_num = (1 to 20).toList //creating a 1 to 20 numbers List

//numbers which are divisible by 3, by using filter function
val divisible_by_three = list_of_num.filter( _ %3 == 0)

//numbers which are divisible by 3, by using for Loop
for(x <- list_of_num){
  if(x%3 == 0){
    println(x)
  }
}























