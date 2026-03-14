package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem17Spec extends AnyFlatSpec with Matchers {

  "split" should "split a list at the given index" in {
    Problem17.split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldBe
      (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  }

  it should "return empty first part when n is 0" in {
    Problem17.split(0, List('a, 'b, 'c)) shouldBe (List(), List('a, 'b, 'c))
  }

  it should "return empty second part when n equals list length" in {
    Problem17.split(3, List('a, 'b, 'c)) shouldBe (List('a, 'b, 'c), List())
  }
}
