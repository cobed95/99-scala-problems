package solutions.lists

/**
  * P08: Eliminate consecutive duplicates of list elements.
  *
  * If a list contains repeated elements they should be replaced
  * with a single copy of the element. The order of the elements
  * should not be changed.
  *
  * Example:
  * scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
  */
object Problem08 {
  def compressIter[A](curr: A, li: List[A]): List[A] =
    li match {
      case hd :: tl if hd == curr => compressIter(hd, tl)
      case hd :: tl => curr :: compressIter(hd, tl)
      case Nil => curr :: Nil
    }

  def compress[A]: List[A] => List[A] = {
    case Nil => Nil
    case hd :: tl => compressIter(hd, tl)
  }
}
