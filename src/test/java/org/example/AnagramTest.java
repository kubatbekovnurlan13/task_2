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

    @DisplayName("Test Anagram.reverseText()")
    @Test
    void reverseText() {
        String inputSentence =  "   abcd -o=p- efgh";
        String resultSentence = "   dcba -p=o- hgfe";
        assertEquals(resultSentence, anagram.reverseText(inputSentence));
        System.out.println("This is Test !");
    }
}
