package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem19Spec extends AnyFlatSpec with Matchers {

  val sample = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)

  "rotate" should "rotate left by a positive number" in {
    Problem19.rotate(3, sample) shouldBe
      List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
  }

  it should "rotate right by a negative number" in {
    Problem19.rotate(-2, sample) shouldBe
      List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
  }

  it should "return the same list when rotating by 0" in {
    Problem19.rotate(0, sample) shouldBe sample
  }

  it should "return an empty list for an empty list" in {
    Problem19.rotate(3, List()) shouldBe List()
  }
}
