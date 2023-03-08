fun fizzBuzz(number: Int): String {
    if (number.isMultiple(5) && number.isMultiple(3)) return "FizzBuzz"
    if (number.isMultiple(3)) return "Fizz"
    if (number.isMultiple(5)) return "Buzz"
    return number.toString()
}

private fun Int.isMultiple(multiplier: Int) = this % multiplier == 0
