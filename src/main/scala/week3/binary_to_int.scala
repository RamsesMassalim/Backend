package week3

/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */

object binary_to_int {
  def getDecimalValue(head: ListNode): Int = {
    var sz: Int = 0
    var ln = head
    var ans: Int = 0

    while (ln != null) {
      sz += 1
      ln = ln.next
    }

    ln = head

    while (ln != null) {
      ans += ln.x * scala.math.pow(2, sz - 1).toInt
      sz -= 1
      ln = ln.next
    }

    ans
  }
}
