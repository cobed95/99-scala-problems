package solutions.lists

/**
  * P21: Insert an element at a given position into a list.
  *
  * Example:
  * scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
  * res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
  */

object Problem21 {
  def insertAt[A]: (A, Int, List[A]) => List[A] = {
    case (el, _, Nil) => el :: Nil
    case (el, i, li) if i <= 0 => el :: li
    case (el, i, hd :: tl) => hd :: insertAt(el, i - 1, tl)
  }
}
