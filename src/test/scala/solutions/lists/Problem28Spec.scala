package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem28Spec extends AnyFlatSpec with Matchers {

  val input = List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))

  "lsort" should "sort sublists by length" in {
    Problem28.lsort(input) shouldBe
      List(List('o), List('d, 'e), List('d, 'e), List('m, 'n), List('a, 'b, 'c), List('f, 'g, 'h), List('i, 'j, 'k, 'l))
  }

  it should "return an empty list for an empty list" in {
    Problem28.lsort(List()) shouldBe List()
  }

  "lsortFreq" should "sort sublists by length frequency" in {
    Problem28.lsortFreq(input) shouldBe
      List(List('i, 'j, 'k, 'l), List('o), List('a, 'b, 'c), List('f, 'g, 'h), List('d, 'e), List('d, 'e), List('m, 'n))
  }

  it should "return an empty list for an empty list" in {
    Problem28.lsortFreq(List()) shouldBe List()
  }
}
