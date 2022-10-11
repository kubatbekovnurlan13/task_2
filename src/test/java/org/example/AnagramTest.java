package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    void test_Null() {
        assertThrows(NullPointerException.class, () -> {
            anagram.reverseText(null);
        });

    }

    @Test
    void test_Reverse_Text() {
        String actual = anagram.reverseText("   abcd -o=p- efgh");
        String expected = "   dcba -p=o- hgfe";
        assertEquals(expected, actual);

    }


    @Test
    void test_Empty_Input() {
        String actual = anagram.reverseText("");
        String expected = "";
        assertEquals(expected, actual);

    }

    @Test
    void test_Single_Space_Input() {
        String actual = anagram.reverseText(" ");
        String expected = " ";
        assertEquals(expected, actual);

    }

    @Test
    void test_Several_Space_Input() {
        String actual = anagram.reverseText("   ");
        String expected = "   ";
        assertEquals(expected, actual);

    }

    @Test
    void test_Single_Character_Input() {
        String actual = anagram.reverseText("a");
        String expected = "a";
        assertEquals(expected, actual);

    }

    @Test
    void test_Multiple_Same_Letter_Input() {
        String actual = anagram.reverseText("aaaa");
        String expected = "aaaa";
        assertEquals(expected, actual);

    }

    @Test
    void test_Same_Letter_In_Lower_And_Upper_Cases_Mixed_Input() {
        String actual = anagram.reverseText("AaAAaaAa");
        String expected = "aAaaAAaA";
        assertEquals(expected, actual);

    }

    @Test
    void test_Word_With_Different_Letters() {
        String actual = anagram.reverseText("poINt");
        String expected = "tNIop";
        assertEquals(expected, actual);

    }

    @Test
    void test_OnLy_Symbols() {
        String actual = anagram.reverseText("!@#$%^&*?");
        String expected = "!@#$%^&*?";
        assertEquals(expected, actual);

    }

    @Test
    void test_Several_Words() {
        String actual = anagram.reverseText("My Points");
        String expected = "yM stnioP";
        assertEquals(expected, actual);

    }

}
