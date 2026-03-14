package solutions.lists

/**
  * P02: Find the last but one element of a list.
  *
  * Example:
  * scala> penultimate(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 5
  */

object Problem02 {
  def penultimate[A]: List[A] => Option[A] = {
    case head :: _ :: Nil => Some(head)
    case _ :: Nil => None
    case Nil => None
    case _ :: tail => penultimate(tail)
  }
}
