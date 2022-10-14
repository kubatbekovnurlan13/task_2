package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    void testNull_testForNullInput() {
        assertThrows(NullPointerException.class, () -> {
            anagram.reverseText(null);
        });

    }

    @Test
    void testReverse_testForReversingText() {
        String actual = anagram.reverseText("   abcd -o=p- efgh");
        String expected = "   dcba -p=o- hgfe";
        assertEquals(expected, actual);

    }


    @Test
    void testEmpty_testForEmptyInput() {
        String actual = anagram.reverseText("");
        String expected = "";
        assertEquals(expected, actual);

    }

    @Test
    void testSingle_testForSingleSpaceInput() {
        String actual = anagram.reverseText(" ");
        String expected = " ";
        assertEquals(expected, actual);

    }

    @Test
    void testSeveral_testForSeveralSpaceInput() {
        String actual = anagram.reverseText("   ");
        String expected = "   ";
        assertEquals(expected, actual);

    }

    @Test
    void testSingleChar_testForSingleCharacterInput() {
        String actual = anagram.reverseText("a");
        String expected = "a";
        assertEquals(expected, actual);

    }

    @Test
    void testMultiple_testForMultipleSameLetterInput() {
        String actual = anagram.reverseText("aaaa");
        String expected = "aaaa";
        assertEquals(expected, actual);

    }

    @Test
    void testSameLetter_testForSameLetterInLowerAndUpperCasesMixedInput() {
        String actual = anagram.reverseText("AaAAaaAa");
        String expected = "aAaaAAaA";
        assertEquals(expected, actual);

    }

    @Test
    void testWord_testForWordWithDifferentLetters() {
        String actual = anagram.reverseText("poINt");
        String expected = "tNIop";
        assertEquals(expected, actual);

    }

    @Test
    void testSymbols_testForOnlySymbols() {
        String actual = anagram.reverseText("!@#$%^&*?");
        String expected = "!@#$%^&*?";
        assertEquals(expected, actual);

    }

    @Test
    void testWords_testForSeveralWords() {
        String actual = anagram.reverseText("My Points");
        String expected = "yM stnioP";
        assertEquals(expected, actual);

    }

}
