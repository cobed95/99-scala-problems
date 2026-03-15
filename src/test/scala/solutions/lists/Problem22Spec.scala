package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem22Spec extends AnyFlatSpec with Matchers {

  "range" should "create a list of integers in the given range" in {
    Problem22.range(4, 9) shouldBe List(4, 5, 6, 7, 8, 9)
  }

  it should "return a single element when start equals end" in {
    Problem22.range(4, 4) shouldBe List(4)
  }

  it should "handle negative numbers" in {
    Problem22.range(-2, 2) shouldBe List(-2, -1, 0, 1, 2)
  }
}
