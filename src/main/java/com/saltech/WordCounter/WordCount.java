package com.saltech.WordCounter;

public class WordCount {
    private String name;
    private Integer count = 0;

    public WordCount(String item) {
        this.name = item;
    }

    public String getName() {
        return name;
    }

    public Integer getCount() {
        return count;
    }

    public void addCount(Integer count) {
        this.count += count;
    }
}
