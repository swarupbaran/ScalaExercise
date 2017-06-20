package tryouts

/**
  * Created by Swarupsingh on 6/16/2016.
  */
object factorial {

  def main(args: Array[String]) {

    //println(factorial(5))
    max(6,5)
    //whileLoop(5)
    //val list = List.range(1,50)

    //list.filter(_ % 2 == 0)

  }

  def max(x: Int, y: Int) =
  {
    if(x == y)
      "Same"
    if (x > y)
      println(x)
    else
      println(y)
  }

  def factorial(number: BigInt): BigInt =
  {
    if(number == 0)
      1
    else
      number * factorial(number - 1)
  }

  def whileLoop(x: Int) =
  {
    var i = 0
    while (i <= x)
      {
        println(i) + " "
        i += 1
      }
  }

}
