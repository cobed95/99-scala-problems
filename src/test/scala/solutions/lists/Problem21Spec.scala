package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem21Spec extends AnyFlatSpec with Matchers {

  "insertAt" should "insert an element at the given position" in {
    Problem21.insertAt('new, 1, List('a, 'b, 'c, 'd)) shouldBe List('a, 'new, 'b, 'c, 'd)
  }

  it should "insert at the beginning" in {
    Problem21.insertAt('new, 0, List('a, 'b, 'c)) shouldBe List('new, 'a, 'b, 'c)
  }

  it should "insert at the end" in {
    Problem21.insertAt('new, 3, List('a, 'b, 'c)) shouldBe List('a, 'b, 'c, 'new)
  }

  it should "insert into an empty list" in {
    Problem21.insertAt('new, 0, List()) shouldBe List('new)
  }
}
