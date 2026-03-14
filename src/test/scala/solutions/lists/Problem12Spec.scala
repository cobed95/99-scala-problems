package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem12Spec extends AnyFlatSpec with Matchers {

  "decode" should "decode a run-length encoded list" in {
    Problem12.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) shouldBe
      List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  }

  it should "return an empty list for an empty list" in {
    Problem12.decode(List()) shouldBe List()
  }

  it should "decode single-element tuples" in {
    Problem12.decode(List((1, 'a), (1, 'b), (1, 'c))) shouldBe List('a, 'b, 'c)
  }
}
