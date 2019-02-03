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
  abstract class Ord[A] {
    def equiv(x: A, y: A): Boolean
  }

  implicit val symbolOrd: Ord[Symbol] = new Ord[Symbol] {
    def equiv(x: Symbol, y: Symbol): Boolean = x == y
  }

  def compress[A](list: List[A])(implicit ord: Ord[A]): List[A] = {
    def consume(element: A, list: List[A]): List[A] =
      list match {
        case head :: tail if ord.equiv(element, head) => consume(element, tail)
        case _ :: _ => list
        case Nil => Nil
      }

    list match {
      case head :: tail =>
        head :: compress(consume(head, tail))
      case Nil => Nil
    }
  }

  def test = {
    val fat = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(compress(fat)(symbolOrd))
  }
}
