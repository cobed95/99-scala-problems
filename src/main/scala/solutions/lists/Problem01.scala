package solutions.lists

/**
  * P01: Find the last element of a list.
  *
  * Example:
  * scala> last(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 8
  */

object Problem01 {
  def last[A](list: List[A]): Option[A] =
    list match {
      case head :: Nil => Some(head)
      case _ :: tail => last(tail)
      case _ => None
    }
}
