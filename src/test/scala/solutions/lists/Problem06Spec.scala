package solutions.lists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem06Spec extends AnyFlatSpec with Matchers {
  "isPalindrome" should "return true for a palindrome" in {
    Problem06.isPalindrome(List(1, 2, 3, 2, 1)) shouldBe true
  }

  it should "return true for a single-element list" in {
    Problem06.isPalindrome(List(1)) shouldBe true
  }

  it should "return true for an empty list" in {
    Problem06.isPalindrome(List[Int]()) shouldBe true
  }

  it should "return false for a non-palindrome" in {
    Problem06.isPalindrome(List(1, 2, 3)) shouldBe false
  }

  it should "return true for an even-length palindrome" in {
    Problem06.isPalindrome(List(1, 2, 2, 1)) shouldBe true
  }
}
