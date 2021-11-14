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
        String words[] = body.split(" ");
        int current = 0;
        int longest = 0;
        String longestWord = "";

        for (int i = 0; i < words.length; i++) {
            current = words[i].length();

            if (current > longest) {
                longest = current;
                longestWord = words[i];
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
}
