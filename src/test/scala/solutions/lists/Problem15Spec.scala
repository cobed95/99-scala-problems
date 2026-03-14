package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem15Spec extends AnyFlatSpec with Matchers {

  "duplicateN" should "duplicate each element N times" in {
    Problem15.duplicateN(3, List('a, 'b, 'c, 'c, 'd)) shouldBe
      List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  }

  it should "return an empty list for an empty list" in {
    Problem15.duplicateN(3, List()) shouldBe List()
  }

  it should "return the original list when n is 1" in {
    Problem15.duplicateN(1, List('a, 'b)) shouldBe List('a, 'b)
  }
}
