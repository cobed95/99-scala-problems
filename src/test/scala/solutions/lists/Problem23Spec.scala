package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem23Spec extends AnyFlatSpec with Matchers {

  val input = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h)

  "randomSelect" should "return the correct number of elements" in {
    Problem23.randomSelect(3, input) should have length 3
  }

  it should "only contain elements from the original list" in {
    Problem23.randomSelect(3, input).foreach { elem =>
      input should contain(elem)
    }
  }

  it should "return no duplicates" in {
    val result = Problem23.randomSelect(5, input)
    result.distinct should have length 5
  }

  it should "return an empty list when n is 0" in {
    Problem23.randomSelect(0, input) shouldBe List()
  }
}
