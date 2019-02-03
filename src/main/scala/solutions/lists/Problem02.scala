package solutions.lists

/**
  * P02: Find the last but one element of a list.
  *
  * Example:
  * scala> penultimate(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 5
  */

object Problem02 {
  def penultimate[A](list: List[A]): Option[A] =
    list match {
      case first :: _ :: Nil => Some(first)
      case _ :: Nil => None
      case _ :: tail => penultimate(tail)
      case _ => None
    }
}
