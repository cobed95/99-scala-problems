package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import util.TypeClasses.{Ord, symbolOrd}

class Problem09Spec extends AnyFlatSpec with Matchers {

  implicit val intOrd: Ord[Int] = new Ord[Int] {
    def equiv(x: Int, y: Int): Boolean = x == y
  }

  "pack" should "pack consecutive duplicates into sublists" in {
    Problem09.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe
      List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  }

  it should "return an empty list for an empty list" in {
    Problem09.pack(List[Int]()) shouldBe List()
  }

  it should "wrap each element in a list when there are no duplicates" in {
    Problem09.pack(List(1, 2, 3)) shouldBe List(List(1), List(2), List(3))
  }
}
