package com.saltech.StringCalculatorImpl;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

    @Test(expected = RuntimeException.class)
    public void should_throw_exception_when_non_numbers_are_used() {

        // Act
        StringCalculator.add("1,X");

    }

    @Test
    public void should_not_throw_exception_when_valid_numbers_are_used() {

        // Act
        StringCalculator.add("1,2");

        // Assert
        assertThat(true).isTrue();
    }

    @Test
    public void should_return_zero_for_empty_string() {

        // Assert
        assertThat(StringCalculator.add("")).isZero();
    }

    @Test
    public void should_return_sum_of_the_numbers_when_one_number_passed_as_string() {

        assertThat(StringCalculator.add("3")).isEqualTo(3);
    }

    @Test
    public void should_return_sum_of_the_numbers_when_multiple_numbers_passed_as_string() {

        assertThat(StringCalculator.add("3,6")).isEqualTo(9);
    }

    @Test
    public void should_return_sum_of_the_numbers_when_multiple_numbers_passed_as_string_with_spaces() {

        assertThat(StringCalculator.add("3, 6 ")).isEqualTo(9);
    }

    @Test
    public void should_allow_any_number_of_inputs() {

        assertThat(StringCalculator.add("3,6,15,18,46,33")).isEqualTo(3 + 6 + 15 + 18 + 46 + 33);
    }

    @Test
    public void should_allow_new_line_between_numbers() {

        assertThat(StringCalculator.add("3,6\n15")).isEqualTo(3 + 6 + 15);
    }

    @Test
    public void should_return_sum_of_the_numbers_when_delimeter_is_specified() {

        assertThat(StringCalculator.add("//;\n3;6;15")).isEqualTo(3 + 6 + 15);
    }

    @Test(expected = RuntimeException.class)
    public void should_throw_exception_when_negative_number_passed() {

        StringCalculator.add("3,-6,15,18,46,33");

    }

    @Test
    public void should_ignore_number_bigger_than_100() {

        int sum = StringCalculator.add("3,1000,1001,6,1234");


        assertThat(sum).isEqualTo(3 + 1000 + 6);
    }
}
