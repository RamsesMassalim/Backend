package week3

object n_repeated {
  def repeatedNTimes(A: Array[Int]): Int = {
    val A_set = A.toSet
    var sum = 0

    for (arg <- A) {
      sum += arg
    }

    for (arg <- A_set) {
      sum -= arg
    }

    sum / (A.length / 2 - 1)
  }
}
