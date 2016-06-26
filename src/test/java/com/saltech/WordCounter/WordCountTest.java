package com.saltech.WordCounter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class WordCountTest {

    @Test
    public void should_increase_the_count(){

        WordCount wordCount = new WordCount("boom");
        wordCount.addCount(1);
        wordCount.addCount(1);
        wordCount.addCount(1);

        assertThat(wordCount.getCount()).isEqualTo(3);
    }
}