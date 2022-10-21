package org.example;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.ArrayList;
import java.util.Objects;

public class Anagram {
    public String reverseText(String sentence) {

        String[] words = sentence.split(" ");
        ArrayList<String> reversedWords = new ArrayList<>();

        for (String word : words) {
            if (!reverseWord(word).isBlank())
                reversedWords.add(reverseWord(word));
        }

        return buildNewSentence(reversedWords, sentence);

    }


    private String buildNewSentence(ArrayList<String> reversedWords, String sentence) {
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

        for (String  letter : newSentenceArr) {
            newSentence.append(Objects.requireNonNullElse(letter, " "));
        }

        return newSentence.toString();

    }

    private String reverseWord(String word) {
        ArrayList<String> reversedWord = new ArrayList<>();
        String[] letters = word.trim().split("");

        for (int i = letters.length - 1; i > -1; i--) {
            String letter = letters[i];
            if (StringUtils.isAlphanumeric(letter) & !NumberUtils.isNumber(letter)) {
                reversedWord.add(letter);
            }
        }

        int counter = 0;
        for (int j = 0; j < letters.length; j++) {
            String letter = letters[j];
            if (StringUtils.isAlphanumeric(letter) & !NumberUtils.isNumber(letter)) {
                if ((reversedWord.size() > counter)) {
                    letters[j] = reversedWord.get(counter);
                    counter++;
                }
            }
        }

        return makeArrayToString(letters);

    }

    private String makeArrayToString(String[] letters) {
        StringBuilder word = new StringBuilder();
        for (String letter : letters) {
            word.append(letter);
        }
        return word.toString().trim();

    }
}
