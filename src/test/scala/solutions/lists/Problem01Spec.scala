package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem01Spec extends AnyFlatSpec with Matchers {

  "last" should "return the last element" in {
    Problem01.last(List(1, 1, 2, 3, 5, 8)) shouldBe Some(8)
  }

  it should "return the only element of a single-element list" in {
    Problem01.last(List(42)) shouldBe Some(42)
  }

  it should "return None for an empty list" in {
    Problem01.last(List()) shouldBe None
  }
}
