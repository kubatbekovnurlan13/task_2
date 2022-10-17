package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    void null_testNull_whenNullInput() {
        assertThrows(NullPointerException.class, () -> anagram.reverseText(null));

    }

    @Test
    void reverseText_testReverse_whenTextInput() {
        String actual = anagram.reverseText("   abcd -o=p- efgh");
        String expected = "   dcba -p=o- hgfe";
        assertEquals(expected, actual);

    }


    @Test
    void empty_testEmpty_whenEmptyInput() {
        String actual = anagram.reverseText("");
        String expected = "";
        assertEquals(expected, actual);

    }

    @Test
    void single_testSingle_whenSingleSpaceInput() {
        String actual = anagram.reverseText(" ");
        String expected = " ";
        assertEquals(expected, actual);

    }

    @Test
    void several_testSeveral_whenSeveralSpaceInput() {
        String actual = anagram.reverseText("   ");
        String expected = "   ";
        assertEquals(expected, actual);

    }

    @Test
    void singleChar_testSingleChar_whenSingleCharacterInput() {
        String actual = anagram.reverseText("a");
        String expected = "a";
        assertEquals(expected, actual);

    }

    @Test
    void multiple_testMultiple_whenMultipleSameLetterInput() {
        String actual = anagram.reverseText("aaaa");
        String expected = "aaaa";
        assertEquals(expected, actual);

    }

    @Test
    void sameLetter_testSameLetter_whenSameLetterInLowerAndUpperCasesMixedInput() {
        String actual = anagram.reverseText("AaAAaaAa");
        String expected = "aAaaAAaA";
        assertEquals(expected, actual);

    }

    @Test
    void word_testWord_whenWordWithDifferentLettersInput() {
        String actual = anagram.reverseText("poINt");
        String expected = "tNIop";
        assertEquals(expected, actual);

    }

    @Test
    void symbols_testSymbols_whenOnlySymbolsInput() {
        String actual = anagram.reverseText("!@#$%^&*?");
        String expected = "!@#$%^&*?";
        assertEquals(expected, actual);

    }

    @Test
    void words_testWords_whenSeveralWordsInput() {
        String actual = anagram.reverseText("My Points");
        String expected = "yM stnioP";
        assertEquals(expected, actual);

    }

}
