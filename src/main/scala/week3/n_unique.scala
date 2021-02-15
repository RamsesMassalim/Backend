package week3

object n_unique {
  def sumZero(n: Int): Array[Int] = {
    if (n == 2) {
      return Array(-1, 1)
    }
    else {
      var ans: Array[Int] = Array.fill[Int](n)(0)

      for (i <- 0 until n - 1) {
        ans(i) = i
      }

      ans(n - 1) = - (n - 1) * (n - 2) / 2

      return ans
    }
  }
}
