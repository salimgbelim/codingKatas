package com.saltech.FizzBuzz;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_return_one_as_value(){

        String fizzBuzzValue =  fizzBuzz.getValueFor(1);

        // Act
        assertThat(fizzBuzzValue).isEqualTo("1");
    }

    @Test
    public void should_return_two_as_value(){

        String fizzBuzzValue =  fizzBuzz.getValueFor(2);

        // Act
        assertThat(fizzBuzzValue).isEqualTo("2");
    }

    @Test
    public void should_return_fizz_as_value(){

        String fizzBuzzValue =  fizzBuzz.getValueFor(3);

        // Act
        assertThat(fizzBuzzValue).isEqualTo("Fizz");
    }

    @Test
    public void should_return_fizz_as_value_for_six(){

        String fizzBuzzValue =  fizzBuzz.getValueFor(6);

        // Act
        assertThat(fizzBuzzValue).isEqualTo("Fizz");
    }

    @Test
    public void should_return_buzz_as_value(){

        String fizzBuzzValue =  fizzBuzz.getValueFor(5);

        // Act
        assertThat(fizzBuzzValue).isEqualTo("Buzz");
    }

    @Test
    public void should_return_buzz_as_value_for_10(){

        String fizzBuzzValue =  fizzBuzz.getValueFor(10);

        // Act
        assertThat(fizzBuzzValue).isEqualTo("Buzz");
    }

    @Test
    public void should_return_fizzbuzz_as_value(){

        String fizzBuzzValue =  fizzBuzz.getValueFor(15);

        // Act
        assertThat(fizzBuzzValue).isEqualTo("FizzBuzz");
    }

    @Test
    public void should_printout_fizzbuzz_string_for_one(){

        String fizzBuzzString = fizzBuzz.getFizzBuzzString();

        assertThat(fizzBuzzString).startsWith("1");
    }

    @Test
    public void should_start_with_one_comma_two_comma_fizz(){

        String fizzBuzzString = fizzBuzz.getFizzBuzzString();

        assertThat(fizzBuzzString).startsWith("1");
    }
    @Test
    public void should_end_with_nintey_eight_comma_fizz_comma_buzz(){

        String fizzBuzzString = fizzBuzz.getFizzBuzzString();

        assertThat(fizzBuzzString).endsWith("98,Fizz,Buzz");
    }

}
