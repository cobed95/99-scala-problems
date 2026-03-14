package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem13Spec extends AnyFlatSpec with Matchers {

  "encodeDirect" should "directly run-length encode a list" in {
    Problem13.encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe
      List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
  }

  it should "return an empty list for an empty list" in {
    Problem13.encodeDirect(List()) shouldBe List()
  }

  it should "encode a list with no duplicates" in {
    Problem13.encodeDirect(List('a, 'b, 'c)) shouldBe List((1, 'a), (1, 'b), (1, 'c))
  }
}
