package week3

object decompress {
  def decompressRLElist(nums: Array[Int]): Array[Int] = {
    var ans: Array[Int] = Array.fill[Int](nums(0))(nums(1))

    for (i <- 1 until nums.length / 2) {
      ans = ans ++: Array.fill[Int](nums(2 * i))(nums(2 * i + 1))
    }
    ans
  }
}
