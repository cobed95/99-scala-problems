package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem24Spec extends AnyFlatSpec with Matchers {

  "lotto" should "return the correct number of elements" in {
    Problem24.lotto(6, 49) should have length 6
  }

  it should "only contain numbers in the range 1..M" in {
    Problem24.lotto(6, 49).foreach { n =>
      n should (be >= 1 and be <= 49)
    }
  }

  it should "return no duplicates" in {
    val result = Problem24.lotto(6, 49)
    result.distinct should have length 6
  }

  it should "return an empty list when n is 0" in {
    Problem24.lotto(0, 49) shouldBe List()
  }
}
