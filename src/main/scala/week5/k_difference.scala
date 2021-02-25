package week5

object k_difference {
  def findPairs(nums: Array[Int], k: Int): Int = {
    if (k == 0) {
      val mp: Map[Int, Int] = nums.groupMapReduce[Int, Int]((k: Int) => k)(_ => 1)(_ + _)
      mp.count(_._2 > 1)
    }
    else{
      val st = nums.toSet
      st.count(z => (z >= k && st(z + k)) || (z < k) && st(z + k))
    }
  }
}
