package solutions.lists

/**
  * P09: Pack consecutive duplicates of list elements into sublists.
  *
  * If a list contains repeated elements they should be placed in
  * separate sublists.
  *
  * Example:
  * scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  */

object Problem09 {
  def folder[A](acc: List[List[A]], curr: A): List[List[A]] =
    acc match {
      case packed :: tl => packed match {
        case hd :: _ if hd == curr => (curr :: packed) :: tl
        case _ :: _ => List(curr) :: packed :: tl
        case Nil => List(curr) :: tl
      }
      case Nil => List(curr) :: Nil
    }

  def pack[A](li: List[A]): List[List[A]] =
    Problem05.reverse(li.foldLeft(List[List[A]]())(folder))
}
