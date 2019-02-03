package solutions.lists

/**
  * P05: Reverse a list.
  *
  * Example:
  * scala> reverse(List(1, 1, 2, 3, 5, 8))
  * res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  */

object Problem05 {
  def reverse[A](list: List[A]): List[A] = {
    def reverseIter(left: List[A], right: List[A]): List[A] =
      right match {
        case head :: tail => reverseIter(head :: left, tail)
        case Nil => left
      }

    reverseIter(Nil, list)
  }
}
