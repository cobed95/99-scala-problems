package solutions.lists

/**
  * P23: Extract a given number of randomly selected elements from a list.
  *
  * Hint: Use the solution to problem P20.
  *
  * Example:
  * scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
  * res0: List[Symbol] = List('e, 'd, 'a)
  */

import scala.util.Random

object Problem23 {
  def randomSelectIter[A]: (Int, Int, List[A]) => List[A] = {
    case (_, _, Nil) => Nil
    case (_, n, _ :: _) if n <= 0 => Nil
    case (l, n, hd :: tl) =>
      Problem20.removeAt(Random.nextInt(l), hd :: tl) match {
        case (li, Some(el)) => el :: randomSelectIter(l - 1, n - 1, li)
        case (_, None) => throw new Exception("Should not reach here")
      }
  }

  def randomSelect[A](n: Int, list: List[A]): List[A] =
    randomSelectIter(Problem04.length(list), n, list)
}
