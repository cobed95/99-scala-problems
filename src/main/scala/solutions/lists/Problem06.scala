package solutions.lists

/**
  * P06: Find out if a list is a palindrome.
  *
  * Example:
  * scala> isPalindrome(List(1, 2, 3, 2, 1))
  * res0: Boolean = true
  */

object Problem06 {
  def isPalindrome[A](list: List[A])(implicit ord: Ordering[A]): Boolean = {
    def getLengthAndReversed(length: Int, left: List[A], right: List[A]): (Int, List[A]) =
      right match {
        case head :: tail => getLengthAndReversed(length + 1, head :: left, tail)
        case Nil => (length, left)
      }

    def equivToNElements(n: Int, left: List[A], right: List[A]): Boolean =
      if (n > 0)
        (left, right) match {
          case (lhead :: ltail, rhead :: rtail) if ord.equiv(lhead, rhead) =>
            equivToNElements(n - 1, ltail, rtail)
          case (_ :: _, _ :: _) => false
        }
      else
        (left, right) match {
          case (lhead :: _, rhead :: _) =>
            ord.equiv(lhead, rhead)
          case (Nil, _ :: _) => false
          case (_ :: _, Nil) => false
          case (Nil, Nil) => true
        }

    val pair = getLengthAndReversed(0, Nil, list)
    val length = pair._1
    val reversed = pair._2
    equivToNElements(length / 2, reversed, list)
  }
}
