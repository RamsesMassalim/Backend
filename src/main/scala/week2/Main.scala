package week2

object Main extends App {

  def ex1(): Unit = {
    val x: Int = 1
    var y: Int = 0

    println(x)
    println(y)

    y += 1

    println(y)
    println("Hello, World")
  }

  def ex2(x: Int, y: Int): Int ={
    x + y
  }

  def ex3(): Unit ={
    val x: Int = 1
    val s: String = "a string"
    // val p: Person = Person("Regina")

    println(f"$x $s")
  }

  def ex4(x: Int, y: Int): Unit ={
    if (x > y)
      println("x is bigger than y")
    else if (y > x)
      println("y is bigger than x")
    else
      println("x is equal to y")

    val a: Int = if (x > y) x else y

    println(a)
  }

  def ex5(x: Int): String = x match{
    case 1 => "one"
    case 2 => "two"
    case _ => "unknown"
  }

  /*
  def ex6(bool: Boolean): String = bool match{
    case true => "true"
    case false => "false"
  }
   */

  def ex6(bool: Boolean): String = if (bool) {
    "true"
  } else {
    "false"
  }

  def ex7(x: Any):String = x match {
    case s: String => s + " is a String"
    case i: Int => "Int"
    case f: Float => "Float"
    case l: List[_] => "List"
    // case p: Person => "Person"
    case _ => "Unknown"
  }

  def ex8(x: Int, y: Int): Unit ={
    try {
      println(x / y)
    } catch {
      case _:  ArithmeticException => println("Division by zero")
    }
  }

  def ex9(args: List[_]): Unit ={
    for (arg <- args) print(arg + " ")

    println()

    for (i <- 0 to 5) print(i + " ")

    println()

    for (i <- 0 to 10 by 2) print(i + " ")

    println()
  }

  def ex10(): IndexedSeq[Int] ={
    val x = for (i <- 1 to 5) yield i * 2

    x
  }

  def ex11(): List[_] ={
    val fruits = List("apple", "banana", "lime", "orange")

    val fruitLengths = for {
      f <- fruits
      if f.length > 4
    } yield f.length

    fruitLengths
  }

  def ex12(a: Int, b: Int): (Int, Int) ={
    var cnt1 = 0
    var cnt2 = 0

    while(a + cnt1 < b) {
      cnt1 += 1
    }

    do {
      cnt2 += 2
    }
    while(a + cnt2 < b)

    (cnt1, cnt2)
  }

  ex1()

  val x2: Int = ex2(1, 4)

  println(x2)

  ex3()

  ex4(5, 4)
  ex4(3, 4)
  ex4(4, 4)

  println(ex5(4))

  println(ex6(true))

  println(ex7(List("a", "q")))

  ex8(1, 0)

  ex9(List(1, 2, 3))

  println(ex10())

  println(ex11())

  println(ex12(2, 4))
}
