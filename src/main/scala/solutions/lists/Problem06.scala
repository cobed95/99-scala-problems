package solutions.lists

/**
  * P06: Find out if a list is a palindrome.
  *
  * Example:
  * scala> isPalindrome(List(1, 2, 3, 2, 1))
  * res0: Boolean = true
  */

object Problem06 {
  def listEq[A]: (List[A], List[A]) => Boolean = {
    case (Nil, Nil) => true
    case (lhd :: ltl, rhd :: rtl) => lhd == rhd && listEq(ltl, rtl)
    case (_, _) => false
  }

  def isPalindrome[A](list: List[A]): Boolean = listEq(list, Problem05.reverse(list))
}
