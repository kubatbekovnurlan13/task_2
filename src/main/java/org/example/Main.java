package org.example;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String sentence = "   abcd -o=p- efgh";
        System.out.println(sentence);
        String reversedSentence = reverseText(sentence);
        System.out.println(reversedSentence);
    }

    public static String reverseText(String sentence) {

        String[] words = sentence.split(" ");
        ArrayList<String> reversedWords = new ArrayList<>();

        for (String word : words) {
            if (!reverseWord(word).isBlank())
                reversedWords.add(reverseWord(word));
        }

        return buildNewSentence(reversedWords, sentence);
    }


    public static String buildNewSentence(ArrayList<String> reversedWords, String sentence) {
        StringBuilder reversedWordsString = new StringBuilder();
        for (String reversedWord : reversedWords) {
            reversedWordsString.append(reversedWord);
        }
        String[] reversedWordsArr = reversedWordsString.toString().split("");


        String[] letters = sentence.split("");
        ArrayList<Integer> placeOfLetters = new ArrayList<>();
        String[] newSentenceArr = new String[letters.length];
        StringBuilder newSentence = new StringBuilder();

        for (int i = 0; i < letters.length; i++) {
            if (!StringUtils.containsWhitespace(letters[i])) {
                placeOfLetters.add(i);
            }
        }

        for (int i = 0; i < placeOfLetters.size(); i++) {
            newSentenceArr[placeOfLetters.get(i)] = reversedWordsArr[i];
        }

        for (String s : newSentenceArr) {
            newSentence.append(Objects.requireNonNullElse(s, " "));
        }

        return newSentence.toString();

    }

    public static String reverseWord(String word) {
        ArrayList<String> reversedWord = new ArrayList<>();
        String[] letters = word.trim().split("");

        for (int i = letters.length - 1; i > -1; i--) {
            String letter = letters[i];
            if (StringUtils.isAlphanumeric(letter) & !NumberUtils.isNumber(letter)) {
                reversedWord.add(letter);
            }
        }

        int z = 0;
        for (int j = 0; j < letters.length; j++) {
            String letter = letters[j];
            if (StringUtils.isAlphanumeric(letter) & !NumberUtils.isNumber(letter)) {
                if ((reversedWord.size() > z)) {
                    letters[j] = reversedWord.get(z);
                    z++;
                }
            }
        }

        return makeArrayToString(letters);
    }

    public static String makeArrayToString(String[] letters) {
        StringBuilder word = new StringBuilder();
        for (String letter : letters) {
            word.append(letter);
        }
        return word.toString().trim();
    }
}