package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem04Spec extends AnyFlatSpec with Matchers {

  "length" should "return the length of a list" in {
    Problem04.length(List(1, 1, 2, 3, 5, 8)) shouldBe 6
  }

  it should "return 0 for an empty list" in {
    Problem04.length(List()) shouldBe 0
  }

  it should "return 1 for a single-element list" in {
    Problem04.length(List(42)) shouldBe 1
  }
}
