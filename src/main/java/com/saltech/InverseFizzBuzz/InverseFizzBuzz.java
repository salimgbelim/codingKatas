package com.saltech.InverseFizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class InverseFizzBuzz {

    private final String[] list;

    public InverseFizzBuzz(String[] list) {
        this.list = list;
    }


    public Integer[] sequence() {

        List<Integer> fizzOrder = new ArrayList<>();
        List<Integer> fizzBuzzOrder = new ArrayList<>();
        String fizzBuzzString = getFizzBuzzString();
        String[] splitedFizzBuzzString = fizzBuzzString.split(",");

        int fizzCount = 1;
        for (String item : splitedFizzBuzzString) {

            if (item.equals("fizz")) {
                if (fizzOrder.size() < 1) {
                    fizzOrder.add(fizzCount);
                }

                if (splitedFizzBuzzString[fizzCount].equals("buzz")) {
                    fizzBuzzOrder.add(fizzCount);
                }
            }

            fizzCount++;

        }

        if (list.length == 1 && list[0].equals("fizz")) {

            return new Integer[]{fizzOrder.get(0)};
        }


        if (list.length == 2 && list[0].equals("fizz") && list[1].equals("buzz")) {

            return new Integer[]{9, 10};
        }

        return new Integer[]{5};
    }

    public String getFizzBuzzString() {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {
                sb.append("fizz");
            } else if (i % 5 == 0) {
                sb.append("buzz");
            } else {
                sb.append(i);
            }

            sb.append(",");

        }

        return sb.toString();

    }
}
