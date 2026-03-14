package solutions.lists

/**
  * P10: Run-length encoding of a list.
  *
  * Use the result of problem P09 to implement the so-called
  * run-length encoding data compression method. Consecutive
  * duplicates of elements are encoded as tuples (N, E) where
  * N is the number of duplicates of the element E.
  *
  * Example:
  * scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[(Int, Symbol)] = List((4, 'a), (1, 'b), (2, 'c), (1, 'd), (4, 'e))
  */

object Problem10 {
  def folder[A](acc: List[(Int, A)], curr: A): List[(Int, A)] =
    acc match {
      case (cnt, el) :: tl if el == curr => (cnt + 1, el) :: tl
      case hd :: tl => (1, curr) :: hd :: tl
      case Nil => (1, curr) :: Nil
    }

  def encode[A](li: List[A]): List[(Int, A)] =
    Problem05.reverse(li.foldLeft(List[(Int, A)]())(folder))
}
