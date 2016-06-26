package com.saltech.FizzBuzzWizz;

public class FizzBuzzWizz {

    public String getValueFor(Integer number) {

        if(numberDivisibleBy(number, 3) && isPrime(number)){
            return "FizzWizz";
        }

        if (numberDivisibleBy(number, 5) && isPrime(number)) {
            return "BuzzWizz";
        }

        if(isPrime(number)){
            return "Wizz";
        }

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

    public boolean isPrime(Integer number) {

        if (number == 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
