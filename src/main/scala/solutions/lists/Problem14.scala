package solutions.lists

/**
  * P14: Duplicate the elements of a list.
  *
  * Example:
  * scala> duplicate(List('a, 'b, 'c, 'c, 'd))
  * res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  */

object Problem14 {
  def duplicate[A]: List[A] => List[A] = {
    case Nil => Nil
    case hd :: tl => hd :: hd :: duplicate(tl)
  }
}
