package com.saltech.InverseFizzBuzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InverseFizzBuzzTest {

    @Test
    public void shouldGenerateFizzUpTo100ForNumbersDivisibleBy3() {

        // Arrange
        InverseFizzBuzz inverse = new InverseFizzBuzz(new String[]{"fizz"});


        // Assert
        assertThat(inverse.getFizzBuzzString()).startsWith("1,2,fizz");

    }

    @Test
    public void shouldGenerateBuzzUpTo100ForNumbersDivisibleBy5() {

        // Arrange
        InverseFizzBuzz inverse = new InverseFizzBuzz(new String[]{"fizz"});


        // Assert
        assertThat(inverse.getFizzBuzzString()).startsWith("1,2,fizz,4,buzz");

    }

    @Test
    public void testFizz() {

        // Arrange
        InverseFizzBuzz inverse = new InverseFizzBuzz(new String[]{"fizz"});

        // Act
        Integer[] sequence = inverse.sequence();

        // Assert
        assertThat(sequence).isEqualTo(new Integer[]{3});
    }

    @Test
    public void testBuzz() {

        // Arrange
        InverseFizzBuzz inverse = new InverseFizzBuzz(new String[]{"buzz"});

        // Act
        Integer[] sequence = inverse.sequence();

        // Assert
        assertThat(sequence).isEqualTo(new Integer[]{5});
    }

    @Test
    public void testFizzBuzz() {
        InverseFizzBuzz inverse = new InverseFizzBuzz(new String[] {"fizz", "buzz"});

        // Act
        Integer[] sequence = inverse.sequence();

        assertThat(sequence).isEqualTo(new Integer[]{9, 10});

    }
}
