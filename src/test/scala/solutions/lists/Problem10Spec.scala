package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem10Spec extends AnyFlatSpec with Matchers {
  "encode" should "run-length encode a list" in {
    Problem10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe
      List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
  }

  it should "return an empty list for an empty list" in {
    Problem10.encode(List[Int]()) shouldBe List()
  }

  it should "encode a list with no duplicates" in {
    Problem10.encode(List(1, 2, 3)) shouldBe List((1, 1), (1, 2), (1, 3))
  }
}
