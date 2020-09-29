package emily

class FizzBuzz {
  def convert(number: Int): String = {
    var output = ""
    if (number % 3 == 0) {
      output+= "Fizz"
    }
    if (number % 5 == 0) {
      output += "Buzz"
    }
    if (output == "") {
      output = number.toString
    }
    output
  }

}
