package week3

/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     def f(x: Int, y: Int): Int = {}
 * };
 */


object find_positive_int {
  def findSolution(customfunction: CustomFunction, z: Int): List[List[Int]] = {
    var ans: List[List[Int]] = List[List[Int]]()

    for (x <- 1 to 1000; y <- 1 to 1000) {
      if (customfunction.f(x, y) == z) {
        ans = List(x, y) :: ans

      }
    }
    ans
  }
}
