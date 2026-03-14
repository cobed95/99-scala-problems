package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem18Spec extends AnyFlatSpec with Matchers {

  "slice" should "extract a slice from a list" in {
    Problem18.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldBe
      List('d, 'e, 'f, 'g)
  }

  it should "return an empty list when i equals k" in {
    Problem18.slice(3, 3, List('a, 'b, 'c, 'd)) shouldBe List()
  }

  it should "return the whole list when slicing from 0 to length" in {
    Problem18.slice(0, 3, List('a, 'b, 'c)) shouldBe List('a, 'b, 'c)
  }
}
