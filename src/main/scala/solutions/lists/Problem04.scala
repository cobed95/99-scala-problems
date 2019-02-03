package solutions.lists

/**
  * P04: Find the number of elements of a list.
  *
  * Example:
  * scala> length(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 6
  */

object Problem04 {
  def length[A](list: List[A]): Int = {
    def lengthIter(n: Int, list: List[A]): Int =
      list match {
        case Nil => n
        case _ :: tail => lengthIter(n + 1, tail)
      }

    lengthIter(0, list)
  }
}
