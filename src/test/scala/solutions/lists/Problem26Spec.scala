package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem26Spec extends AnyFlatSpec with Matchers {

  "combinations" should "generate all C(n,k) combinations" in {
    val result = Problem26.combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
    result should have length 20 // C(6,3) = 20
  }

  it should "include expected combinations" in {
    val result = Problem26.combinations(2, List(1, 2, 3))
    result should contain allOf (List(1, 2), List(1, 3), List(2, 3))
  }

  it should "return a single empty list when k is 0" in {
    Problem26.combinations(0, List(1, 2, 3)) shouldBe List(List())
  }

  it should "return a single combination when k equals list length" in {
    Problem26.combinations(3, List(1, 2, 3)) shouldBe List(List(1, 2, 3))
  }
}
