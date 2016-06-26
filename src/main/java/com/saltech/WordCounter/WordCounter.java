package com.saltech.WordCounter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class WordCounter {

    public List<WordCount> count(String inputString) {

        String[] inputStringArray = inputString.split(",");
        ArrayList<WordCount> wordCounts = new ArrayList<>();

        for (String item : inputStringArray) {

            Stream<WordCount> wordCountStream = wordCounts.stream().filter(x -> x.getName().equals(item));

            if (wordCountStream.findAny().isPresent()) {
                Optional<WordCount> first = wordCounts.stream().filter(x -> x.getName().equals(item)).findFirst();
                if (first.isPresent()) {
                    WordCount wordCount = first.get();
                    wordCount.addCount(1);
                }
            } else {
                WordCount wordCount = new WordCount(item);
                wordCount.addCount(1);
                wordCounts.add(wordCount);
            }
        }

        return wordCounts;
    }

    public HashMap<String, Integer> countV1(String inputString) {

        String[] words = inputString.split(",");
        HashMap<String, Integer> wordCounter = new HashMap<>();

        for (String word : words) {

            if (wordCounter.containsKey(word)) {
                Integer integer = wordCounter.get(word);
                wordCounter.put(word, integer + 1);
            } else {
                wordCounter.put(word, 1);
            }
        }

        return wordCounter;
    }

}
