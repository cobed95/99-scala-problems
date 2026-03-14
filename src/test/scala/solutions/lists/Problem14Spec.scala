package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem14Spec extends AnyFlatSpec with Matchers {

  "duplicate" should "duplicate each element" in {
    Problem14.duplicate(List('a, 'b, 'c, 'c, 'd)) shouldBe
      List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  }

  it should "return an empty list for an empty list" in {
    Problem14.duplicate(List()) shouldBe List()
  }

  it should "duplicate a single element" in {
    Problem14.duplicate(List(1)) shouldBe List(1, 1)
  }
}
