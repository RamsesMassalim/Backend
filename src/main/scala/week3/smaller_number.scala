package week3

object smaller_number {
  def smallerNumbersThanCurrent(nums: Array[Int]): Array[Int] = {
    var arr: Array[Int] = Array.fill[Int](nums.length)(0)

    for (i <- 0 until nums.length; j <- 0 until nums.length) {
      if (nums(i) > nums(j))
        arr(i) += 1
    }
    arr
  }
}
