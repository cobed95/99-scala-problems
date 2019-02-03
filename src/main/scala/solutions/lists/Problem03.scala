package solutions.lists

/**
  * P03: Find the Kth element of a list.
  *
  * Example:
  * scala> nth(2, List(1, 1, 2, 3, 5, 8))
  * res0: Int = 2
  */

object Problem03 {
  def nth[A](n: Int, list: List[A]): Option[A] =
    list match {
      case _ :: tail if n > 0 => nth(n - 1, tail)
      case head :: _ if n == 0 => Some(head)
      case Nil => None
      case _ if n < 0 => None
    }
}
