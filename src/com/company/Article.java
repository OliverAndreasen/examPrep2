package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Article {
    private String heading;
    private String body;
    private String author;

    public Article(String heading, String body, String author) {
        this.heading = heading;
        this.body = body;
        this.author = author;
    }

    public String getLongestWord() {
        String result = "";
        String[] words = body.split(" ");
        int current = 0;
        int longest = 0;
        String longestWord = "";

        for (String word : words) {
            current = word.length();

            if (current > longest) {
                longest = current;
                longestWord = word;
            }
        }
        return longestWord;
    }

    public ArrayList getWords() {
        ArrayList<String> allWords = new ArrayList<>(Arrays.asList(body.split(" ")));
        ArrayList<String> uniqueWords = new ArrayList<>();
        for (String word : allWords) {
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            }
        }
        return uniqueWords;
    }

    public String getUniqueWordsToString() {
        String result = "";
        for (int i = 0; i < getWords().size(); i++) {

            result += getWords().get(i);
            result += " ";
        }
        return result;
    }
}
