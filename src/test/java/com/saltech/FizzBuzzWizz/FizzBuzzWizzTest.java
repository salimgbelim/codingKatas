package com.saltech.FizzBuzzWizz;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzWizzTest {

    private FizzBuzzWizz fizzBuzzWizz;

    @Before
    public void setUp() {
        fizzBuzzWizz = new FizzBuzzWizz();
    }

    @Test
    public void should_return_one_as_value() {

        String fizzBuzzWizzValue = fizzBuzzWizz.getValueFor(1);

        // Act
        assertThat(fizzBuzzWizzValue).isEqualTo("1");
    }

    @Test
    public void should_return_Wizz_for_two() {

        String fizzBuzzWizzValue = fizzBuzzWizz.getValueFor(2);

        // Act
        assertThat(fizzBuzzWizzValue).isEqualTo("Wizz");
    }

    @Test
    public void should_return_FizzWizz_for_three() {

        String fizzBuzzWizzValue = fizzBuzzWizz.getValueFor(3);

        // Act
        assertThat(fizzBuzzWizzValue).isEqualTo("FizzWizz");
    }

    @Test
    public void should_return_4_for_four() {

        String fizzBuzzWizzValue = fizzBuzzWizz.getValueFor(4);

        // Act
        assertThat(fizzBuzzWizzValue).isEqualTo("4");
    }

    @Test
    public void should_return_BuzzWizz_for_five() {

        String fizzBuzzWizzValue = fizzBuzzWizz.getValueFor(5);

        // Act
        assertThat(fizzBuzzWizzValue).isEqualTo("BuzzWizz");
    }

    @Test
    public void should_return_Fizz_for_Six() {

        String fizzBuzzWizzValue = fizzBuzzWizz.getValueFor(6);

        // Act
        assertThat(fizzBuzzWizzValue).isEqualTo("Fizz");
    }

    @Test
    public void should_return_Wizz_for_Seven() {

        String fizzBuzzWizzValue = fizzBuzzWizz.getValueFor(7);

        // Act
        assertThat(fizzBuzzWizzValue).isEqualTo("Wizz");
    }

    @Test
    public void should_return_8_for_8() {

        String fizzBuzzWizzValue = fizzBuzzWizz.getValueFor(8);

        // Act
        assertThat(fizzBuzzWizzValue).isEqualTo("8");
    }

    @Test
    public void should_return_Fizz_for_9() {

        String fizzBuzzWizzValue = fizzBuzzWizz.getValueFor(9);

        // Act
        assertThat(fizzBuzzWizzValue).isEqualTo("Fizz");
    }

    @Test
    public void should_return_Buzz_for_10() {

        String fizzBuzzWizzValue = fizzBuzzWizz.getValueFor(10);

        // Act
        assertThat(fizzBuzzWizzValue).isEqualTo("Buzz");
    }

    @Test
    public void should_printout_fizzbuzz_string_for_one(){

        String fizzBuzzString = fizzBuzzWizz.getFizzBuzzString();

        assertThat(fizzBuzzString).startsWith("1");
    }

    @Test
    public void should_start_with_one_comma_two_comma_fizz(){

        String fizzBuzzString = fizzBuzzWizz.getFizzBuzzString();

        assertThat(fizzBuzzString).startsWith("1");
    }

    @Test
    public void should_start_with_one_comma_Wizz_comma_FizzWizz(){

        String fizzBuzzString = fizzBuzzWizz.getFizzBuzzString();

        assertThat(fizzBuzzString).startsWith("1,Wizz,FizzWizz,4,BuzzWizz");
    }


    @Test
    public void should_end_with_nintey_eight_comma_fizz_comma_buzz(){

        String fizzBuzzString = fizzBuzzWizz.getFizzBuzzString();

        assertThat(fizzBuzzString).endsWith("98,Fizz,Buzz");
    }

}
