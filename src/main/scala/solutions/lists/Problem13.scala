package solutions.lists

/**
  * P13: Run-length encoding of a list (direct solution).
  *
  * Implement the so-called run-length encoding data compression method
  * directly. I.e. don't use other methods you've written (like P09's
  * pack); do all the work directly.
  *
  * Example:
  * scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  */

object Problem13 {
  def encodeDirect[A]: List[A] => List[(Int, A)] = {
    case Nil => Nil
    case hd :: tl => encodeDirect(tl) match {
      case Nil => (1, hd) :: Nil
      case (n, el) :: tl if hd == el => (n + 1, el) :: tl
      case orig :: tl => (1, hd) :: orig :: tl
    }
  }
}
