package emily

class FizzBuzz {
  def convert(number: Int): String = {
    if (number % 3 == 0) {
      "Fizz"
    } else {
      number.toString
    }

  }

}
