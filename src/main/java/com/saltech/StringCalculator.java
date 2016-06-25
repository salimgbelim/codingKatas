package com.saltech;

public class StringCalculator {

    private static final int ZERO = 0;

    public static int add(String input) {

        if (input.isEmpty()) {
            return ZERO;
        }

        String delimiter = getDelimiterFromInput(input);

        String inputWithDelimiterRemoved = input.substring(input.indexOf(delimiter.replace("|", "")) + 1, input.length());

        return Sum(inputWithDelimiterRemoved, delimiter);

    }

    private static String getDelimiterFromInput(String input) {

        String defaultDelimiter = ",|\n";

        if (input.startsWith("//")) {
            int inputDelimiterIndex = input.indexOf("//") + 2;
            String inputDelimiter = input.substring(inputDelimiterIndex, inputDelimiterIndex + 1);
            return inputDelimiter + "|\n";
        }

        return defaultDelimiter;
    }

    private static int Sum(String input, String delimiter) {

        int sum = ZERO;

        String[] numbersArray = input.split(delimiter);

        for (String number : numbersArray) {

            if (!number.isEmpty()) {

                int integerNumber = Integer.parseInt(number.trim());

                if (integerNumber < 0) {
                    throw new RuntimeException("Negative Number are not allowed");
                }

                if (integerNumber > 1000) {
                    continue;
                }
                sum += integerNumber;
            }
        }

        return sum;
    }
}
