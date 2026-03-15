package solutions.lists

/**
  * P22: Create a list containing all integers within a given range.
  *
  * Example:
  * scala> range(4, 9)
  * res0: List[Int] = List(4, 5, 6, 7, 8, 9)
  */

object Problem22 {
  def range: (Int, Int) => List[Int] = {
    case (start, end) if start > end => Nil
    case (start, end) => start :: range(start + 1, end)
  }
}
