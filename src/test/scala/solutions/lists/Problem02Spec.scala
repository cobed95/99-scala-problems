package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem02Spec extends AnyFlatSpec with Matchers {

  "penultimate" should "return the penultimate element" in {
    Problem02.penultimate(List(1, 1, 2, 3, 5, 8)) shouldBe Some(5)
  }

  it should "return the first element of a two-element list" in {
    Problem02.penultimate(List(1, 2)) shouldBe Some(1)
  }

  it should "return None for a single-element list" in {
    Problem02.penultimate(List(1)) shouldBe None
  }

  it should "return None for an empty list" in {
    Problem02.penultimate(List()) shouldBe None
  }
}
