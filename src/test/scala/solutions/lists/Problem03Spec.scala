package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem03Spec extends AnyFlatSpec with Matchers {

  "nth" should "return the element at index k" in {
    Problem03.nth(2, List(1, 1, 2, 3, 5, 8)) shouldBe Some(2)
  }

  it should "return the first element at index 0" in {
    Problem03.nth(0, List(1, 1, 2, 3, 5, 8)) shouldBe Some(1)
  }

  it should "return the last element" in {
    Problem03.nth(5, List(1, 1, 2, 3, 5, 8)) shouldBe Some(8)
  }

  it should "return None for an out-of-bounds index" in {
    Problem03.nth(6, List(1, 1, 2, 3, 5, 8)) shouldBe None
  }

  it should "return None for a negative index" in {
    Problem03.nth(-1, List(1, 2, 3)) shouldBe None
  }

  it should "return None for an empty list" in {
    Problem03.nth(0, List()) shouldBe None
  }
}
