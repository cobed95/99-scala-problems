package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem05Spec extends AnyFlatSpec with Matchers {

  "reverse" should "reverse a list" in {
    Problem05.reverse(List(1, 1, 2, 3, 5, 8)) shouldBe List(8, 5, 3, 2, 1, 1)
  }

  it should "return an empty list for an empty list" in {
    Problem05.reverse(List()) shouldBe List()
  }

  it should "return the same list for a single-element list" in {
    Problem05.reverse(List(1)) shouldBe List(1)
  }
}
