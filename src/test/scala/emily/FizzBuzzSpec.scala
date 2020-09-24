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
    FizzBuzz.convert(6) should be("Fizz")
  }
  "FizzBuzz" should "return an Buzz for multiples of five" in {
    var FizzBuzz = new FizzBuzz
    FizzBuzz.convert(5) should be("Buzz")
    FizzBuzz.convert(10) should be("Buzz")
  }

}
