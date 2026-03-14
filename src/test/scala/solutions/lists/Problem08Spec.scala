package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import util.TypeClasses.{Ord, symbolOrd}

class Problem08Spec extends AnyFlatSpec with Matchers {
  "compress" should "eliminate consecutive duplicates" in {
    Problem08.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe
      List('a, 'b, 'c, 'a, 'd, 'e)
  }

  it should "return an empty list for an empty list" in {
    Problem08.compress(List[Int]()) shouldBe List()
  }

  it should "return the same list with no consecutive duplicates" in {
    Problem08.compress(List(1, 2, 3, 4)) shouldBe List(1, 2, 3, 4)
  }

  it should "compress a list of all identical elements" in {
    Problem08.compress(List(1, 1, 1, 1)) shouldBe List(1)
  }
}
