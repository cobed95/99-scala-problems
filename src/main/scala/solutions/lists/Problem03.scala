package solutions.lists

/**
  * P03: Find the Kth element of a list.
  *
  * Example:
  * scala> nth(2, List(1, 1, 2, 3, 5, 8))
  * res0: Int = 2
  */

object Problem03 {
  def nth[A]: (Int, List[A]) => Option[A] = {
    case (n, _) if n < 0 => None
    case (n, head :: _) if n == 0 => Some(head)
    case (n, _ :: tail) => nth(n - 1, tail)
    case (_, Nil) => None
  }
}
