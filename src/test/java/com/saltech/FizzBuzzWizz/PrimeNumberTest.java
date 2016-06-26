package com.saltech.FizzBuzzWizz;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Enclosed.class)
public class PrimeNumberTest {

    @RunWith(Parameterized.class)
    public static class PrimeNumberParameterizeTest {

        private Integer input;
        private Boolean expected;

        public PrimeNumberParameterizeTest(Integer input, Boolean expected) {
            this.input = input;
            this.expected = expected;
        }

        private FizzBuzzWizz fizzBuzzWizz;

        @Before
        public void setUp() {
            fizzBuzzWizz = new FizzBuzzWizz();
        }


        @Parameterized.Parameters
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {2, true},
                    {2, true},
                    {5, true},
                    {7, true},
                    {11, true},
                    {13, true},
                    {17, true},
                    {9, false},
                    {21, false},
                    {27, false}
            });
        }

        @Test
        public void should_be_prime() {

            boolean isPrime = fizzBuzzWizz.isPrime(input);

            assertThat(isPrime).isEqualTo(expected);
        }


    }

    public static class SingleTests {

        private FizzBuzzWizz fizzBuzzWizz;

        @Before
        public void setUp() {
            fizzBuzzWizz = new FizzBuzzWizz();
        }

        @Test
        public void one_should_not_be_primeNumber() {

            boolean isPrime = fizzBuzzWizz.isPrime(1);

            assertThat(isPrime).isFalse();
        }


        @Test
        public void two_should_be_primeNumber() {

            boolean isPrime = fizzBuzzWizz.isPrime(2);

            assertThat(isPrime).isTrue();
        }

        @Test
        public void even_number_should_not_be_prime_number() {

            boolean isPrime = fizzBuzzWizz.isPrime(4);

            assertThat(isPrime).isFalse();
        }

    }


}
