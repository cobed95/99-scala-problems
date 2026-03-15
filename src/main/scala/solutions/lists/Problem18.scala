package solutions.lists

/**
  * P18: Extract a slice from a list.
  *
  * Given two indices, I and K, the slice is the list containing the
  * elements from and including the Ith element up to but not including
  * the Kth element of the original list. Start counting the elements
  * with 0.
  *
  * Example:
  * scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('d, 'e, 'f, 'g)
  */

object Problem18 {
  def slice[A]: (Int, Int, List[A]) => List[A] = {
    case (_, _, Nil) => Nil
    case (i, k, _ :: tl) if i > 0 => slice(i - 1, k - 1, tl)
    case (i, k, hd :: tl) if k > 0 => hd :: slice(i, k - 1, tl)
    case (_, _, _ :: _) => Nil
  }
}
