package solutions.lists

/**
  * P10: Run-length encoding of a list.
  *
  * Use the result of problem P09 to implement the so-called
  * run-length encoding data compression method. Consecutive
  * duplicates of elements are encoded as tuples (N, E) where
  * N is the number of duplicates of the element E.
  *
  * Example:
  * scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[(Int, Symbol)] = List((4, 'a), (1, 'b), (2, 'c), (1, 'd), (4, 'e))
  */

import util.TypeClasses.{Ord, symbolOrd, DuplicateHandler}

object Problem10 {
  def Encoder[A]: DuplicateHandler[A, (Int, A)] = new DuplicateHandler[A, (Int, A)] {
    def handle(standard: (Int, A), list: List[A])(implicit ord: Ord[A]): ((Int, A), List[A]) =
      list match {
        case head :: tail if ord.equiv(standard._2, head) =>
          val newPair = (standard._1 + 1, standard._2)
          handle(newPair, tail)
        case _ =>
          (standard, list)
      }

    def convert(element: A): (Int, A) = (1, element)
  }

  def encode[A](list: List[A])(implicit ord: Ord[A]): List[(Int, A)] =
    Encoder.compress(list)(ord)

  def test = {
    val fat = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(encode(fat)(symbolOrd))
  }
}
