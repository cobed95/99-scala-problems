package solutions.lists

/**
  * P15: Duplicate the elements of a list a given number of times.
  *
  * Example:
  * scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
  * res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  */

object Problem15 {
  def duplicateNIter[A]: (Int, Int, List[A]) => List[A] = {
    case (_, _, Nil) => Nil
    case (n, m, _ :: tl) if m <= 0 => duplicateNIter(n, n, tl)
    case (n, m, hd :: tl) => hd :: duplicateNIter(n, m - 1, hd :: tl)
  }

  def duplicateN[A](n: Int, list: List[A]): List[A] =
    duplicateNIter(n, n, list)
}
