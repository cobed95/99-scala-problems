package solutions.lists

/**
  * P20: Remove the Kth element from a list.
  *
  * Return the list and the removed element in a Tuple. Elements are
  * numbered from 0.
  *
  * Example:
  * scala> removeAt(1, List('a, 'b, 'c, 'd))
  * res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
  */

object Problem20 {
  def removeAt[A]: (Int, List[A]) => (List[A], Option[A]) = {
    case (_, Nil) => (Nil, None)
    case (n, hd :: tl) if n <= 0 => (tl, Some(hd))
    case (n, hd :: tl) =>
      removeAt(n - 1, tl) match {
        case (li, el) => (hd :: li, el)
      }
  }
}
