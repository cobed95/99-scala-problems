package util

object TypeClasses {
  abstract class Ord[A] {
    def equiv(x: A, y: A): Boolean
  }

  implicit val symbolOrd: Ord[Symbol] = new Ord[Symbol] {
    def equiv(x: Symbol, y: Symbol): Boolean = x == y
  }

  abstract class DuplicateHandler[A, B] {
    def handle(standard: B, list: List[A])(implicit ord: Ord[A]): (B, List[A])
    def convert(element: A): B
    def compress(list: List[A])(implicit ord: Ord[A]): List[B] =
      list match {
        case head :: tail =>
          val handledPair = handle(convert(head), tail)
          handledPair._1 :: compress(handledPair._2)
        case Nil => Nil
      }
  }
}
