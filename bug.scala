```scala
class MyClass(val value: Int) {
  def this() = this(0) // Delegating constructor
  def myMethod(): Int = {
    if (value > 10) {
      value + 1 
    } else {
      throw new IllegalArgumentException("Value must be greater than 10")
    }
  }
}

object Main extends App {
  val myInstance1 = new MyClass(12) 
  println(myInstance1.myMethod()) // Output: 13

  val myInstance2 = new MyClass()
  println(myInstance2.myMethod()) // Throws IllegalArgumentException
}
```