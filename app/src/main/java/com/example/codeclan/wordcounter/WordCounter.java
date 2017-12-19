package com.example.codeclan.wordcounter;

import java.util.HashMap;

/**
 * Created by user on 18/12/2017.
 */

public class WordCounter {
    String words;

    public WordCounter(String inputWords) {
        this.words = inputWords;
    }

    public String wordCount() {
        String[] wordArray = words.split(" ");
        Integer count = wordArray.length;
        return count.toString();
    }

    public void removeCharacters() {
        words = words.replace(",", "");
        words = words.replace(".", "");

    }

    public String[] splitString() {
        return words.split(" ");
    }

    public HashMap wordOccurrence() {
        removeCharacters();
        String[] wordArray = splitString();
        return countWords(wordArray);
    }

    public HashMap countWords(String[] inputArray) {
        HashMap<String, Integer> occurrences = new HashMap<>();
        for (String word : inputArray) {
            if (occurrences.containsKey(word)) {
                Integer count = occurrences.get(word);
                occurrences.put(word, count + 1);
            } else {
                occurrences.put(word, 1);
            }
        } return occurrences;
    }

}
