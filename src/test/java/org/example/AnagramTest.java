package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    Anagram anagram;

    @BeforeEach
    void setAnagram() {
        anagram = new Anagram();
    }

    @DisplayName("Test Anagram.reverseText() by null")
    @Test
    void test_Null() {
        assertThrows(NullPointerException.class, () -> {
            anagram.reverseText(null);
        });

    }

    @DisplayName("Test Anagram.reverseText() ")
    @Test
    void test_Reverse_Text() {
        String inputSentence = "   abcd -o=p- efgh";
        String resultSentence = "   dcba -p=o- hgfe";
        assertEquals(resultSentence, anagram.reverseText(inputSentence));

    }


    @DisplayName("Test Anagram.reverseText() by empty String")
    @Test
    void test_Empty_Input() {

        String inputSentence = "";
        String resultSentence = "";
        assertEquals(resultSentence, anagram.reverseText(inputSentence));

    }

    @DisplayName("Test Anagram.reverseText() by single space")
    @Test
    void test_Single_Space_Input() {

        String inputSentence = " ";
        String resultSentence = " ";
        assertEquals(resultSentence, anagram.reverseText(inputSentence));

    }

    @DisplayName("Test Anagram.reverseText() by several space")
    @Test
    void test_Several_Space_Input() {

        String inputSentence = "     ";
        String resultSentence = "     ";
        assertEquals(resultSentence, anagram.reverseText(inputSentence));

    }

    @DisplayName("Test Anagram.reverseText() by single character")
    @Test
    void test_Single_Character_Input() {

        String inputSentence = "a";
        String resultSentence = "a";
        assertEquals(resultSentence, anagram.reverseText(inputSentence));

    }

    @DisplayName("Test Anagram.reverseText() by multiple same letter")
    @Test
    void test_Multiple_Same_Letter_Input() {

        String inputSentence = "aaaa";
        String resultSentence = "aaaa";
        assertEquals(resultSentence, anagram.reverseText(inputSentence));

    }

    @DisplayName("Test Anagram.reverseText() by same character in lower and upper cases mixed")
    @Test
    void test_Same_Letter_In_Lower_And_Upper_Cases_Mixed_Input() {

        String inputSentence = "AaAAaaAa";
        String resultSentence = "aAaaAAaA";
        assertEquals(resultSentence, anagram.reverseText(inputSentence));

    }

    @DisplayName("Test Anagram.reverseText() by a word with different letters")
    @Test
    void test_Word_With_Different_Letters() {
        String inputSentence = "poINt";
        String resultSentence = "tNIop";
        assertEquals(resultSentence, anagram.reverseText(inputSentence));

    }

    @DisplayName("Test Anagram.reverseText() by only symbols")
    @Test
    void test_OnLy_Symbols() {
        String inputSentence = "!@#$%^&*?";
        String resultSentence = "!@#$%^&*?";
        assertEquals(resultSentence, anagram.reverseText(inputSentence));

    }

    @DisplayName("Test Anagram.reverseText() by several words")
    @Test
    void test_Several_Words() {
        String inputSentence = "My Points";
        String resultSentence = "yM stnioP";
        assertEquals(resultSentence, anagram.reverseText(inputSentence));

    }


}
