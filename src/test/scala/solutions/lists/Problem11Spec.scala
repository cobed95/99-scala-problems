package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem11Spec extends AnyFlatSpec with Matchers {

  "encodeModified" should "encode with singletons unwrapped" in {
    Problem11.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe
      List((4, 'a), 'b, (2, 'c), (2, 'a), 'd, (4, 'e))
  }

  it should "return an empty list for an empty list" in {
    Problem11.encodeModified(List()) shouldBe List()
  }

  it should "return bare elements when all are unique" in {
    Problem11.encodeModified(List('a, 'b, 'c)) shouldBe List('a, 'b, 'c)
  }

  it should "return tuples when all are duplicated" in {
    Problem11.encodeModified(List('a, 'a, 'b, 'b)) shouldBe List((2, 'a), (2, 'b))
  }
}
