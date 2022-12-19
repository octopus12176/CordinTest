package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    char[] input = {'o','l','l','e','h'};
    char[] expected = {'h','e','l','l','o'};

    @Test
    void reverseString() {
        ReverseString reverseString = new ReverseString();
        char [] output = reverseString.reverseString(input);
        Assertions.assertEquals(output, input);;
    }
}