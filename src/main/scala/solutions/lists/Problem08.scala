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

import util.TypeClasses.{Ord, symbolOrd, DuplicateHandler}

object Problem08 {

  // Direct solution.
  def compressDirect[A](list: List[A])(implicit ord: Ord[A]): List[A] = {
    def consume(element: A, list: List[A]): List[A] =
      list match {
        case head :: tail if ord.equiv(element, head) => consume(element, tail)
        case _ :: _ => list
        case Nil => Nil
      }

    list match {
      case head :: tail =>
        head :: compressDirect(consume(head, tail))
      case Nil => Nil
    }
  }

  // Attempt at polymorphism.
  def Consumer[A]: DuplicateHandler[A, A] = new DuplicateHandler[A, A] {
    def handle(standard: A, list: List[A])(implicit ord: Ord[A]): (A, List[A]) =
      list match {
        case head :: tail if ord.equiv(standard, head) => handle(standard, tail)
        case _ :: _ => (standard, list)
        case Nil => (standard, Nil)
      }

    def convert(element: A): A = element
  }

  def compress[A](list: List[A])(implicit ord: Ord[A]): List[A] = Consumer.compress(list)(ord)

  def test = {
    val fat = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(compress(fat)(symbolOrd))
  }
}
