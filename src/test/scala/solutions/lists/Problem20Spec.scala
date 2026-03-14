package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem20Spec extends AnyFlatSpec with Matchers {

  "removeAt" should "remove the element at the given index" in {
    Problem20.removeAt(1, List('a, 'b, 'c, 'd)) shouldBe (List('a, 'c, 'd), 'b)
  }

  it should "remove the first element" in {
    Problem20.removeAt(0, List('a, 'b, 'c)) shouldBe (List('b, 'c), 'a)
  }

  it should "remove the last element" in {
    Problem20.removeAt(2, List('a, 'b, 'c)) shouldBe (List('a, 'b), 'c)
  }
}
