package Lectures.basics

object Functions extends  App {
  def aFunction (a:String,b:Int):String={
    a + " " + b
  }
  println(aFunction("Hello",8))

  def greetingFunction(aString:String,age:Int)={
    println(s"Hi, my name is $aString and I am $age years old")
  }


}
