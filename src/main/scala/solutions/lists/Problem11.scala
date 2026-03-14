package solutions.lists

/**
  * P11: Modified run-length encoding.
  *
  * Modify the result of problem P10 in such a way that if an element
  * has no duplicates it is simply copied into the result list.
  *
  * Example:
  * scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
  */

object Problem11 {
  def folder[A](acc: List[Any], curr: A): List[Any] =
    acc match {
      case (hd: (Int, A)) :: tl if hd._2 == curr => (hd._1 + 1, hd._2) :: tl
      case (hd: (Int, A)) :: tl => curr :: hd :: tl
      case hd :: tl if hd == curr => (2, hd) :: tl
      case hd :: tl => curr :: hd :: tl
      case Nil => curr :: Nil
    }

  def encodeModified[A](list: List[A]): List[Any] =
    list.foldLeft(List[Any]())(folder).reverse
}
