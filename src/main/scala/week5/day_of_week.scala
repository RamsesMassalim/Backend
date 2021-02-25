package week5

object day_of_week {
  def dayOfTheWeek(day: Int, month: Int, year: Int): String = {
    val weeks = List("Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday")

    val code_month = Map[Int, List[Int]]((1, List(1, 10)), (2, List(5)), (3, List(8)),
      (4, List(2, 3, 11)), (5, List(6)),
      (6, List(9, 12)), (0, List(4, 7)))

    val code_century = Map[Int, Int](2100 -> 4, 2000 -> 6, 1900 -> 0, 1800 -> 2)

    val code_mon = (x: Int) => for {
      i <- code_month.keys
      if code_month(i).contains(x)
        cd = i
    } yield cd

    val code_year = (x: Int) => (code_century(x - x % 100) + x % 100 + x % 100 / 4) % 7

    val ind = (f: Int=> Iterable[Int], g: Int => Int, d: Int, m: Int, y: Int) =>
      (d + f(m).head + g(y)) % 7

    weeks(if (month == 2 && day == 29) ind(code_mon, code_year, day, month, year) - 1
    else ind(code_mon, code_year, day, month, year))
  }
}
