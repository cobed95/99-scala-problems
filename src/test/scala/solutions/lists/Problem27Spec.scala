package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem27Spec extends AnyFlatSpec with Matchers {

  val people = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")

  "group3" should "generate groups of 2, 3, and 4" in {
    val result = Problem27.group3(people)
    result should have length 1260
    result.foreach { groups =>
      groups.map(_.length) shouldBe List(2, 3, 4)
    }
  }

  it should "use all elements in each grouping" in {
    Problem27.group3(people).foreach { groups =>
      groups.flatten.sorted shouldBe people.sorted
    }
  }

  "group" should "generate groups of specified sizes" in {
    val result = Problem27.group(List(2, 2, 5), people)
    result.foreach { groups =>
      groups.map(_.length) shouldBe List(2, 2, 5)
      groups.flatten.sorted shouldBe people.sorted
    }
  }
}
