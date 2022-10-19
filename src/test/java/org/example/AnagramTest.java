package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {

    private Anagram anagram = new Anagram();


    @Test
    void reverseText_testReverse_whenTextInput() {
        String actual = anagram.reverseText("   abcd -o=p- efgh");
        String expected = "   dcba -p=o- hgfe";
        assertEquals(expected, actual);

    }

    @Test
    void reverseText_testNull_whenNullInput() {
        assertThrows(NullPointerException.class, () -> anagram.reverseText(null));

    }




    @Test
    void reverseText_testEmpty_whenEmptyInput() {
        String actual = anagram.reverseText("");
        String expected = "";
        assertEquals(expected, actual);

    }

    @Test
    void reverseText_testSingleSpace_whenSingleSpaceInput() {
        String actual = anagram.reverseText(" ");
        String expected = " ";
        assertEquals(expected, actual);

    }

    @Test
    void reverseText_testSeveralSpace_whenSeveralSpaceInput() {
        String actual = anagram.reverseText("   ");
        String expected = "   ";
        assertEquals(expected, actual);

    }

    @Test
    void reverseText_testSingleChar_whenSingleCharacterInput() {
        String actual = anagram.reverseText("a");
        String expected = "a";
        assertEquals(expected, actual);

    }

    @Test
    void reverseText_testMultipleLetter_whenMultipleSameLetterInput() {
        String actual = anagram.reverseText("aaaa");
        String expected = "aaaa";
        assertEquals(expected, actual);

    }

    @Test
    void reverseText_testSameLetter_whenSameLetterInLowerAndUpperCasesMixedInput() {
        String actual = anagram.reverseText("AaAAaaAa");
        String expected = "aAaaAAaA";
        assertEquals(expected, actual);

    }

    @Test
    void reverseText_testWord_whenWordWithDifferentLettersInput() {
        String actual = anagram.reverseText("poINt");
        String expected = "tNIop";
        assertEquals(expected, actual);

    }

    @Test
    void reverseText_testSymbols_whenOnlySymbolsInput() {
        String actual = anagram.reverseText("!@#$%^&*?");
        String expected = "!@#$%^&*?";
        assertEquals(expected, actual);

    }

    @Test
    void reverseText_testWords_whenSeveralWordsInput() {
        String actual = anagram.reverseText("My Points");
        String expected = "yM stnioP";
        assertEquals(expected, actual);

    }

}
