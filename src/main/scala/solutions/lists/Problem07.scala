package solutions.lists

/**
  * P07: Flatten a nested list structure.
  *
  * Example:
  * scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  * res0: List[Any] = List(1, 1, 2, 3, 5, 8)
  */

object Problem07 {
  def flatten(li: List[Any]): List[Any] = li flatMap {
    case nested: List[_] => flatten(nested)
    case hd => List(hd)
  }
}
