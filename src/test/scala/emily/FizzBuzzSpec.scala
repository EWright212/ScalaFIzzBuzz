package emily

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should


class FizzBuzzSpec extends AnyFlatSpec with should.Matchers {

  "FizzBuzz" should "return an ordinary number" in {
    var FizzBuzz = new FizzBuzz
    FizzBuzz.convert(1) should be("1")
    FizzBuzz.convert(2) should be("2")
  }
  "FizzBuzz" should "return an Fizz for multiples of three" in {
    var FizzBuzz = new FizzBuzz
    FizzBuzz.convert(3) should be("Fizz")
  }

}
