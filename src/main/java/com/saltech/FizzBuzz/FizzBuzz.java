package com.saltech.FizzBuzz;

public class FizzBuzz {

    public String getValueFor(Integer number) {

        if (numberDivisibleBy(number, 3) && numberDivisibleBy(number, 5)) {
            return "FizzBuzz";
        }

        if (numberDivisibleBy(number, 3)) {
            return "Fizz";
        }

        if (numberDivisibleBy(number, 5)) {
            return "Buzz";
        }

        return number.toString();
    }

    private boolean numberDivisibleBy(Integer number, Integer divisor) {
        return (number % divisor == 0);
    }

    public String getFizzBuzzString() {

        StringBuilder fizzBuzzStringBuilder = new StringBuilder();

        for (Integer i = 1; i <= 100; i++) {
            String fizzBuzzValue = getValueFor(i);
            fizzBuzzStringBuilder.append(fizzBuzzValue);
            if (i != 100) {
                fizzBuzzStringBuilder.append(",");
            }
        }

        return fizzBuzzStringBuilder.toString();
    }
}
