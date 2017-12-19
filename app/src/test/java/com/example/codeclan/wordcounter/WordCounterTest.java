package com.example.codeclan.wordcounter;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 18/12/2017.
 */

public class WordCounterTest {
    String words;
    WordCounter testWords;
    HashMap<String, Integer> test;

    @Before
    public void before() {
        words = "One, two, two, three.";
        testWords = new WordCounter(words);
        test = new HashMap<>();
        test.put("One", 1);
        test.put("two", 2);
        test.put("three", 1);
    }

    @Test
    public void canWordCount() {
        String count = testWords.wordCount();
        assertEquals("4", count);
    }

    @Test
    public void canGetOccurrences() {
        HashMap<String, Integer> occurrences = testWords.wordOccurrence();
        assertEquals(test, occurrences);
    }
}
