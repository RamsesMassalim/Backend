package week4
import week4.calculator.run
import scala.io.StdIn.readLine
import util.control.Breaks._

object calculator extends App{

  def inputs(expr: String): Array[String] = {
    var arr_elements: Array[String] = Array[String]()

    var ind = 0

    for (i <- 0 until expr.length) {
      if (expr(i) == '*' || expr(i) == '+' || expr(i) ==  '-' || expr(i) ==  '/') {
        if (ind != i) {
          arr_elements :+= expr.slice(ind, i)
        }
        arr_elements :+= expr.slice(i, i + 1)
        ind = i + 1
      }
      else if (expr(i) == '=') {
        arr_elements :+= expr.slice(ind, i)
        arr_elements :+= "="
      }
    }
    arr_elements
  }

  def run(f: (Array[String], Double, String => Double) => Double, g: String => Array[String], h: String => Double): Unit = {
    var run = true
    var result: Double = 0

    breakable {
      while (run) {
        println("Write your expression or print 'exit' to finish your session")
        var expr = readLine()

        if (expr == "exit") {
          run = false
          break
        }
        var parssed_expr = g(expr)

        if (parssed_expr(0) == "/" || parssed_expr(0) == "*" || parssed_expr(0) == "-" || parssed_expr(0) == "+") {
          parssed_expr :+= result.toString
        }

        result = f(parssed_expr, result, h)

        println(result)
      }
    }
  }

  def make_number(num: String): Double = {
    var num_string = ""
    for (i <- 0 until num.length) {
      if (num(i) != ' ')
        num_string += num(i)
    }
    num_string.toDouble
  }

  def calculate(arr: Array[String], res: Double, f: String => Double): Double = {
    var result: Double = 0 + res
    var i = 0

    if (arr(0) == "*" || arr(0) == "/" || arr(0) == "+" || arr(0) == "-") {
      i += 0
    }
    else {
      i += 1
      result += f(arr(0))
    }

    breakable {
      while (arr(i) != "=") {
        try {
          arr(i) match {
            case "=" => break
            case "*" => result *= f(arr(i + 1))
            case "/" => result /= f(arr(i + 1))
            case "+" => result += f(arr(i + 1))
            case "-" => result -= f(arr(i + 1))
            case _ => i += 0
          }
          i += 1
        }
        catch {
          case _: NumberFormatException => println("Inccorect input. Please write your expression again")
          case _: ArithmeticException => println("Zero division error. Please write your expression again")
        }
      }
    }

    result
  }

  run(calculate, inputs, make_number)

  println(make_number(num = " 65465 54654 "))
}
