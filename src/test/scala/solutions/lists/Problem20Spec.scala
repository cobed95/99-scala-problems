package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem20Spec extends AnyFlatSpec with Matchers {

  "removeAt" should "remove the element at the given index" in {
    Problem20.removeAt(1, List('a, 'b, 'c, 'd)) shouldBe (List('a, 'c, 'd), Some('b))
  }

  it should "remove the first element" in {
    Problem20.removeAt(0, List('a, 'b, 'c)) shouldBe (List('b, 'c), Some('a))
  }

  it should "remove the last element" in {
    Problem20.removeAt(2, List('a, 'b, 'c)) shouldBe (List('a, 'b), Some('c))
  }

  it should "return None for an empty list" in {
    Problem20.removeAt(0, List()) shouldBe (List(), None)
  }

  it should "return None when index is out of bounds" in {
    Problem20.removeAt(5, List('a, 'b, 'c)) shouldBe (List('a, 'b, 'c), None)
  }

  it should "remove the first element for a negative index" in {
    Problem20.removeAt(-1, List('a, 'b, 'c)) shouldBe (List('b, 'c), Some('a))
  }

  it should "handle a single-element list" in {
    Problem20.removeAt(0, List('a)) shouldBe (List(), Some('a))
  }
}
