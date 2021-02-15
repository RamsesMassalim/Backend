package week3
import scala.util.control.Breaks._

object k_weakest {
  def kWeakestRows(mat: Array[Array[Int]], k: Int): Array[Int] = {
    var ans: Array[Int] = Array.fill[Int](k)(0)
    var cnt: Int = 0
    var j: Int = 0
    var mp: scala.collection.mutable.Map[Int, Array[Int]] = scala.collection.mutable.Map[Int, Array[Int]]()

    for (i <- 0 until mat.length) {
      mp(i) = mat(i)
    }

    breakable {
      while (j != mat(0).length) {
        for (i <- mp.keys) {
          if (mp(i)(j) == 0) {
            ans(cnt) = i
            cnt += 1
            mp remove i

            if (cnt == k) {
              break
            }
          }
        }
        j += 1
        if (cnt == k) {
          break
        }
      }
    }
    breakable {
      for (i <- mp.keys) {
        if (cnt != k) {
          ans(cnt) = i
          mp remove i
          cnt += 1
        }
        else {
          break
        }
      }
    }
    ans
  }
}
