package emily

class FizzBuzz {
  def convert(number: Int): String = {
    if (number % 3 == 0) {
      "Fizz"
    } else if(number == 5){
      "Buzz"
    } else {
      number.toString
    }

  }

}
