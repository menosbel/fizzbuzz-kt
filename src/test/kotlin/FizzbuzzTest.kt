import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class FizzbuzzTest {
    @ParameterizedTest
    @CsvSource(
        "1, 1",
        "2, 2",
        "4, 4",
    )
    fun `regular number returns same number`(number: Int, expected: String) {
        val result = fizzBuzz(number)

        assertThat(result).isEqualTo(expected)
    }

    @Test
    fun `multiple of three return Fizz`() {
        val result = fizzBuzz(3)

        assertThat(result).isEqualTo("Fizz")
    }

    @Test
    fun `multiple of five return Buzz`() {
        val result = fizzBuzz(5)

        assertThat(result).isEqualTo("Buzz")
    }

    @Test
    fun `multiple of five and three return FizzBuzz`() {
        val result = fizzBuzz(15)

        assertThat(result).isEqualTo("FizzBuzz")
    }
}

