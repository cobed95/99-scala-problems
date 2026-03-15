package solutions.lists

/**
  * P24: Lotto: Draw N different random numbers from the set 1..M.
  *
  * Example:
  * scala> lotto(6, 49)
  * res0: List[Int] = List(23, 1, 17, 33, 21, 37)
  */

object Problem24 {
  def lotto(n: Int, m: Int): List[Int] = {
    val range = Problem22.range(1, m)
    Problem23.randomSelect(n, range)
  }
}
