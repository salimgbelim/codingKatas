package com.saltech.WordCounter;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WordCounterTest {

    @Test
    public void should_return_word_count() {

        WordCounter wordCounter = new WordCounter();

        List<WordCount> wordCountList = wordCounter.count("boom,bang,boom");

        assertThat(wordCountList.size()).isEqualTo(2);

    }

    @Test
    public void should_return_2_as_boom_count() {

        WordCounter wordCounter = new WordCounter();

        List<WordCount> wordCountList = wordCounter.count("boom,bang,boom");
        WordCount wordCount =  wordCountList.get(0);

        assertThat(wordCount.getName()).isEqualTo("boom");
        assertThat(wordCount.getCount()).isEqualTo(2);


    }


    @Test
    public void should_return_1_as_bang_count() {

        WordCounter wordCounter = new WordCounter();

        List<WordCount> wordCountList = wordCounter.count("boom,bang,boom");
        WordCount wordCount =  wordCountList.get(1);

        assertThat(wordCount.getName()).isEqualTo("bang");
        assertThat(wordCount.getCount()).isEqualTo(1);


    }

    @Test
    public void should_return_2_as_boom_count_v1() {

        WordCounter wordCounter = new WordCounter();

        HashMap<String,Integer> wordCountList = wordCounter.countV1("boom,bang,boom");
        Integer count = wordCountList.get("boom");

        assertThat(count).isEqualTo(2);
    }


    @Test
    public void should_return_1_as_bang_count_v1() {

        WordCounter wordCounter = new WordCounter();

        HashMap<String,Integer> wordCountList = wordCounter.countV1("boom,bang,boom");
        Integer count = wordCountList.get("bang");

        assertThat(count).isEqualTo(1);


    }
}
