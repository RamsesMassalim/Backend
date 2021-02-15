package week3

object kids_with_candies {
  def kidsWithCandies(candies: Array[Int], extraCandies: Int): Array[Boolean] = {
    var mx: Int = candies.max

    return for {
      candy <- candies

      val ans = if (candy + extraCandies >= mx) true else false
    } yield ans
  }
}
