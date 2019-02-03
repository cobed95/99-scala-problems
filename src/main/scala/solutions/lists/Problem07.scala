package solutions.lists

/**
  * P07: Flatten a nested list structure.
  *
  * Example:
  * scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  * res0: List[Any] = List(1, 1, 2, 3, 5, 8)
  */

object Problem07 {
  def flatten(list: List[Any]): List[Any] =
    list match {
      case head :: tail if head.isInstanceOf[List[Any]] =>
        val nested = head.asInstanceOf[List[Any]]
        flatten(nested) ::: flatten(tail)
      case head :: tail =>
        head :: flatten(tail)
      case Nil => Nil
    }

  def test = {
    val nested = List(List(1, 1), 2, List(3, List(5, 8)))
    println(flatten(nested))
  }
}
