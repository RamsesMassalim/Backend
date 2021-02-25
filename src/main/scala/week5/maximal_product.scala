package week5

object maximal_product {
  def maxProduct(nums: Array[Int]): Int = {
    val two_max_elements = nums.sortWith(_ < _).slice(nums.length - 2, nums.length).map(_ - 1)
    two_max_elements(0) * two_max_elements(1)
  }
}
