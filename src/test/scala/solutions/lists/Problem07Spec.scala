package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem07Spec extends AnyFlatSpec with Matchers {

  "flatten" should "flatten a nested list" in {
    Problem07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) shouldBe List(1, 1, 2, 3, 5, 8)
  }

  it should "return the same list if already flat" in {
    Problem07.flatten(List(1, 2, 3)) shouldBe List(1, 2, 3)
  }

  it should "return an empty list for an empty list" in {
    Problem07.flatten(List()) shouldBe List()
  }

  it should "handle deeply nested lists" in {
    Problem07.flatten(List(List(List(List(1))))) shouldBe List(1)
  }
}
