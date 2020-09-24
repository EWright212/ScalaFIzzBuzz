package emily

class FizzBuzz {
  def convert(number: Int): String = {
    if (number % 15 == 0) {
      "FizzBuzz"
    } else if (number % 5 == 0) {
      "Buzz"
    } else if (number % 3 == 0) {
      "Fizz"
    } else {
      number.toString
    }
  }

}
