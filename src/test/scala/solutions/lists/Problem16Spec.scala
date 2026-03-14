package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem16Spec extends AnyFlatSpec with Matchers {

  "drop" should "drop every Nth element" in {
    Problem16.drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldBe
      List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  }

  it should "return an empty list for an empty list" in {
    Problem16.drop(3, List()) shouldBe List()
  }

  it should "drop every element when n is 1" in {
    Problem16.drop(1, List('a, 'b, 'c)) shouldBe List()
  }

  it should "drop nothing when n exceeds list length" in {
    Problem16.drop(5, List('a, 'b, 'c)) shouldBe List('a, 'b, 'c)
  }
}
