package solutions.lists

/**
  * P19: Rotate a list N places to the left.
  *
  * Example:
  * scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
  *
  * scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
  */

object Problem19 {
  def rotate[A](n: Int, list: List[A]): List[A] =
   list match {
     case Nil => Nil
     case _ =>
      val length = Problem04.length(list)
      val mod = Math.floorMod(n, length)
      val (left, right) = Problem17.split(mod, list)
      right ::: left
  }
}
