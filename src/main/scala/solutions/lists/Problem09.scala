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


import util.TypeClasses.{Ord, symbolOrd, DuplicateHandler}

object Problem09 {
  def Packer[A]: DuplicateHandler[A, List[A]] = new DuplicateHandler[A, List[A]] {
    def handle(standard: List[A], list: List[A])(implicit ord: Ord[A]): (List[A], List[A]) =
      list match {
        case head :: tail if ord.equiv(standard.head, head) =>
          handle(head :: standard, tail)
        case _ :: _ =>
          (standard, list)
        case Nil => (standard, Nil)
      }

    def convert(element: A): List[A] = List(element)
  }

  def pack[A](list: List[A])(implicit ord: Ord[A]): List[List[A]] =
    Packer.compress(list)(ord)

  def test = {
    val fat = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(pack(fat)(symbolOrd))
  }
}
