package com.lyreco.fizzbuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @ParameterizedTest
    @ValueSource(ints = {9, 12, 18, 21})
    public void shouldReturnFizz_whenNumberIsMultipleOf3(int number) {
        // Act
        String result = fizzBuzz.fizzBuzz(number);

        // Assert
        assertThat(result).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25})
    public void shouldReturnBuzz_whenNumberIsMultipleOf5(int number) {
        // Act
        String result = fizzBuzz.fizzBuzz(number);

        // Assert
        assertThat(result).isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 45, 60, 75})
    public void shouldReturnFizzBuzz_whenNumberIsMultipleOf15(int number) {
        // Act
        String result = fizzBuzz.fizzBuzz(number);

        // Assert
        assertThat(result).isEqualTo("FizzBuzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 13, 23, 30})
    public void shouldReturnLucky_whenNumberContainsAThree(int number) {
        // Act
        String result = fizzBuzz.fizzBuzz(number);

        // Assert
        assertThat(result).isEqualTo("Lucky");
    }
}