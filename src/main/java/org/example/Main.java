package org.example;

public class Main {
    public static void main(String[] args) {
        String sentence = "   abcd -o=p- efgh";
        System.out.println(sentence);

        Anagram reverseText = new Anagram();

        String reversedSentence = reverseText.reverseText(sentence);
        System.out.println(reversedSentence);

    }
}