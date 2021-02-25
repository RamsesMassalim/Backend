package week5

object average_salary {
  def average(salary: Array[Int]): Double = {
    val sort_arr = (arr: Array[Int]) => arr.sortWith(_ < _).slice(1, arr.length - 1)

    def half_part(x: Int, n: Int): Double = x.toDouble / n

    def sum(f: (Int, Int) => Double, arr: Array[Int], i: Int, n: Int): Double =
      if (i >= n) 0
      else f(arr(i), n) + sum(f, arr, i + 1, n)

    sum(half_part, sort_arr(salary), 0, salary.length - 2)
  }
}
