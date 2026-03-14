package solutions.lists

import scala.annotation.tailrec

/**
  * P05: Reverse a list.
  *
  * Example:
  * scala> reverse(List(1, 1, 2, 3, 5, 8))
  * res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  */

object Problem05 {
  @tailrec
  def reverseIter[A](result: List[A])(list: List[A]): List[A] =
    list match {
      case Nil => result
      case head :: tail => reverseIter(head :: result)(tail)
    }

  def reverse[A]: List[A] => List[A] = reverseIter(Nil)
}
