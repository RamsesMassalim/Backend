package week3
import util.control.Breaks._

object build_an_array {
  def buildArray(target: Array[Int], n: Int): List[String] = {
    var ans: List[String] = List[String]()
    var cnt: Int = 0

    breakable {
      for (i <- 1 to n) {
        if (cnt == target.length) {
          break
        }
        if (target(cnt) == i) {
          ans :+= "Push"
          cnt += 1
        }
        else {
          ans :+=  "Push"
          ans :+=  "Pop"
        }
      }
    }

    ans
  }
}
