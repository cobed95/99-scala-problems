package solutions.lists

/**
  * P16: Drop every Nth element from a list.
  *
  * Example:
  * scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  */

object Problem16 {
  def dropIter[A]: (Int, Int, List[A]) => List[A] = {
    case (_, _, Nil) => Nil
    case (n, m, _ :: tl) if n <= m => dropIter(n, 1, tl)
    case (n, m, hd :: tl) => hd :: dropIter(n, m + 1, tl)
  }

  def drop[A](n: Int, list: List[A]): List[A] = dropIter(n, 1, list)
}
