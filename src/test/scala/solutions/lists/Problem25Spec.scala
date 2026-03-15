package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem25Spec extends AnyFlatSpec with Matchers {

  val input = List('a, 'b, 'c, 'd, 'e, 'f)

  "randomPermute" should "return the same number of elements" in {
    Problem25.randomPermute(input) should have length input.length
  }

  it should "contain the same elements as the input" in {
    Problem25.randomPermute(input).toSet shouldBe input.toSet
  }

  it should "return an empty list for an empty list" in {
    Problem25.randomPermute(List()) shouldBe List()
  }
}
