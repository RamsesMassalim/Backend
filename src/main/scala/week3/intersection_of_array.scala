package week3

object intersection_of_array {
  def intersection(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    val set1:  Set[Int] = nums1.toSet
    val set2:  Set[Int] = nums2.toSet

    (set1.intersect(set2)).toArray
  }
}
